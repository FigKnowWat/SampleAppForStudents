package com.heroku.fig_know_wat.sampleappfrostudent;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

/**
 * Created by Alex on 17/12/15.
 */
public class CatalogActivity extends ListActivity implements AdapterView.OnItemClickListener {

    //список элементов для листа
    String[] screens = {"First sample activity", "Buttons activity", "Text fields activity"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //добавляем разметку для активити
        setContentView(R.layout.activity_catalog);
        //добавляем адептер с нашим списком элементов к листу
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, screens));
        //добавляем обработчик нажатий на элементы листа
        getListView().setOnItemClickListener(this);
    }

    //обработчки нажатий на элементы листа
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //используем Intent для открытия новой активити
        Intent intent = new Intent();
        switch (position) {
            //нажание на "First sample activity"
            case 0:
                intent.setClass(this, MainActivity.class);
                break;

            //нажатие на "Buttons activity"
            case 1:
                intent.setClass(this, ButtonsActivity.class);
                break;

            //нажатие на "Text fields activity"
            case 2:
                intent.setClass(this, TextFieldsActivity.class);
                break;
        }
        //открываем выбранную нами активити
        startActivity(intent);
    }
}
