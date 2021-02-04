package com.example;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pepperfry.R;
import com.google.android.material.tabs.TabLayout;

public class AlertsActivity extends AppCompatActivity {
    private ImageView mIvBack;
    private TextView mTvNotification;
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alerts);
        initViews();
        setViewPagerAdapter();
    }

    private void setViewPagerAdapter() {
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(),
                FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mViewPager.setAdapter(viewPagerAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
    }

    private void initViews() {
        mIvBack = findViewById(R.id.ivback);
        mTvNotification = findViewById(R.id.TvNotification);
        mTabLayout = findViewById(R.id.TabLayout);
        mViewPager = findViewById(R.id.ViewPager);
    }
}