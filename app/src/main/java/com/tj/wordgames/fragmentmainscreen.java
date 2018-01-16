package com.tj.wordgames;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by tj on 1/11/18.
 */

public class fragmentmainscreen extends Fragment {
    ActivityComs mActivityComs;

    EditText editText;
    Button btnClear;
    Button btnSpeak;
    Button btnAdd;
    ListView listView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_layout_main, container, false);

        editText = (EditText) view.findViewById(R.id.editText);
        btnClear = (Button) view.findViewById(R.id.btnClear);
        btnSpeak = (Button) view.findViewById(R.id.btnSpeak);
        btnAdd = (Button) view.findViewById(R.id.btnAdd);
        ListView listView = (ListView) view.findViewById(R.id.listView);


        btnSpeak.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                String tempWords = editText.getText().toString();
                mActivityComs.speak(tempWords);
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                editText.setText("");
            }
            });

        btnAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(editText != null){
                    // Do something
                } else{
                    Toast.makeText(getActivity(), "Enter text", Toast.LENGTH_SHORT).show();
                }
            }
        });

        return view;
    }
        // This method is called when fragment is attached to activity
        @Override
        public void onAttach(Activity activity){
            super.onAttach(activity);
            // connects the object to the activity that called the fragment
            mActivityComs = (ActivityComs) activity;
        }
}
