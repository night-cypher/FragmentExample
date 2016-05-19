package com.example.questdot.fragmentexample;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by HP on 19/5/2016.
 */
public class PlaceHolder2Fragment extends Fragment {

    public PlaceHolder2Fragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_two,container,false);

        rootView.findViewById(R.id.button2).setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                getFragmentManager().popBackStack();
            }
        });

        return rootView;
    }
}
