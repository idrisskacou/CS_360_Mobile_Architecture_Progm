package com.example.module_three_idriss_kacou;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText nameText;
    private TextView textGreeting;
    private Button SayHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameText = (EditText) findViewById(R.id.nameText);
        textGreeting = (TextView)  findViewById(R.id.textGreeting);
        SayHello = (Button) findViewById(R.id.buttonSayHello);
        SayHello.setEnabled(false);

        nameText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence u, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence u, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable u) {

//                if (u.toString().equals("")){ // if not contain
//                    SayHello.setEnabled(false); // disable sayHello button
//                } else {
//                    SayHello.setEnabled(true); // enable sayHello button
//                }
                // if not contain
                // enable sayHello button
                SayHello.setEnabled(!u.toString().equals("")); // disable sayHello button


            }
        });
    }

    /**
     * Say Hello button will dynamically disable or enable
     * button listen
     * @param v of {@link View]}
     */
    public void setSayHello(View v) {
        String name = nameText.getText().toString();
        if (name.equals("")){
            textGreeting.setText("You must enter a name ");
        }else {
            textGreeting.setText("Hello " + name);
        }
    }
}