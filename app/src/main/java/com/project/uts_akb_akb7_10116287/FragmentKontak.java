package com.project.uts_akb_akb7_10116287;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */

    /* 23 Mei 2019
        10116287
        Vanadia Aviandi
        AKB 7
     */
public class FragmentKontak extends Fragment {

    View v;


    public FragmentKontak() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v= inflater.inflate(R.layout.fragment_fragment_kontak2, container, false);
        return v;
    }

}
