package com.hadimusthafa.zoondia12;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class FileAdapter extends RecyclerView.Adapter<FileAdapter.MyViewHolder> {

    private LayoutInflater inflater;
    private ArrayList<FileModel> dataModelArrayList;
    private Context mContext;
    String JSONA;

    public FileAdapter(Context ctx, ArrayList<FileModel> dataModelArrayList, String JSONaa) {
        inflater = LayoutInflater.from(ctx);
        this.dataModelArrayList = dataModelArrayList;
        this.JSONA = JSONaa;
        mContext = ctx;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.file_name.setText(dataModelArrayList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return dataModelArrayList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView file_name;

        public MyViewHolder(final View itemView) {
            super(itemView);
            file_name = itemView.findViewById(R.id.file_name);
        }
    }
}
