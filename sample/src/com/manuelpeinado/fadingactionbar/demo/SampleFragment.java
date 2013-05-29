package com.manuelpeinado.fadingactionbar.demo;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.manuelpeinado.fadingactionbar.FadingActionBarHelper;

public class SampleFragment extends Fragment {
    private FadingActionBarHelper mFadingHelper;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return mFadingHelper.createView(inflater);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        mFadingHelper = new FadingActionBarHelper()
            .actionBarBackground(R.drawable.ab_background_light)
            .headerLayout(R.layout.header_light)
            .contentLayout(R.layout.activity_scrollview)
            .lightActionBar(true);
        mFadingHelper.initActionBar(activity);
    }
}
