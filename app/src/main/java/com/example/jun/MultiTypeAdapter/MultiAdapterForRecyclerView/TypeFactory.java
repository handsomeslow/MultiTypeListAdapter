package com.example.jun.MultiTypeAdapter.MultiAdapterForRecyclerView;

import android.view.View;

import com.example.jun.MultiTypeAdapter.MultiAdapterForRecyclerView.Holder.BaseViewHolder;
import com.example.jun.MultiTypeAdapter.MultiAdapterForRecyclerView.Model.NormalItem;
import com.example.jun.MultiTypeAdapter.MultiAdapterForRecyclerView.Model.OneItem;
import com.example.jun.MultiTypeAdapter.MultiAdapterForRecyclerView.Model.TwoItem;

/**
 * Created by Jun on 2017/1/12.
 */

public interface TypeFactory {

    int type(OneItem oneItem);

    int type(TwoItem twoItem);

    int type(NormalItem normalItem);

    BaseViewHolder createViewHolder(int type, View itemView);
}
