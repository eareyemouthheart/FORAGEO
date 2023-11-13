package com.example.forageo.FavouriteFragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.forageo.R;
import com.example.forageo.adapters.FeaturedAdapter;
import com.example.forageo.adapters.FeaturedVerAdapter;
import com.example.forageo.models.FeaturedModel;
import com.example.forageo.models.FeaturedVerModel;

import java.util.ArrayList;
import java.util.List;


public class FirstFragment extends Fragment {


    ///////////////////////////////Featured Hor RecyclerView
    List<FeaturedModel> featuredModelList;
    RecyclerView recyclerView;
    FeaturedAdapter featuredAdapter;

    ///////////////////////////////////Featured Ver RecyclerView
    List<FeaturedVerModel> featuredVerModelList;
    RecyclerView recyclerView2;
    FeaturedVerAdapter featuredVerAdapter;

    public FirstFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        ///////////////////////////////Featured Hor RecyclerView

        recyclerView = view.findViewById(R.id.featured_hor_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false));
        featuredModelList = new ArrayList<>();

        featuredModelList.add(new FeaturedModel(R.drawable.fav1,"Featured 1", "desc1"));
        featuredModelList.add(new FeaturedModel(R.drawable.fav2,"Featured 1", "desc1"));
        featuredModelList.add(new FeaturedModel(R.drawable.fav3,"Featured 1", "desc1"));

        featuredAdapter = new FeaturedAdapter(featuredModelList);
        recyclerView.setAdapter(featuredAdapter);

        ///////////////////////////////////Featured Ver RecyclerView

        recyclerView2 = view.findViewById(R.id.featured_ver_rec);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false));
        featuredVerModelList = new ArrayList<>();

        featuredVerModelList.add(new FeaturedVerModel(R.drawable.ver1,"Featured 1","descript 1","4.9","10:00-12:00"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.ver1,"Featured 2","descript 2","4.9","10:00-12:00"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.ver1,"Featured 3","descript 3","4.9","10:00-12:00"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.ver1,"Featured 4","descript 4","4.9","10:00-12:00"));

        featuredVerAdapter = new FeaturedVerAdapter(featuredVerModelList);
        recyclerView2.setAdapter(featuredVerAdapter);
        return view;
    }
}