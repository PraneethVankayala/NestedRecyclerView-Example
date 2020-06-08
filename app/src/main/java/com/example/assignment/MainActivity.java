package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.assignment.Models.ParentModel;
import com.example.assignment.Network.GetService;
import com.example.assignment.Network.RetrofitClientInstance;
import com.example.assignment.Views.ParentAdapter;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    ParentAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GetService service = RetrofitClientInstance.getRetrofitInstance().create(GetService.class);

        Call<List<ParentModel>> call= service.getAllList();
        call.enqueue(new Callback<List<ParentModel>>() {
            @Override
            public void onResponse(Call<List<ParentModel>> call, Response<List<ParentModel>> response) {
                Log.i("Hi",response.body().toString());
                getList(response.body());
            }

            @Override
            public void onFailure(Call<List<ParentModel>> call, Throwable t) {
                Log.i("Hi","I Love U");
            }
        });
    }

    private void getList(List<ParentModel> list){
        recyclerView = findViewById(R.id.recycler);
        adapter = new ParentAdapter(this, (ArrayList<ParentModel>) list);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}
