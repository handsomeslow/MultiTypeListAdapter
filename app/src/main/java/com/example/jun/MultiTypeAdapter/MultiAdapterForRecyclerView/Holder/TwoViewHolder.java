package com.example.jun.MultiTypeAdapter.MultiAdapterForRecyclerView.Holder;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.jun.MultiTypeAdapter.MultiAdapterForRecyclerView.Adapter.MultiTypeAdapter;
import com.example.jun.MultiTypeAdapter.MultiAdapterForRecyclerView.Model.TwoItem;
import com.example.jun.MultiTypeAdapter.R;

/**
 * Created by Jun on 2017/1/12.
 */

public class TwoViewHolder extends BaseViewHolder<TwoItem> {
    public TwoViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void setUpView(TwoItem model, int position, MultiTypeAdapter adapter) {
        TextView name = (TextView) getView(R.id.name);
        name.setText(model.getName());
    }

    @Override
    public void onItemClickListener(TwoItem model, int position, View itemView) {
        Log.d("jun", "onItemClickListener: "+model.getName()+",position:"+position);
    }
}
