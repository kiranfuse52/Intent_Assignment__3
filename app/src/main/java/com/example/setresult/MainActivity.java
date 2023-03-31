package com.example.setresult;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MainActivity<onActivityResult> extends AppCompatActivity {
    public static final String kiran="xyz";
   public  EditText editText1,editText2,editText3;
   private Button button1;
   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1= findViewById(R.id.editText1);
        editText2=findViewById(R.id.editText2);
        editText3=findViewById(R.id.editText3);
        button1=findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=editText1.getText().toString();
                String name1=editText2.getText().toString();
                String name2=editText3.getText().toString();

                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("a",name);
                intent.putExtra("b",name1);
                intent.putExtra("c",name2);
                startActivityForResult(intent,11);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        String msg=data.getStringExtra("MSG");
        String msg1=data.getStringExtra("MSG1");
        String msg2=data.getStringExtra("MSG2");
        editText1.setText(msg);
        editText2.setText(msg1);
        editText3.setText(msg2);

            }
        }




