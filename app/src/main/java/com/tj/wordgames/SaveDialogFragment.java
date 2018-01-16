package com.tj.wordgames;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by tjdav on 1/16/2018.
 */

public class SaveDialogFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){

        String ttsText;

        Bundle bundle = this.getArguments();
        if(bundle != null){
            ttsText = bundle.getString("text");
        } else {
            ttsText = "No text";
        }

        // Creates an alert dialog object
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        // Gets a layout inflater from the Activity
        LayoutInflater inflater = getActivity().getLayoutInflater();
        // Creates a layout object and inflates the save dialog xml in to it
        View layout = inflater.inflate(R.layout.layout_save_dialog, null);

        EditText editTitle = (EditText) layout.findViewById(R.id.editTitle);
        EditText editTextTTS = (EditText) layout.findViewById(R.id.editTextTTS);

        Button btnSave = (Button) layout.findViewById(R.id.btnSave);
        Button btnCancel = (Button) layout.findViewById(R.id.btnCancel);

        editTextTTS.setText(ttsText);
        //editTextTTS.setEnabled(false);

        editTitle.requestFocus();

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });

        builder.setView(layout);

        return builder.create();
    }
}
