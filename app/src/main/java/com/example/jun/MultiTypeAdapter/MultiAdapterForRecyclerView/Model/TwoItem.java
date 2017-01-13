package com.example.jun.MultiTypeAdapter.MultiAdapterForRecyclerView.Model;

import com.example.jun.MultiTypeAdapter.MultiAdapterForRecyclerView.TypeFactory;

/**
 * Created by Jun on 2017/1/12.
 */

public class TwoItem  implements Visitable{
    private String name;

    public TwoItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int type(TypeFactory typeFactory) {
        return typeFactory.type(this);
    }
}
