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
public class Sumfragments extends Fragment implements View.OnClickListener {
    EditText etfirst, etsecond;
    Button btnadd;
    TextView tvadd;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view=inflater.inflate(R.layout.fragment_sumfragments,container,false);
       etfirst=view.findViewById(R.id.etfirst);
       etsecond=view.findViewById(R.id.etsecond);
       btnadd=view.findViewById(R.id.btnadd);
       tvadd=view.findViewById(R.id.tvadd);
       btnadd.setOnClickListener(this);
       return view;
    }

    @Override
    public void onClick(View v) {

        if (TextUtils.isEmpty(etfirst.getText()))
        {
            etfirst.setError("Enter Something");
            return;
        }
        if (TextUtils.isEmpty(etsecond.getText()))

        {
        etsecond.setError("Enter something");
        return;
        }
        int first=Integer.parseInt(etfirst.getText().toString());
        int second=Integer.parseInt(etsecond.getText().toString());
        int result=first+second;

        tvadd.setText("Result:"+result);

    }
}
