package com.example.glacalc;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    EditText etOne, etTwo;
    Button btnCalc;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etOne = findViewById(R.id.et_first);
        etTwo = findViewById(R.id.et_second);

        btnCalc = findViewById(R.id.btn_add);

        result = findViewById(R.id.textView);


        result.setVisibility(View.INVISIBLE);

        btnCalc.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                int a = Integer.parseInt(etOne.getText().toString().trim());
                int b = Integer.parseInt(etTwo.getText().toString().trim());
                result.setVisibility(View.VISIBLE);
                result.setText(a+b+"");

            }
        });

    }
}