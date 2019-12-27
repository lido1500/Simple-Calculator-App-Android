package com.example.tanveersalman.calculator;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Button;

/**
 * Created by Tanveer Salman on 10/24/2016.
 */
public class NewActivity extends Activity {
    private Button btnNewActivity1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newactivity);
        btnNewActivity1 = (Button) findViewById(R.id.btnNewActivity1);
    }
}
