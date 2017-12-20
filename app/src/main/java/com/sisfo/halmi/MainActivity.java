package com.sisfo.halmi;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;

import com.sisfo.halmi.adapter.ViewPagerAdapter;
import com.sisfo.halmi.fragmen.EvaluasiFragmen;
import com.sisfo.halmi.fragmen.RangkumanFragmen;
import com.sisfo.halmi.fragmen.KompetensidasarFragmen;
import com.sisfo.halmi.fragmen.PetakonsepFragmen;
import com.sisfo.halmi.fragmen.MateriFragmen;

public class MainActivity extends AppCompatActivity{

    private TextView mTextMessage;

    private ViewPager viewPager;
    KompetensidasarFragmen homeFragmen;
    RangkumanFragmen dashboardFragmen;
    PetakonsepFragmen notificationFragmen;
    MateriFragmen userFragmen;
    EvaluasiFragmen evaluasiFragmen;
    MenuItem prevMenuItem;



    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_kompetensidasar:
                    viewPager.setCurrentItem(0);
                    return true;
                case R.id.navigation_petakonsep:
                    viewPager.setCurrentItem(1);
                    return true;
                case R.id.navigation_materi:
                    viewPager.setCurrentItem(2);
                    return true;
                case R.id.navigation_rangkuman:
                    viewPager.setCurrentItem(3);
                    return true;
                case R.id.navigation_evaluasi:
                    viewPager.setCurrentItem(4);
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setOffscreenPageLimit(4);
        final BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (prevMenuItem != null) {
                    prevMenuItem.setChecked(false);
                }
                else
                {
                    navigation.getMenu().getItem(0).setChecked(false);
                }
                Log.d("page", "onPageSelected: "+position);
                navigation.getMenu().getItem(position).setChecked(true);
                prevMenuItem = navigation.getMenu().getItem(position);

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        setupViewPager(viewPager);
        //mTextMessage = (TextView) findViewById(R.id.message);

    }

    private void setupViewPager(ViewPager viewPager) {

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        homeFragmen = new KompetensidasarFragmen();
        dashboardFragmen = new RangkumanFragmen();
        notificationFragmen = new PetakonsepFragmen();
        userFragmen = new MateriFragmen();
        evaluasiFragmen = new EvaluasiFragmen();

        adapter.addFragment(homeFragmen);
        adapter.addFragment(notificationFragmen);
        adapter.addFragment(userFragmen);
        adapter.addFragment(dashboardFragmen);
        adapter.addFragment(evaluasiFragmen);

        viewPager.setAdapter(adapter);

    }
}
