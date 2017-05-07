package com.kalpana.user.and_session6_assignment61;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**  Code for adding the fragment in acivity **/


        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        SimpleAddition simpleAddition= SimpleAddition.newInstance();
        fragmentTransaction.add(R.id.fragment_container,simpleAddition);
        fragmentTransaction.commit();
    }
}
