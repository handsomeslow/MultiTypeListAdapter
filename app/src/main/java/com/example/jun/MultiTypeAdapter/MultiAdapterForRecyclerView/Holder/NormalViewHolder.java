package com.example.jun.MultiTypeAdapter.MultiAdapterForRecyclerView.Holder;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.jun.MultiTypeAdapter.MultiAdapterForRecyclerView.Adapter.MultiTypeAdapter;
import com.example.jun.MultiTypeAdapter.MultiAdapterForRecyclerView.Model.NormalItem;
import com.example.jun.MultiTypeAdapter.R;

/**
 * Created by Jun on 2017/1/12.
 */

public class NormalViewHolder extends BaseViewHolder<NormalItem> {

    public NormalViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void setUpView(NormalItem model, int position, MultiTypeAdapter adapter) {
        TextView name = (TextView) getView(R.id.name);
        name.setText(model.getName());
    }

    @Override
    public void onItemClickListener(NormalItem model, int position, View itemView) {
        Log.d("jun", "onItemClickListener: "+model.getName()+",position:"+position);
    }
}
