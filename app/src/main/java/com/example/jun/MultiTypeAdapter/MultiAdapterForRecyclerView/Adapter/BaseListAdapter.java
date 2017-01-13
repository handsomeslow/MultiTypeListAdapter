package com.example.jun.MultiTypeAdapter.MultiAdapterForRecyclerView.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by Jun on 2017/1/12.
 */

public abstract class BaseListAdapter<T> extends BaseAdapter {
    protected Context context;
    protected List<T> models;

    public BaseListAdapter(Context context, List<T> models) {
        this.context = context;
        this.models = models;
    }


    @Override
    public int getCount() {
        return models.size();
    }

    @Override
    public T getItem(int position) {
        return models.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        return null;
    }
}
