package com.example;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return AllNotificationFragment.newInstance();
            case 1:
                return OrderRelatedFragment.newInstance();
        }
        return null;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String PageName = "ALL";
        switch (position) {
            case 0:
                PageName = "ALL";
                break;
            case 1:
                PageName = "ORDER RELATED";
                break;
        }
        return PageName;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
