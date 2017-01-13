package com.example.jun.MultiTypeAdapter.MultiAdapterForRecyclerView;

import android.view.View;

import com.example.jun.MultiTypeAdapter.MultiAdapterForRecyclerView.Holder.BaseViewHolder;
import com.example.jun.MultiTypeAdapter.MultiAdapterForRecyclerView.Holder.NormalViewHolder;
import com.example.jun.MultiTypeAdapter.MultiAdapterForRecyclerView.Holder.OneViewHolder;
import com.example.jun.MultiTypeAdapter.MultiAdapterForRecyclerView.Holder.TwoViewHolder;
import com.example.jun.MultiTypeAdapter.MultiAdapterForRecyclerView.Model.NormalItem;
import com.example.jun.MultiTypeAdapter.MultiAdapterForRecyclerView.Model.OneItem;
import com.example.jun.MultiTypeAdapter.MultiAdapterForRecyclerView.Model.TwoItem;
import com.example.jun.MultiTypeAdapter.R;

/**
 * Created by Jun on 2017/1/12.
 */

public class TypeFactoryForRecycleView implements TypeFactory {
    private final int TYPE_RESOUCE_ONE = R.layout.view_one_layout;
    private final int TYPE_RESOUCE_TWO = R.layout.view_two_layout;
    private final int TYPE_RESOUCE_NORMAL = R.layout.view_normal_layout;

    @Override
    public int type(OneItem oneItem) {
        return TYPE_RESOUCE_ONE;
    }

    @Override
    public int type(TwoItem twoItem) {
        return TYPE_RESOUCE_TWO;
    }

    @Override
    public int type(NormalItem normalItem) {
        return TYPE_RESOUCE_NORMAL;
    }

    @Override
    public BaseViewHolder createViewHolder(int type, View itemView) {
        switch (type){
            case TYPE_RESOUCE_ONE:
                return new OneViewHolder(itemView);

            case TYPE_RESOUCE_TWO:
                return new TwoViewHolder(itemView);

            case TYPE_RESOUCE_NORMAL:
                return new NormalViewHolder(itemView);
        }
        return null;
    }
}
