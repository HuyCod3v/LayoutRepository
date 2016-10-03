package com.cod3vlab.layoutrepository.main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.cod3vlab.layoutrepository.R;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<LayoutItem> mLayoutItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvLayouts = (ListView) findViewById(R.id.lvLayouts);

        mLayoutItems = new LayoutManager().init().getLayoutItems();
        ArrayAdapter<LayoutItem> itemsAdapter =
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mLayoutItems);
        lvLayouts.setAdapter(itemsAdapter);

        lvLayouts.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, mLayoutItems.get(position).getActivityClass());
                startActivity(intent);
            }
        });
    }
}
