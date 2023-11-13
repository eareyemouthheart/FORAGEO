package com.example.forageo.adapters;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.forageo.R;
import com.example.forageo.models.HomeHorModel;
import com.example.forageo.models.HomeVerModel;

import java.util.ArrayList;
//继承模板对象，参数为ViewHolder
public class HomeHorAdapter extends RecyclerView.Adapter<HomeHorAdapter.ViewHolder> {

    UpdateVerticalRec updateVerticalRec;
    Activity activity;
    ArrayList<HomeHorModel> list;

    boolean check = true;
    boolean select = true;
    int row_index = -1;

//创建的时候，绑定具体的数据
    public HomeHorAdapter(UpdateVerticalRec updateVerticalRec, Activity activity, ArrayList<HomeHorModel> list) {
        this.updateVerticalRec = updateVerticalRec;
        this.activity = activity;
        this.list = list;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_horizontal_item,parent,false));
    }
    //让视图显示具体的数据
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {

        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());
        if (check) {
            ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
            homeVerModels.add(new HomeVerModel(R.drawable.mushroom, "Mushroom", "10:00-18:00 20/11/2022", "4,9"));
            homeVerModels.add(new HomeVerModel(R.drawable.mr2, "Fungus", "10:00-18:00 20/11/2022", "4,9"));
            homeVerModels.add(new HomeVerModel(R.drawable.mr1, "Agaric", "10:00-18:00 20/11/2022", "4,9"));
            homeVerModels.add(new HomeVerModel(R.drawable.mr4, "Fungus", "10:00-18:00 20/11/2022", "4,9"));
            homeVerModels.add(new HomeVerModel(R.drawable.mr3, "Chanterelle", "10:00-18:00 20/11/2022", "4,9"));

            updateVerticalRec.callBack(position, homeVerModels);
            check = false;
        }
            holder.cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    row_index = position;
                    notifyDataSetChanged();

                    if (position ==0){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.mushroom, "Mushroom", "10:00-18:00 20/11/2022", "4,9"));
                        homeVerModels.add(new HomeVerModel(R.drawable.mr2, "Fungus", "10:00-18:00 20/11/2022", "4,9"));
                        homeVerModels.add(new HomeVerModel(R.drawable.mr1, "Agaric", "10:00-18:00 20/11/2022", "4,9"));
                        homeVerModels.add(new HomeVerModel(R.drawable.mr4, "Fungus", "10:00-18:00 20/11/2022", "4,9"));
                        homeVerModels.add(new HomeVerModel(R.drawable.mr3, "Chanterelle", "10:00-18:00 20/11/2022", "4,9"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }
                    else if (position ==1){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.br1, "Blueberry","10:00-18:00 20/11/2022","4,9"));
                        homeVerModels.add(new HomeVerModel(R.drawable.br2, "Blackberry","10:00-18:00 20/11/2022","4,9"));
                        homeVerModels.add(new HomeVerModel(R.drawable.br3, "Strawberry","10:00-18:00 20/11/2022","4,9"));
                        homeVerModels.add(new HomeVerModel(R.drawable.br4, "Raspberry","10:00-18:00 20/11/2022","4,9"));
                        homeVerModels.add(new HomeVerModel(R.drawable.berries, "Berries","10:00-18:00 20/11/2022","4,9"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }
                    else if (position ==2){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.herbs, "herbs","10:00-18:00 20/11/2022","4,9"));
                        homeVerModels.add(new HomeVerModel(R.drawable.thyme, "Thyme","10:00-18:00 20/11/2022","4,9"));
                        homeVerModels.add(new HomeVerModel(R.drawable.parsley, "Parsley","10:00-18:00 20/11/2022","4,9"));
                        homeVerModels.add(new HomeVerModel(R.drawable.mint, "Mint","10:00-18:00 20/11/2022","4,9"));
                        homeVerModels.add(new HomeVerModel(R.drawable.basil, "Basil","10:00-18:00 20/11/2022","4,9"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }
                    else if (position ==3){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.pomegranate, "Pomegranate","10:00-18:00 20/11/2022","4,9"));
                        homeVerModels.add(new HomeVerModel(R.drawable.mandarin, "Mandarin","10:00-18:00 20/11/2022","4,9"));
                        homeVerModels.add(new HomeVerModel(R.drawable.grapes, "Grapes","10:00-18:00 20/11/2022","4,9"));
                        homeVerModels.add(new HomeVerModel(R.drawable.kiwi, "Kiwi Fruits","10:00-18:00 20/11/2022","4,9"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fruits, "Fruits","10:00-18:00 20/11/2022","4,9"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }
                    else if (position ==4){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.pumpkin, "Pumpkin","10:00-18:00 20/11/2022","4,9"));
                        homeVerModels.add(new HomeVerModel(R.drawable.stringsbeans, "Stringsbeans","10:00-18:00 20/11/2022","4,9"));
                        homeVerModels.add(new HomeVerModel(R.drawable.redpepper, "Redpepper","10:00-18:00 20/11/2022","4,9"));
                        homeVerModels.add(new HomeVerModel(R.drawable.tomato, "Tomato","10:00-18:00 20/11/2022","4,9"));
                        homeVerModels.add(new HomeVerModel(R.drawable.basil, "Basil","10:00-18:00 20/11/2022","4,9"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }

                }
            });

            if (select){
                if (position ==0){
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                    select = false;
                }
            }
            else {
                if (row_index == position){
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                }else{
                    holder.cardView.setBackgroundResource(R.drawable.default_bg);
                }
            }


        }


    //Adapter's getItemCount method and ask how many objects are in the data list.
    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView name;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.hor_img);
            name = itemView.findViewById(R.id.hor_text);
            cardView = itemView.findViewById(R.id.cardView);

        }
    }
}
