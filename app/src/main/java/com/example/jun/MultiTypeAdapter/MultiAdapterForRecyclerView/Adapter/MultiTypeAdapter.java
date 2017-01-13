package com.example.jun.MultiTypeAdapter.MultiAdapterForRecyclerView.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.example.jun.MultiTypeAdapter.MultiAdapterForRecyclerView.Holder.BaseViewHolder;
import com.example.jun.MultiTypeAdapter.MultiAdapterForRecyclerView.Model.Visitable;
import com.example.jun.MultiTypeAdapter.MultiAdapterForRecyclerView.TypeFactory;
import com.example.jun.MultiTypeAdapter.MultiAdapterForRecyclerView.TypeFactoryForRecycleView;

import java.util.List;

/**
 * Created by Jun on 2017/1/12.
 */

public class MultiTypeAdapter extends RecyclerView.Adapter<BaseViewHolder> {
    private List<Visitable> models;

    private TypeFactory typeFactory;

    public MultiTypeAdapter(List<Visitable> models) {
        this.models = models;
        this.typeFactory = new TypeFactoryForRecycleView();
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        View itemView = View.inflate(context,viewType,null);

        return typeFactory.createViewHolder(viewType,itemView);
    }

    @Override
    public void onBindViewHolder(final BaseViewHolder holder, final int position) {
        holder.setUpView(models.get(position),position,this);
        holder.getItemView().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.onItemClickListener(models.get(position),position,holder.getItemView());
            }
        });
    }

    @Override
    public int getItemCount() {
        if (models == null){
            return 0;
        }
        return models.size();
    }

    @Override
    public int getItemViewType(int position) {
        return models.get(position).type(typeFactory);
    }
}
