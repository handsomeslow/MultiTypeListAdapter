package com.example.jun.MultiTypeAdapter.MultiAdapterForListView.Holder;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;

import com.example.jun.MultiTypeAdapter.MultiAdapterForListView.Adapter.MultiTypeAdapter;

/**
 * Created by Jun on 2017/1/12.
 */

public abstract class ViewHolder<T> {
    private SparseArray<View> mViews;
    private View mItemView;

    protected ViewHolder(View itemView) {
        this.mItemView = itemView;
        mViews = new SparseArray<View>();

        mItemView.setTag(this);
        onBindView(mItemView);
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

    public abstract void onBindView(View itemView);

    public abstract void onUpdateView(T model, int position, MultiTypeAdapter adapter);

    public abstract void onItemClickListener(Context context, T model, int position, View itemView);
}
