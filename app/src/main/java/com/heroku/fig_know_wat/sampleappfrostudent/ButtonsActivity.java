package com.heroku.fig_know_wat.sampleappfrostudent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.ToggleButton;

/**
 * Created by Alex on 22/12/15.
 */
public class ButtonsActivity extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    private Button button;
    private ImageButton imageButton;
    private ToggleButton toggleButton;
    private CheckBox checkBox;
    private RadioButton radioButton1;
    private RadioButton radioButton2;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);
        //находим наши кнопки
        button = (Button) findViewById(R.id.btn_simple);
        imageButton = (ImageButton) findViewById(R.id.btn_image);
        toggleButton = (ToggleButton) findViewById(R.id.btn_toggle);
        checkBox = (CheckBox) findViewById(R.id.checkbox_sample);
        radioButton1 = (RadioButton) findViewById(R.id.radio_btn_1);
        radioButton2 = (RadioButton) findViewById(R.id.radio_btn_2);

        //будет использовать TextView для отображения информации о нажатой кнопке
        textView = (TextView) findViewById(R.id.buttons_text_view);

        //добавляем обработчики нажатий для наших кнопок
        button.setOnClickListener(this);
        imageButton.setOnClickListener(this);
        toggleButton.setOnClickListener(this);
        radioButton1.setOnClickListener(this);
        radioButton2.setOnClickListener(this);

        //обратите внимание, что для CheckBox мы используем другой обработчки
        checkBox.setOnCheckedChangeListener(this);
    }


    @Override
    public void onClick(View view) {
        //ищем нашу кнопку используя id
        switch (view.getId()) {
            case R.id.btn_simple:
                textView.setText("Click on button");
                break;

            case R.id.btn_image:
                textView.setText("Click on image button");
                break;

            case R.id.btn_toggle:
                //проверяем включена ли наша ToggleButton
                if (toggleButton.isChecked()) {
                    textView.setText("Click on toggle button. Toggle button is ON");
                } else {
                    textView.setText("Click on toggle button. Toggle button is OFF");
                }
                break;

            case R.id.radio_btn_1:
                textView.setText("Click on radio button 1");
                break;

            case R.id.radio_btn_2:
                textView.setText("Click on radio button 2");
                break;
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        //проверяем выставлен ли фраг в нашем CheckBox
        if (isChecked) {
            textView.setText("CheckBox включен");
        } else {
            textView.setText("CheckBox выключен");
        }
    }
}
