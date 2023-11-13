package com.example.forageo.ui.dailynew;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.forageo.R;
import com.example.forageo.adapters.DailyNewAdapter;
import com.example.forageo.models.DailyNewModel;

import java.util.ArrayList;
import java.util.List;


public class DailyFragment extends Fragment {

   // private FragmentGalleryBinding binding;
    RecyclerView recyclerView;
    List<DailyNewModel> dailyNewModels;
    DailyNewAdapter dailyNewAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        View root = inflater.inflate(R.layout.daily_fragment, container,false);

        recyclerView = root.findViewById(R.id.daily_new_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dailyNewModels = new ArrayList<>();

        dailyNewModels.add(new DailyNewModel(R.drawable.herb1,"Basil","Basil","3 update spot"));
        dailyNewModels.add(new DailyNewModel(R.drawable.mint,"Mint","Mint","3 update spot"));
        dailyNewModels.add(new DailyNewModel(R.drawable.strawberry,"Berries","strawberry","3 update spot"));
        dailyNewModels.add(new DailyNewModel(R.drawable.mr3,"Fungus","Mushroom","3 update spot"));

        dailyNewAdapter = new DailyNewAdapter(getContext(),dailyNewModels);
        recyclerView.setAdapter(dailyNewAdapter);
        dailyNewAdapter.notifyDataSetChanged();

        return root;
    }


}