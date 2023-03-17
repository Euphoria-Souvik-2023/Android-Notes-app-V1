package com.example.mynotes.utility;

import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mynotes.R;

import java.util.ArrayList;
import java.util.List;

public class NoteAdapter extends RecyclerView.Adapter<NoteAdapter.viewHolder> {
    ArrayList<NotePage> list;
    public NoteAdapter(ArrayList<NotePage> list) {
        this.list=list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.note,parent,false);
        viewHolder holder=new viewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
            String title=list.get(position).getTitle();
            String description=list.get(position).getDescription();
            holder.titleView.setText(title);
            holder.descpView.setText(description);
    }



    @Override
    public int getItemCount() {
        return list.size();
    }


    public class viewHolder extends RecyclerView.ViewHolder{
        TextView titleView,descpView;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            titleView=itemView.findViewById(R.id.titleView);
            descpView=itemView.findViewById(R.id.descpView);
        }
    }
}
