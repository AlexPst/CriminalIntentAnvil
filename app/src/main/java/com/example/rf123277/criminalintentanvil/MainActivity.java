package com.example.rf123277.criminalintentanvil;


import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_crime);
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_crime, new CrimeFragment()).commit();
    }
}
