package com.example.jun.MultiTypeAdapter.MultiAdapterForListView.Model;

import com.example.jun.MultiTypeAdapter.MultiAdapterForListView.TypeFactory2;

/**
 * Created by Jun on 2017/1/12.
 */

public class NormalItem2 implements Visitable2 {
    private String name;
    private String are;
    private String address;

    public NormalItem2(String name) {
        this.name = name;
    }

    public String getAre() {
        return are;
    }

    public void setAre(String are) {
        this.are = are;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int type(TypeFactory2 typeFactory) {
        return typeFactory.type(this);
    }
}
