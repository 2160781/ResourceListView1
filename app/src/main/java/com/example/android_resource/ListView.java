package com.example.android_resource;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import androidx.appcompat.app.AppCompatActivity;

import com.example.android_resource.Activity_facebook;
import com.example.android_resource.R;

public class ListView extends AppCompatActivity {

    android.widget.ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        listView = findViewById(R.id.listview);

        String[] values = new String[] {
                "Facebook", "Instagram", "Twitter", "Youtube",
                "Tumbler", "WhatsApp", "Wechat", "Telegram",
                "Twitch", "Github", "Snapchat", "Viber",
                "Android Rion"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1, values);

        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    Intent intent = new Intent(view.getContext(),
                            Activity_facebook.class);
                    startActivity(intent);
                }
            }
        });
    }
}