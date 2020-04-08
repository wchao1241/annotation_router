package com.wchao.annotation_router;

import android.app.Activity;
import android.os.Bundle;

import com.xsm.easy.annotation.Route;

@Route(path = "/app/1100")
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
