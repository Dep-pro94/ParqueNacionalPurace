package com.example.purace.parquenacionalpurace.adaptador;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.purace.parquenacionalpurace.fragments.ContactosFragment;
import com.example.purace.parquenacionalpurace.fragments.GaleriaDeImagenes;
import com.example.purace.parquenacionalpurace.fragments.InicioFragment;

/**
 * Created by cristhian on 29/06/16.
 */
public class TabsPagerAdapter extends FragmentPagerAdapter {


    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new InicioFragment();
            case 1:
                return new GaleriaDeImagenes();
            case 2:
                return new ContactosFragment();
            default:return null;

        }


    }

    @Override
    public int getCount() {
        return 3;
    }
}

