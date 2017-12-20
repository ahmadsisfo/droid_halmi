package com.sisfo.halmi.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.sisfo.halmi.DetailActivity;
import com.sisfo.halmi.R;
import com.sisfo.halmi.model.Homemenu;

import java.util.List;


public class MateriAdapter extends RecyclerView.Adapter<MateriAdapter.MyViewHolder> {

    private Context mContext;
    private List<Homemenu> albumList;

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView title, count;
        public ImageView thumbnail, overflow;
        public Button explore;

        public MyViewHolder(View itemView) {

            super(itemView);
            title = (TextView) itemView.findViewById(R.id.tarifcard_price);
            count = (TextView) itemView.findViewById(R.id.tarifcard_product);
            thumbnail = (ImageView) itemView.findViewById(R.id.thumbnail);
            explore = (Button) itemView.findViewById(R.id.tarifcard_explore);

            title.setOnClickListener(this);
            count.setOnClickListener(this);
            thumbnail.setOnClickListener(this);
            explore.setOnClickListener(this);
            //overflow = (ImageView) view.findViewById(R.id.overflow);
        }

        @Override
        public void onClick(View v) {
            int pos = getAdapterPosition();
            if (pos != RecyclerView.NO_POSITION){
                Homemenu clickedDataItem = albumList.get(pos);
                Intent intent = null;
                if(albumList.get(pos).getNumOfSongs() == 0){
                    intent = new Intent(mContext, DetailActivity.class);
                } else if(albumList.get(pos).getNumOfSongs() == 1){
                    intent = new Intent(mContext, DetailActivity.class);
                } else if(albumList.get(pos).getNumOfSongs() == 2){
                    intent = new Intent(mContext, DetailActivity.class);
                }
                intent.putExtra("name", albumList.get(pos).getName());
                intent.putExtra("numOfSongs", albumList.get(pos).getNumOfSongs());
                intent.putExtra("thumbnail", albumList.get(pos).getThumbnail());
                intent.putExtra("file", albumList.get(pos).getFile());
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                mContext.startActivity(intent);
                //Toast.makeText(v.getContext(), "You clicked " + clickedDataItem.getName(), Toast.LENGTH_SHORT).show();
            }
        }
    }


    public MateriAdapter(Context mContext, List<Homemenu> albumList) {
        this.mContext = mContext;
        this.albumList = albumList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.materi_card, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        Homemenu album = albumList.get(position);
        holder.title.setText(album.getName());
        holder.count.setText(album.getNumOfSongs() + " songs");

        // loading album cover using Glide library
        Glide.with(mContext).load(album.getThumbnail()).into(holder.thumbnail);

        /*holder.overflow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPopupMenu(holder.overflow);
            }
        });*/
    }

    /**
     * Showing popup menu when tapping on 3 dots
     */
    private void showPopupMenu(View view) {
        // inflate menu
        PopupMenu popup = new PopupMenu(mContext, view);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.menu_album, popup.getMenu());
        popup.setOnMenuItemClickListener(new MyMenuItemClickListener());
        popup.show();
    }

    /**
     * Click listener for popup menu items
     */
    class MyMenuItemClickListener implements PopupMenu.OnMenuItemClickListener {

        public MyMenuItemClickListener() {
        }

        @Override
        public boolean onMenuItemClick(MenuItem menuItem) {
            switch (menuItem.getItemId()) {
                case R.id.action_add_favourite:
                    Toast.makeText(mContext, "Add to favourite", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.action_play_next:
                    Toast.makeText(mContext, "Play next", Toast.LENGTH_SHORT).show();
                    return true;
                default:
            }
            return false;
        }
    }

    @Override
    public int getItemCount() {
        return albumList.size();
    }


}
