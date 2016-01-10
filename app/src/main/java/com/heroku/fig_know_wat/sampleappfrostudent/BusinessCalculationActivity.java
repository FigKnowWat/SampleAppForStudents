package com.heroku.fig_know_wat.sampleappfrostudent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Alex on 26/12/15.
 */
public class BusinessCalculationActivity extends AppCompatActivity implements View.OnClickListener {

    private Button calculateButton;
    private EditText revenueEditText;
    private EditText costsEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_calculation);
        calculateButton = (Button) findViewById(R.id.btn_calculaion);
        revenueEditText = (EditText) findViewById(R.id.edit_text_revenue);
        costsEditText = (EditText) findViewById(R.id.edit_text_costs);
        calculateButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_calculaion:
                long revenue = Long.valueOf(revenueEditText.getText().toString());
                long costs = Long.valueOf(costsEditText.getText().toString());


                break;
        }
    }
}
