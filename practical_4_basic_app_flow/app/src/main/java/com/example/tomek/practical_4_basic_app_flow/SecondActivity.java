package com.example.tomek.practical_4_basic_app_flow;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.i(getResources().getString(R.string.LOGCAT_TAG), "SA onCreate: I'm being called");

        TextView textView = (TextView) findViewById(R.id.secondtext);


        Intent intent = getIntent();
        String msg = intent.getStringExtra("msg");
        int randint = intent.getIntExtra("randint", 0);
        textView.setText(msg);
        textView.append(String.valueOf(randint));
    }

    public void toFirst(View view) {
        Log.i(getResources().getString(R.string.LOGCAT_TAG), "toFirst: clicked on me");

        Intent intent = new Intent(SecondActivity.this, FirstActivity.class);
        TextView textView = findViewById(R.id.secondtext);

        intent.putExtra("msg", textView.getText().toString());
        setResult(Activity.RESULT_OK, intent);
        finish();

    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.i(getResources().getString(R.string.LOGCAT_TAG), "SA onResume: I'm being called");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(getResources().getString(R.string.LOGCAT_TAG), "SA onRestart: I'm being called");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(getResources().getString(R.string.LOGCAT_TAG), "SA onDestroy: I'm being called");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(getResources().getString(R.string.LOGCAT_TAG), "SA onStop: I'm being called");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(getResources().getString(R.string.LOGCAT_TAG), "SA onPause: I'm being called");

    }
}
