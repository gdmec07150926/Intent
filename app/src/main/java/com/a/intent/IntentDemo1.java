package com.a.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IntentDemo1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_demo1);
    }
    public void upper(View v){
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        final String value = bundle.getString("value").toUpperCase();

        Intent intent1 = new Intent();
        intent1.putExtra("result",value);
        setResult(RESULT_OK,intent1);
        finish();
    }
}
