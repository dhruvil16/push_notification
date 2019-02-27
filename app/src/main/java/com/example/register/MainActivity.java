package com.example.register;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText phonenumber;
    String ph;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phonenumber = findViewById(R.id.phone_number);

        ph = phonenumber.getText().toString();



    }

    public void sendPhoneNumber(View view) {


        if(ph.equals(" "))
        {

        }
        else{

        LayoutInflater layoutInflaterAndroid = LayoutInflater.from(this);
        View mView = layoutInflaterAndroid.inflate(R.layout.dialog, null);
        AlertDialog.Builder alertDialogBuilderUserInput = new AlertDialog.Builder(this);
        alertDialogBuilderUserInput.setView(mView);

        final EditText mPhoneNumber = (EditText) mView.findViewById(R.id.otp);

        alertDialogBuilderUserInput
                .setCancelable(false)
                .setTitle("Register")

                .setPositiveButton("Send", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogBox, int id) {
                        String phone_number = mPhoneNumber.getText().toString();

                        if(phone_number.equals(""))
                        {
                            // again open dialog and
                        }

                        // send phone number and password
                    }


                });

        AlertDialog alertDialogAndroid = alertDialogBuilderUserInput.create();
        alertDialogAndroid.show();

        }
    }
}
