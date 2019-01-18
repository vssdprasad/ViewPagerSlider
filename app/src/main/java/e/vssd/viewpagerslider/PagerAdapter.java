package e.vssd.viewpagerslider;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {

    private static final int NUM_PAGES = 5;


    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        return new ScreenSliderFragment();
    }

    @Override
    public int getCount() {
        return NUM_PAGES;
    }
}
