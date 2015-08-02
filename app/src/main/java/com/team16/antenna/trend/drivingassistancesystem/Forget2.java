package com.team16.antenna.trend.drivingassistancesystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;


public class Forget2 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget2);
    }







    //when button Back is clicked
    public void onClickButtonBackForget(View view){
        super.onBackPressed();
    }

    //When the textView SEND is clicked
    public void onClickButtonLoginForget(View view){
        Intent intent=new Intent(Forget2.this,Login.class);
        startActivity(intent);
    }
}
