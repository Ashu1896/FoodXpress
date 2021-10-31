package com.example.foodxpress;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.foodxpress.Model.Pnr_Details;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;



public class VerifyPhoneActivity extends AppCompatActivity{

   EditText editTextPhone,editTextPnr;
   Button buttonSendOTP;


   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_phone);

        editTextPhone = findViewById(R.id.editTextPhone);
        editTextPnr = findViewById(R.id.editTextPNR);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference table_user = database.getReference("foodexpress");

        buttonSendOTP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final ProgressDialog mDialog = new ProgressDialog(VerifyPhoneActivity.this);
                mDialog.setMessage("Please Wait.....");
                mDialog.show();

             table_user.addValueEventListener(new ValueEventListener() {
                 @Override
                 public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                     if(dataSnapshot.child(editTextPnr.getText().toString()).exists()){

                     mDialog.dismiss();
                     Pnr_Details foodExpress = dataSnapshot.child(editTextPnr.getText().toString()).getValue(Pnr_Details.class);
                     if(foodExpress.getPNR_Number().equals(editTextPnr.getText().toString()))
                     {
                         Toast.makeText(VerifyPhoneActivity.this, "OTP Sended On Your Phone Number !", Toast.LENGTH_SHORT).show();
                     }
                     else
                     {
                         Toast.makeText(VerifyPhoneActivity.this, "OTP Sending Failed !!!", Toast.LENGTH_SHORT).show();
                     }

                 }
                     else
                     {
                         Toast.makeText(VerifyPhoneActivity.this, "PNR is not valid", Toast.LENGTH_SHORT).show();
                     }
                 }

                 @Override
                 public void onCancelled(@NonNull DatabaseError databaseError) {

                 }
             });
            }
        });

        findViewById(R.id.buttonSendOTP).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String phoneNumber = editTextPhone.getText().toString().trim();

                if ((phoneNumber.isEmpty() || phoneNumber.length() < 10)) {
                    editTextPhone.setError("Valid Number is Required");
                    editTextPhone.requestFocus();
                    return;
                }

                Intent verifyOTP = new Intent(VerifyPhoneActivity.this,VerifyOTP.class);
                startActivity(verifyOTP);
            }
        });

    }

    @Override
    protected void onStart() {
      super.onStart();

      if(FirebaseAuth.getInstance().getCurrentUser() !=null) {
          Intent intent = new Intent(this, MainActivity.class);
          intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);

          startActivity(intent);

      }

    }
}