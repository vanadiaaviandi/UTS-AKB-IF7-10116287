package com.project.uts_akb_akb7_10116287;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */

    /* 23 Mei 2019
        10116287
        Vanadia Aviandi
        AKB 7
     */

public class FragmentProfile extends Fragment {

    View v;
    private List<Model> lstmenu;
    private ViewPager viewMenu;
    private TabLayout indicatorMenu;

    public FragmentProfile() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_profile, container, false);
    }

}
