package com.example.jun.MultiTypeAdapter.MultiAdapterForListView;

import android.view.View;

import com.example.jun.MultiTypeAdapter.MultiAdapterForListView.Holder.NormalItemViewHolder;
import com.example.jun.MultiTypeAdapter.MultiAdapterForListView.Holder.OneItemViewHolder;
import com.example.jun.MultiTypeAdapter.MultiAdapterForListView.Holder.TwoItemViewHolder;
import com.example.jun.MultiTypeAdapter.MultiAdapterForListView.Holder.ViewHolder;
import com.example.jun.MultiTypeAdapter.MultiAdapterForListView.Model.NormalItem2;
import com.example.jun.MultiTypeAdapter.MultiAdapterForListView.Model.OneItem2;
import com.example.jun.MultiTypeAdapter.MultiAdapterForListView.Model.TwoItem2;
import com.example.jun.MultiTypeAdapter.R;

/**
 * Created by Jun on 2017/1/12.
 */

public class TypeFactoryForListView implements TypeFactory2 {
    private final int TYPE_COUNT = 3;
    private final int TYPE_RESOUCE_NORMAL = 0;
    private final int TYPE_RESOUCE_ONE = 1;
    private final int TYPE_RESOUCE_TWO = 2;


    @Override
    public int type(NormalItem2 normalItem) {
        return TYPE_RESOUCE_NORMAL;
    }

    @Override
    public int type(OneItem2 oneItem) {
        return TYPE_RESOUCE_ONE;
    }

    @Override
    public int type(TwoItem2 twoItem) {
        return TYPE_RESOUCE_TWO;
    }

    @Override
    public int getTypeCount() {
        return TYPE_COUNT;
    }

    @Override
    public int getTypeResource(int type) {
        switch (type){
            case TYPE_RESOUCE_NORMAL:
                return R.layout.view_normal_layout;

            case TYPE_RESOUCE_ONE:
                return R.layout.view_one_layout;

            case TYPE_RESOUCE_TWO:
                return R.layout.view_two_layout;
        }
        return R.layout.view_normal_layout;
    }

    @Override
    public ViewHolder createViewHolder(int type, View itemView) {
        switch (type){
            case TYPE_RESOUCE_NORMAL:
                return new NormalItemViewHolder(itemView);

            case TYPE_RESOUCE_ONE:
                return new OneItemViewHolder(itemView);

            case TYPE_RESOUCE_TWO:
                return new TwoItemViewHolder(itemView);
        }
        return null;
    }

}
