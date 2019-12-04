package com.example.secondassignment.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.secondassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Automorphicno extends Fragment implements View.OnClickListener {

    Button btnauto;
    TextView tvauto;
    EditText etauto;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_automorphicno, container, false);
        btnauto = view.findViewById(R.id.btnauto);
        tvauto = view.findViewById(R.id.tvauto);
        etauto = view.findViewById(R.id.etauto);
        btnauto.setOnClickListener(this);


        return view;
    }


    @Override
    public void onClick(View v) {
        if (TextUtils.isEmpty(etauto.getText())) {
            etauto.setError("Enter Something ");
            return;
        }

        int num = Integer.parseInt(etauto.getText().toString());
        int sq_num = num * num;
        String str_num = Integer.toString(num);
        String square = Integer.toString(sq_num);
        if (square.endsWith(str_num)) {
            tvauto.setText("Is Automorphic Number.");
        } else {
            tvauto.setText("Not an Automorphic Number.");
        }
    }
}
