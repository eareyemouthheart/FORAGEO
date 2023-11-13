package com.example.forageo.adapters;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.forageo.R;
import com.example.forageo.models.HomeVerModel;

import java.util.ArrayList;

public class HomeVerAdapter extends RecyclerView.Adapter<HomeVerAdapter.Viewholder> {
    private BottomSheetDialog bottomSheetDialog;
    Context context;
    ArrayList<HomeVerModel> list;

    public HomeVerAdapter(Context context, ArrayList<HomeVerModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Viewholder(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_vertical_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {

        final String mName = list.get(position).getName();
        final String mTiming = list.get(position).getName();
        final String mRating = list.get(position).getName();
        final int mImage = list.get(position).getImage();


        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());
        holder.timing.setText(list.get(position).getTiming());
        holder.rating.setText(list.get(position).getRating());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                bottomSheetDialog = new BottomSheetDialog(context,R.style.BottomSheetTheme);

                View sheetView = LayoutInflater.from(context).inflate(R.layout.bottom_sheet_layout,null);
                sheetView.findViewById(R.id.go_to_location).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context,"Go To Location", Toast.LENGTH_SHORT).show();
                        bottomSheetDialog.dismiss();
                    }
                });

                ImageView bottomImg = sheetView.findViewById(R.id.detail_img);
                TextView bottomName = sheetView.findViewById(R.id.bottom_name);
                TextView bottomRating = sheetView.findViewById(R.id.bottom_rating);
                TextView bottomTiming = sheetView.findViewById(R.id.bottom_timing);

                bottomName.setText(mName);
                bottomRating.setText(mRating);
                bottomTiming.setText(mTiming);
                bottomImg.setImageResource(mImage);

                bottomSheetDialog.setContentView(sheetView);
                bottomSheetDialog.show();


            }
        });


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView name,timing,rating;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.ver_img);
            name = itemView.findViewById(R.id.name);
            timing = itemView.findViewById(R.id.timing);
            rating = itemView.findViewById(R.id.rating);
        }
    }
}
