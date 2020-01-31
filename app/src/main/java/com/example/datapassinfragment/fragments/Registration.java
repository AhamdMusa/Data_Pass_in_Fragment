package com.example.datapassinfragment.fragments;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.datapassinfragment.R;
import com.example.datapassinfragment.inter.work;

/**
 * A simple {@link Fragment} subclass.
 */
public class Registration extends Fragment {
    private EditText nameET, phoneET;
    private Button send;
    private Context context;
    private work work;


    public Registration() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_registration, container, false);
        init(view);
        return view;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.context=context;
        work= (com.example.datapassinfragment.inter.work) context;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameETE=nameET.getText().toString();
                String phoneETE=phoneET.getText().toString();
                DataPass dataPass=new DataPass(nameETE,phoneETE);
                work.datapass(dataPass);


            }
        });
    }

    private void init(View view) {
        nameET=view.findViewById(R.id.reg_nam_et);
        phoneET=view.findViewById(R.id.reg_phone_et);
        send=view.findViewById(R.id.reg_buttn);

    }

}
