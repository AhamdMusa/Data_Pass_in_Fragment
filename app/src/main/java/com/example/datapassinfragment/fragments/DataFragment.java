package com.example.datapassinfragment.fragments;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.datapassinfragment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DataFragment extends Fragment {
    private TextView nameTV, phoneTV;
    private Context context;


    public DataFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_data, container, false);
       init(view);
        return view;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.context=context;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        DataPass dataPass= (DataPass) getArguments().getSerializable("data");
        nameTV.setText(dataPass.getName());
        phoneTV.setText(dataPass.getPhone());
    }
    private void init(View view) {
        nameTV=view.findViewById(R.id.data_name_tv);
        phoneTV=view.findViewById(R.id.data_phone_tv);
    }
}
