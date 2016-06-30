package com.example.purace.parquenacionalpurace.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.purace.parquenacionalpurace.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class GaleriaDeImagenes extends Fragment {


    public GaleriaDeImagenes() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_galeria_de_imagenes, container, false);
    }

}
