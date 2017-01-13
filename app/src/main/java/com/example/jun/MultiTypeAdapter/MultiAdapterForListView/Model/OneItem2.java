package com.example.jun.MultiTypeAdapter.MultiAdapterForListView.Model;

import com.example.jun.MultiTypeAdapter.MultiAdapterForListView.TypeFactory2;

/**
 * Created by Jun on 2017/1/12.
 */

public class OneItem2 implements Visitable2 {
    private String name;

    public OneItem2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int type(TypeFactory2 typeFactory) {
        return typeFactory.type(this);
    }
}
