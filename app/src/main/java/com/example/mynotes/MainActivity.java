package com.example.mynotes;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mynotes.utility.NoteAdapter;
import com.example.mynotes.utility.NotePage;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private FloatingActionButton add;

    private ArrayList<NotePage> notes;
    private RecyclerView recyclerView;
    private NoteAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createDataSet();
        init();

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Notes.class);
                startActivity(intent);
            }
        });
    }

    public void init() {
        add = (FloatingActionButton) findViewById(R.id.addNote);

        recyclerView= (RecyclerView) findViewById(R.id.container);
        adapter=new NoteAdapter(notes);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    void createDataSet() {
        notes = new ArrayList<NotePage>();        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
        notes.add(new NotePage("dfhksdhf", "dhfksdahfkjsdahkfhsdkjfhsadkhfsdafhsdkhfkjsahf", 123123));
    }


}