package com.example.AdditionApp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText editText1, editText2;
ImageView imageView1 = findViewById(R.id.imageView1);
ImageButton imageButton1 =findViewById(R.id.imageButton1);
TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText1);
editText2 = findViewById(R.id.editText2);
textView1 = findViewById(R.id.textView1);


//click function
        imageButton1.setOnClickListener(this::onClick);
}
    private void onClick(View view) {
// accept values from edit text and add it
        double num1 = Integer.parseInt(editText1.getText().toString());
        Log.v("Number 1=", editText1.getText().toString());
        double num2 = Integer.parseInt(editText2.getText().toString());
        Log.v("Number 2=", editText2.getText().toString());

        double answer = (num1 + num2);

//display value to text view
        textView1.setText(String.valueOf(answer));
        Log.v("Sum =", textView1.getText().toString());


    }
}