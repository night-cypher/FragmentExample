package com.example.questdot.fragmentexample;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by HP on 19/5/2016.
 */
public class PlaceHolderFragment extends Fragment {

    public PlaceHolderFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_one,container,false);

        rootView.findViewById(R.id.button).setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction()
                        .addToBackStack(null)
                        .replace(R.id.container, new PlaceHolder2Fragment())
                        .commit();
            }
        });

        return rootView;
    }
}
