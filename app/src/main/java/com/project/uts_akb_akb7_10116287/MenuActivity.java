package com.project.uts_akb_akb7_10116287;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

    /* 23 Mei 2019
        10116287
        Vanadia Aviandi
        AKB 7
     */

public class MenuActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;

    private FragmentProfile fragmentProfile;
    private FragmentKontak fragmentKontak;
    private FragmentDaftar fragmentDaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        tabLayout = (TabLayout) findViewById(R.id.tab_layout_id);
        viewPager = (ViewPager) findViewById(R.id.screen_view_pager);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.AddFragment(new FragmentProfile(), "Profile");
        adapter.AddFragment(new FragmentKontak(),"Kontak");
        adapter.AddFragment(new FragmentDaftar(),"Daftar Teman");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_profile);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_kontak);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_daftar);
    }
}
