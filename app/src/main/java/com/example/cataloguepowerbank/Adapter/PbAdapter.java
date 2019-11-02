package com.example.cataloguepowerbank.Adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.cataloguepowerbank.Activity.DetailActivity;
import com.example.cataloguepowerbank.Model.Powerbank;
import com.example.cataloguepowerbank.R;

import java.util.ArrayList;

public class PbAdapter extends RecyclerView.Adapter<PbAdapter.MyViewHolder> {

    private ArrayList<Powerbank> powerBanks;

    public PbAdapter(ArrayList<Powerbank> powerBanks) {
        this.powerBanks = powerBanks;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.powerbank_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {

        final Powerbank powerBankVariabel = powerBanks.get(position);

        Glide.with(holder.itemView.getContext())
                .load(powerBankVariabel.getImage())
                .apply(new RequestOptions().override(84, 84))
                .into(holder.image);

        //anim
//        holder.cv.setAnimation(AnimationUtils.loadAnimation(holder.itemView.getContext(), R.anim.fade_transition_animation));

        holder.name.setText(powerBankVariabel.getName());
        holder.description.setText(powerBankVariabel.getDescription());

        //method click
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(), DetailActivity.class);
                intent.putExtra("name", powerBanks.get(position).getName());
                intent.putExtra("description", powerBanks.get(position).getDescription());
                intent.putExtra("image", powerBanks.get(position).getImage());

                view.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return powerBanks.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private CardView cv;
        private ImageView image;
        private TextView name, description;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

//            cv = itemView.findViewById(R.id.cardView);
            image = itemView.findViewById(R.id.img_item_foto);
            name = itemView.findViewById(R.id.tv_item_nama);
            description = itemView.findViewById(R.id.tv_item_deskripsi);

        }
    }
}
