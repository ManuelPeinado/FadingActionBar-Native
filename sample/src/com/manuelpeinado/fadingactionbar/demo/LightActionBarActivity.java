package com.manuelpeinado.fadingactionbar.demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.manuelpeinado.fadingactionbar.FadingActionBarHelper;

public class LightActionBarActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FadingActionBarHelper helper = new FadingActionBarHelper()
            .actionBarBackground(R.drawable.ab_background_light)
            .headerLayout(R.layout.header_light)
            .contentLayout(R.layout.activity_scrollview)
            .lightActionBar(true);
        setContentView(helper.createView(this));
        helper.initActionBar(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_menu, menu);
        return true;
    }
}
