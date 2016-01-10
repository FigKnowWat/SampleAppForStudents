package com.heroku.fig_know_wat.sampleappfrostudent;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Alex on 10/01/16.
 */
public class NotificationActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        findViewById(R.id.btn_toast).setOnClickListener(this);
        findViewById(R.id.btn_alert_dialog).setOnClickListener(this);
        findViewById(R.id.btn_alert_dialog_with_buttons).setOnClickListener(this);
        findViewById(R.id.btn_snackbar).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_toast:
                Toast.makeText(this, "Toast", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btn_alert_dialog:
                AlertDialog.Builder builder = new AlertDialog.Builder(NotificationActivity.this);
                builder.setTitle("AlertDialog Title")
                        .setMessage("AlertDialog message")
                        .setCancelable(false)
                        .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();
                break;

            case R.id.btn_alert_dialog_with_buttons:
                AlertDialog.Builder alertBuilder = new AlertDialog.Builder(NotificationActivity.this);
                alertBuilder.setTitle("AlertDialog Title")
                        .setMessage("AlertDialog message")
                        .setCancelable(false)
                        .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(NotificationActivity.this, "Ok", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(NotificationActivity.this, "Cancel", Toast.LENGTH_SHORT).show();
                            }
                        });
                AlertDialog alertDialog = alertBuilder.create();
                alertDialog.show();
                break;

            case R.id.btn_snackbar:
                Snackbar
                        .make(findViewById(R.id.content_view), "Snackbar message!", Snackbar.LENGTH_LONG)
                        .setAction("Action", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Toast.makeText(NotificationActivity.this, "Snackbar action", Toast.LENGTH_SHORT).show();
                            }
                        }).show();
                break;
        }
    }
}
