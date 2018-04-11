package com.vnpt.day2_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RCAct extends AppCompatActivity {

    RecyclerView rvContact;
    RCAdapter mAdapter;
    List<Contact> listContact = new ArrayList<>();
    RCAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rc);

        //B1: Set Data
        initData();

        //B2: Create Adapter
        adapter = new RCAdapter(this, listContact);

        //B3: Create layout manager
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,2);

        //B4: Set RecyclerView
        rvContact = findViewById(R.id.rvContact);
        rvContact.setLayoutManager(layoutManager);
        rvContact.setAdapter(adapter);

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
