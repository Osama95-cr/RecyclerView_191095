package com.example.recyclerview_191095.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview_191095.Modal.Student;
import com.example.recyclerview_191095.R;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    Context c;
    List<Student> obj;

    public RecyclerViewAdapter() {
    }

    public RecyclerViewAdapter(Context c, List<Student> obj) {
        this.c = c;
        this.obj = obj;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
        Student s = obj.get(position);
        holder.txs.setText("Student Name: "+obj.getsName()  );
        holder.txr.setText("Student Roll No" +obj.getSroll_no());
        holder.txc.setText("Student Class"+obj.getSclass_no);
    }

    @Override
    public int getItemCount() {
        return obj.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView txs,txr,txc;
        Button btn_1;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txs = itemView.findViewById(R.id.text1);
            txr = itemView.findViewById(R.id.text2);
            txc = itemView.findViewById(R.id.text3);
            btn_1=itemView.findViewById(R.id.btn_1);
            btn_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position=getAdapterPosition();
                    Toast.makeText(itemView.getContext(),obj.get(position).getSname(),Toast.LENGTH_LONG).show();
                    obj.remove(position);
                    notifyItemRemoved(position);
                }
            });

        }

        @Override
        public void onClick(View v) {

        }
    }
}