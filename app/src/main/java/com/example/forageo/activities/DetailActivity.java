package com.example.forageo.activities;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.forageo.R;
import com.example.forageo.adapters.DetailAdapter;
import com.example.forageo.models.DetailModel;

import java.util.ArrayList;
import java.util.List;

public class DetailActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<DetailModel> detailModelList;
    DetailAdapter detailAdapter;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String name = getIntent().getStringExtra("name");

        recyclerView = findViewById(R.id.detail_rec);
        imageView = findViewById(R.id.detail_img);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        detailModelList = new ArrayList<>();
        detailAdapter = new DetailAdapter(detailModelList);
        recyclerView.setAdapter(detailAdapter);

        if (name != null && name.equalsIgnoreCase("Basil")) {
            detailModelList.add(new DetailModel(R.drawable.map1, "Basil-HamiltonCity", "Basil", "4.9", "10:00-16:00", "Tristram Street"));
            detailModelList.add(new DetailModel(R.drawable.map2, "Basil-HamiltonEast", "Basil", "4.9", "10:00-16:00", "Tristram Street"));
            detailModelList.add(new DetailModel(R.drawable.map3, "Basil-Frankton", "Basil", "4.9", "10:00-16:00", "Tristram Street"));
            detailAdapter.notifyDataSetChanged();
        }
        if (name != null && name.equalsIgnoreCase("Mint")) {
            imageView.setImageResource(R.drawable.map4);
            detailModelList.add(new DetailModel(R.drawable.map1, "Mint-HamiltonCity", "Mint", "4.9", "10:00-16:00", "Tristram Street"));
            detailModelList.add(new DetailModel(R.drawable.map2, "Mint-HamiltonEast", "Mint", "4.9", "10:00-16:00", "Tristram Street"));
            detailModelList.add(new DetailModel(R.drawable.map3, "Mint-Frankton", "Mint", "4.9", "10:00-16:00", "Tristram Street"));
            detailAdapter.notifyDataSetChanged();

        }
        if (name != null && name.equalsIgnoreCase("Berries")) {
            imageView.setImageResource(R.drawable.map5);
            detailModelList.add(new DetailModel(R.drawable.map1, "Mint-HamiltonCity", "Berries", "4.9", "10:00-16:00", "Tristram Street"));
            detailModelList.add(new DetailModel(R.drawable.map2, "Mint-HamiltonEast", "Berries", "4.9", "10:00-16:00", "Tristram Street"));
            detailModelList.add(new DetailModel(R.drawable.map3, "Mint-Frankton", "Berries", "4.9", "10:00-16:00", "Tristram Street"));
            detailAdapter.notifyDataSetChanged();

        }if (name !=null && name.equalsIgnoreCase("Fungus")){
            imageView.setImageResource(R.drawable.map6);
            detailModelList.add(new DetailModel(R.drawable.map1, "Fungus-HamiltonCity", "Fungus", "4.9", "10:00-16:00", "Tristram Street"));
            detailModelList.add(new DetailModel(R.drawable.map2, "Fungus-HamiltonEast", "Fungus", "4.9", "10:00-16:00", "Tristram Street"));
            detailModelList.add(new DetailModel(R.drawable.map3, "Fungus-Frankton", "Fungus", "4.9", "10:00-16:00", "Tristram Street"));
            detailAdapter.notifyDataSetChanged();
        }


    }
}