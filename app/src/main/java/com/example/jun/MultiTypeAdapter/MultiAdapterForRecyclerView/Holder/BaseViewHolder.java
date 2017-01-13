package com.example.jun.MultiTypeAdapter.MultiAdapterForRecyclerView.Holder;

import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;

import com.example.jun.MultiTypeAdapter.MultiAdapterForRecyclerView.Adapter.MultiTypeAdapter;

/**
 * Created by Jun on 2017/1/12.
 */

public abstract class BaseViewHolder<T> extends RecyclerView.ViewHolder{
    private SparseArray<View> mViews;
    private View mItemView;

    public BaseViewHolder(View itemView) {
        super(itemView);
        mItemView = itemView;
        mViews = new SparseArray<View>();
    }

    public View getItemView() {
        return mItemView;
    }

    public View getView(int id) {
        View view = mViews.get(id);
        if (view == null) {
            view = mItemView.findViewById(id);
            mViews.put(id, view);
        }
        return view;
    }

    public abstract void setUpView(T model, int position, MultiTypeAdapter adapter);

    public abstract void onItemClickListener(T model, int position, View itemView);
}
