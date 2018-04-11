package com.vnpt.day2_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lvContact;
    List<Contact> listContact = new ArrayList<>();
    ContactAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvContact = findViewById(R.id.lvContact);

        //B1: Data
        initData();

        //B2: Adapter
        adapter = new ContactAdapter(listContact, this);

        //B3:
        lvContact.setAdapter(adapter);


        //Click listview
        lvContact.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Contact contact = listContact.get(position);
                Toast.makeText(MainActivity.this, contact.getUsername(), Toast.LENGTH_SHORT).show();
            }
        });

    }


    private void initData() {
        listContact.add(new Contact("Nguyen Van A","09000000",R.drawable.ava1));
        listContact.add(new Contact("Nguyen Van B","09000001",R.drawable.ava2));
        listContact.add(new Contact("Nguyen Van C","09000002",R.drawable.ava3));
        listContact.add(new Contact("Nguyen Van D","09000003",R.drawable.ava4));
        listContact.add(new Contact("Nguyen Van E","09000004",R.drawable.ava1));
        listContact.add(new Contact("Nguyen Van F","09000005",R.drawable.ava2));
        listContact.add(new Contact("Nguyen Van G","09000006",R.drawable.ava3));
        listContact.add(new Contact("Nguyen Van H","09000007",R.drawable.ava4));
        listContact.add(new Contact("Nguyen Van I","09000008",R.drawable.ava1));
        listContact.add(new Contact("Nguyen Van J","09000009",R.drawable.ava2));
        listContact.add(new Contact("Nguyen Van K","09000010",R.drawable.ava1));
        listContact.add(new Contact("Nguyen Van L","09000011",R.drawable.ava4));
        listContact.add(new Contact("Nguyen Van M","09000011",R.drawable.ava4));
        listContact.add(new Contact("Nguyen Van N","09000011",R.drawable.ava4));

    }
}
