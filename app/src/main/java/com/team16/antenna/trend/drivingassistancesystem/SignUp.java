package com.team16.antenna.trend.drivingassistancesystem;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;


public class SignUp extends ActionBarActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_sign_up);
        }
    //when button DONE is clicked
    public void onClickButtonDone(View view){
        super.onBackPressed();
    }
}
