package com.example.datapassinfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.datapassinfragment.fragments.DataFragment;
import com.example.datapassinfragment.fragments.DataPass;
import com.example.datapassinfragment.fragments.Registration;
import com.example.datapassinfragment.inter.work;

public class MainActivity extends AppCompatActivity implements work {
    private FragmentManager fm;
    private FragmentTransaction ft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fm=getSupportFragmentManager();
        ft=fm.beginTransaction();
        Registration registration=new Registration();
        ft.replace(R.id.main_frame,registration);
        ft.commit();


    }

    @Override
    public void datapass(DataPass dataPass) {
        fm=getSupportFragmentManager();
        ft=fm.beginTransaction();
        DataFragment dataFragment=new DataFragment();
        ft.replace(R.id.main_frame,dataFragment);
        ft.commit();
        Bundle bundle=new Bundle();
        bundle.putSerializable("data",dataPass);
        dataFragment.setArguments(bundle);

    }
}
