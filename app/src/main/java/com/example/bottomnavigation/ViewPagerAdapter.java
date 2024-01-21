package com.example.bottomnavigation;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {
    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new Dashboard();
            case 1:
                return new Location();
            case 2:
                return new Payment();
            case 3:
                return new Profile();
            default:
                return new Dashboard();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
