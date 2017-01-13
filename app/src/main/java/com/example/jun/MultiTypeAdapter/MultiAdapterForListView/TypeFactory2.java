package com.example.jun.MultiTypeAdapter.MultiAdapterForListView;

import android.view.View;

import com.example.jun.MultiTypeAdapter.MultiAdapterForListView.Holder.ViewHolder;
import com.example.jun.MultiTypeAdapter.MultiAdapterForListView.Model.NormalItem2;
import com.example.jun.MultiTypeAdapter.MultiAdapterForListView.Model.OneItem2;
import com.example.jun.MultiTypeAdapter.MultiAdapterForListView.Model.TwoItem2;

/**
 * Created by Jun on 2017/1/12.
 */

public interface TypeFactory2 {

    int type(OneItem2 oneItem);

    int type(TwoItem2 twoItem);

    int type(NormalItem2 normalItem);

    ViewHolder createViewHolder(int type, View itemView);

    int getTypeCount();

    int getTypeResource(int type);
}
