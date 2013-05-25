package com.manuelpeinado.fadingactionbar.demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.manuelpeinado.fadingactionbar.FadingActionBarHelper;

public class ScrollViewActivity extends Activity {
    private FadingActionBarHelper mFadingActionBarHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mFadingActionBarHelper = new FadingActionBarHelper(this, R.drawable.ab_background);
        mFadingActionBarHelper.setScrollViewContent(R.layout.header, R.layout.activity_scrollview);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_menu, menu);
        return true;
    }
}
