package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager = getSupportFragmentManager();

    }

    public void add1(View view) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Frag1 frag1 = new Frag1();
        fragmentTransaction.add(R.id.group, frag1);
              fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    public void add2(View view) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Frag2 frag2 = new Frag2();
        fragmentTransaction.add(R.id.group, frag2);
              fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    public void remove1(View view) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Frag3 frag2 = new Frag3();
        fragmentTransaction.add(R.id.group, frag2);
               fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    public void remove2(View view) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Frag2 frag2 = new Frag2();
        fragmentTransaction.remove(frag2);
              fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    public void replace1(View view) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Frag1 frag1 = new Frag1();
        fragmentTransaction.replace(R.id.group,frag1);
              fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}