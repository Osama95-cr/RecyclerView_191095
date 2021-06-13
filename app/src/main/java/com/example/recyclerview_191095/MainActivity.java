package com.example.recyclerview_191095;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerview_191095.Adapter.RecyclerViewAdapter;
import com.example.recyclerview_191095.Modal.Student;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Student> obj = new ArrayList<>();
    RecyclerView r1;
    RecyclerViewAdapter ra1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1 = findViewById(R.id.recyclerview);
        obj.add(new Student("Osama ","191095","BSCS-4C"));
        obj.add(new Student("Umair","190091","BSIT 4A"));
        obj.add(new Student("Maaz","191185","BBA-4E"));
        obj.add(new Student("Zeeshan","191137","BSCYS-3A"));
        ra1= new RecyclerViewAdapter(MainActivity.this,obj);
        r1.setLayoutManager(new LinearLayoutManager(this ));
        r1.setHasFixedSize(true);
        r1.setAdapter(ra1);
    }
}