package com.example.jun.MultiTypeAdapter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.jun.MultiTypeAdapter.MultiAdapterForListView.ListViewWithMultiTypeActivity;
import com.example.jun.MultiTypeAdapter.MultiAdapterForRecyclerView.RecycleViewWithMultiTypeActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickForRecycleView(View view){
        startActivity(new Intent(this,RecycleViewWithMultiTypeActivity.class));
    }

    public void onClickForListView(View view){
        startActivity(new Intent(this,ListViewWithMultiTypeActivity.class));
    }
}
