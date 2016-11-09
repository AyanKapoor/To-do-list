package com.example.ayankapoor.todolist3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Ayankapoor on 09/11/16.
 */
public class addit extends AppCompatActivity {

    Button add;
    EditText e1;
    EditText e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        add=(Button)findViewById(R.id.button2);
    }


    public void addin(View v)
    {
            String title=e1.getText().toString();
            String desc=e2.getText().toString();
        Intent intent=new Intent(getApplicationContext(),MyActivity.class);
        intent.putExtra("title",title);
        intent.putExtra("description",desc);
        startActivityForResult(intent,1);

    }
}
