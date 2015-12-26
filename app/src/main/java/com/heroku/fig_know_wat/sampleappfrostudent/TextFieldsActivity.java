package com.heroku.fig_know_wat.sampleappfrostudent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Alex on 22/12/15.
 */
public class TextFieldsActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textView;
    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_fields);

        textView = (TextView) findViewById(R.id.text_view_input);
        editText = (EditText) findViewById(R.id.simple_edit_text);
        button = (Button) findViewById(R.id.btn_get_text);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_get_text:
                textView.setText(editText.getText().toString());
                break;
        }
    }
}
