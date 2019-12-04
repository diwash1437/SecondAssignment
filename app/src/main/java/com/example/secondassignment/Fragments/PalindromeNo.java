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
public class PalindromeNo extends Fragment implements  View.OnClickListener {

    private EditText etpal;
    private TextView tvpal;
    private Button btnpal;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_palindrome_no, container, false);
        etpal=view.findViewById(R.id.etpal);
        tvpal=view.findViewById(R.id.tvpal);
        btnpal=view.findViewById(R.id.btnpal);
        btnpal.setOnClickListener(this);
        return view;



    }


    @Override
    public void onClick(View v) {
        if (TextUtils.isEmpty(etpal.getText())) {
            etpal.setError("Enter something");
            return;

        }
        int r,sum=0,temp;
        int n=Integer.parseInt(etpal.getText().toString());

        temp =n;
        while (n > 0)
        {
r=n % 10;
sum= (sum * 10)+r;

n=n/10;
if (temp==sum)
    tvpal.setText("It is palindrome Number");
else
    tvpal.setText("it is Not a palindrome Number");


        }


    }
}