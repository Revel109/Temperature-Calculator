package com.wordpress.revelyusuf.tempconvapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class AppActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);

        final EditText get_value=(EditText) findViewById(R.id.textbox);
        final TextView show_value=(TextView) findViewById(R.id.result);
        final RadioButton cel2far=(RadioButton) findViewById(R.id.c2f);
        final RadioButton far2cel=(RadioButton) findViewById(R.id.f2c);
        final Button btn=(Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                double org_value = new Double(get_value.getText().toString());

                if (far2cel.isChecked())
                    org_value= abstractprogram.from_celsius_to_farenheit(org_value);

                else
                    org_value= abstractprogram.from_celsius_to_farenheit(org_value);





                String x="Error.Please Enter a Temperature";
                if (get_value!=null) {
                    show_value.setText(new Double(org_value).toString());
                }

               else show_value.setError("PLease Enter Temperature");


                Button btn = (Button)findViewById(R.id.reset);
                btn.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View view)
                    {
                        get_value.setText(" ");
                        show_value.setText(" ");

                    }
                });
            }

        } );
    }
    public void hideKeyboard(View view){
        InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

}
