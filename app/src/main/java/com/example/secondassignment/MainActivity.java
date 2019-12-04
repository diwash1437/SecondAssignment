package com.example.secondassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.secondassignment.Fragments.Areaofcircle;
import com.example.secondassignment.Fragments.Automorphicno;
import com.example.secondassignment.Fragments.PalindromeNo;
import com.example.secondassignment.Fragments.Reverseno;
import com.example.secondassignment.Fragments.Reversestring;
import com.example.secondassignment.Fragments.Sumfragments;

public class MainActivity extends AppCompatActivity {

    Button btnsum,btnareaofcircle,btnreverseofnumber,btnpalindrome,btnautomorphicnumber,btnreverseofstring;
    private String status="f1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnsum=findViewById(R.id.btnadd);
        btnareaofcircle=findViewById(R.id.btnareaofcircle);
        btnreverseofnumber=findViewById(R.id.btnreverseofnumber);
        btnpalindrome=findViewById(R.id.btnpalindrome);


        btnsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                Sumfragments sumfragments=new Sumfragments();
                fragmentTransaction.replace(R.id.fragmentcontainer,sumfragments);
                fragmentTransaction.commit();
            }
        });

        btnareaofcircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                Areaofcircle areaofcircle=new Areaofcircle();
                fragmentTransaction.replace(R.id.fragmentcontainer,areaofcircle);
                fragmentTransaction.commit();
            }
        });

        btnreverseofnumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager  fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                Reverseno reverseno=new Reverseno();
                fragmentTransaction.replace(R.id.fragmentcontainer,reverseno);
                fragmentTransaction.commit();
            }
        });

        btnpalindrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                PalindromeNo palindromeNo=new PalindromeNo();
                fragmentTransaction.replace(R.id.fragmentcontainer,palindromeNo);
                fragmentTransaction.commit();
            }
        });

        btnautomorphicnumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                Automorphicno automorphicno=new Automorphicno();
                fragmentTransaction.replace(R.id.fragmentcontainer,automorphicno);
                fragmentTransaction.commit();
            }
        });


        btnreverseofstring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                Reversestring reversestring=new Reversestring();
                fragmentTransaction.replace(R.id.fragmentcontainer,reversestring);
                fragmentTransaction.commit();

            }
        });

    }


}