package com.example.setresult;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
//    public static final String result="wxy";
     private EditText editText4 ,editText5,editText6;
   private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editText4= findViewById(R.id.editText4);
        editText5= findViewById(R.id.editText5);
        editText6= findViewById(R.id.editText6);

       button2=findViewById(R.id.button2);

       Intent intent=getIntent();

      String p= intent.getStringExtra("a");
      editText4.setText(p);

        String q= intent.getStringExtra("b");
        editText5.setText(q);

        String r= intent.getStringExtra("c");
        editText6.setText(r);

       button2.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              String msg=editText4.getText().toString();
              String msg1=editText5.getText().toString();
              String msg2=editText6.getText().toString();
              Intent i=new Intent();
              i.putExtra("MSG",msg);
              i.putExtra("MSG1",msg1);
              i.putExtra("MSG2",msg2);
              setResult(11,i);
          finish();


          }
      });

    }
}