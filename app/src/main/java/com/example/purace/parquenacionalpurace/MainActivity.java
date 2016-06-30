package com.example.purace.parquenacionalpurace;

import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ImageView;

import com.example.purace.parquenacionalpurace.adaptador.TabsPagerAdapter;

public class MainActivity extends AppCompatActivity implements ActionBar.TabListener{

    TabsPagerAdapter adaptador;

    ViewPager pager;
    ActionBar actionBar;
    String[]titulos={"Inicio","Galeria de Imagenes","Contactos"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        pager=(ViewPager)findViewById(R.id.pager);

        adaptador=new TabsPagerAdapter(getSupportFragmentManager());
        pager.setAdapter(adaptador);

        actionBar=getSupportActionBar();
        actionBar.setHomeButtonEnabled(false);
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        for (String tab:titulos){
            actionBar.addTab(actionBar.newTab().setText(tab).setTabListener(this));
        }

        //agrego el evento swipe viewpager
        pager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                actionBar.setSelectedNavigationItem(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });



    }
//se sincroniza las tab con el swipe
    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        pager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }
}
