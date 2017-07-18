package com.example.sid.fragment101;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SimpleAddtion extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.activity_main,container,false);

        Button b = (Button) view.findViewById(R.id.btnSubmit);
        final EditText editText = (EditText) view.findViewById(R.id.etNumber);
        final TextView textView = (TextView) view.findViewById(R.id.tvfragment);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(editText.getText().toString());
            }
        });
        return view;
    }

}
