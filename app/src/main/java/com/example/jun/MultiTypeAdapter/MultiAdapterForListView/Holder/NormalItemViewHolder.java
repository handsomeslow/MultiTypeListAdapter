package com.example.jun.MultiTypeAdapter.MultiAdapterForListView.Holder;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.jun.MultiTypeAdapter.MultiAdapterForListView.Adapter.MultiTypeAdapter;
import com.example.jun.MultiTypeAdapter.MultiAdapterForListView.Model.NormalItem2;
import com.example.jun.MultiTypeAdapter.R;

/**
 * Created by Jun on 2017/1/12.
 */

public class NormalItemViewHolder extends ViewHolder<NormalItem2> {

    private TextView name;

    public NormalItemViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void onBindView(View itemView) {
        name = (TextView) getView(R.id.name);
    }

    @Override
    public void onUpdateView(NormalItem2 model, int position, MultiTypeAdapter adapter) {
        name.setText(model.getName());
    }

    @Override
    public void onItemClickListener(Context context, NormalItem2 model, int position, View itemView) {
        Log.d("jun", "onItemClickListener: "+model.getName());
    }
}
