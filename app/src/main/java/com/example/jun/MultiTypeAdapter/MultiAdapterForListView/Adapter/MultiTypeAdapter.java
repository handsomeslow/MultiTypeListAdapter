package com.example.jun.MultiTypeAdapter.MultiAdapterForListView.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.jun.MultiTypeAdapter.MultiAdapterForListView.Holder.ViewHolder;
import com.example.jun.MultiTypeAdapter.MultiAdapterForListView.Model.Visitable2;
import com.example.jun.MultiTypeAdapter.MultiAdapterForListView.TypeFactory2;
import com.example.jun.MultiTypeAdapter.MultiAdapterForListView.TypeFactoryForListView;

import java.util.List;

/**
 * Created by Jun on 2017/1/12.
 */

public class MultiTypeAdapter extends BaseAdapter{

    private List<Visitable2> list;
    private TypeFactory2 typeFactory;

    public MultiTypeAdapter(List<Visitable2> list) {
        this.list = list;

        typeFactory = new TypeFactoryForListView();
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View itemView, ViewGroup viewGroup) {
        final Context context = viewGroup.getContext();
        final ViewHolder holder;

        if (itemView == null){
            itemView = View.inflate(context,getTypeResource(position),null);
            holder= typeFactory.createViewHolder(getItemViewType(position),itemView);
        } else {
            holder = (ViewHolder) itemView.getTag();
        }
        holder.onUpdateView(list.get(position),position,this);
        holder.getItemView().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.onItemClickListener(context,list.get(position),position,holder.getItemView());
            }
        });
        return itemView;
    }

    @Override
    public int getItemViewType(int position) {
        return list.get(position).type(typeFactory);
    }

    @Override
    public int getViewTypeCount() {
        return typeFactory.getTypeCount();
    }

    private int getTypeResource(int position){
        return typeFactory.getTypeResource(getItemViewType(position));
    }

}
