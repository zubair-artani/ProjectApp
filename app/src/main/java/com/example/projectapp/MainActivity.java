package com.example.projectapp;

import android.provider.ContactsContract;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    CustomAdapter customAdapter;
    ArrayList<Note> notes;
    String uname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void opendialog(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View views = getLayoutInflater().inflate(R.layout.customalert,null);
    }
}
