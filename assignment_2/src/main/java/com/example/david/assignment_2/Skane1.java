package com.example.david.assignment_2;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.widget.ImageButton;
import java.util.zip.Inflater;

public class Skane1 extends Fragment {
ImageButton button;


    public Skane1(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View v = inflater.inflate(R.layout.fragment_skane_1, container, false);


        button = (ImageButton)v.findViewById(R.id.imageButton);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                //switches to fragmentTwo
                FragmentManager fm = getFragmentManager();
                FragmentTransaction fraAct = fm.beginTransaction();
                Skane2 m = new Skane2();
                fraAct.replace(R.id.vadjagvill, m);
                fraAct.commit();
            }
        });
        return v;

    }
}


