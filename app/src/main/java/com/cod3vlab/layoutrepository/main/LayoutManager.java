package com.cod3vlab.layoutrepository.main;

import com.cod3vlab.layoutrepository.layouts.swipelayout.SwipeLayoutActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by quanghuymr403 on 01/10/2016.
 */
public class LayoutManager {
    private List<LayoutItem> mLayoutItems;

    public LayoutManager init() {
        mLayoutItems = new ArrayList<>();
        mLayoutItems.add(new LayoutItem(SwipeLayoutActivity.class, "Swipe Layout"));
        return this;
    }

    public List<LayoutItem> getLayoutItems() {
        return mLayoutItems;
    }
}
