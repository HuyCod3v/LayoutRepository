package com.cod3vlab.layoutrepository.layouts.swipelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.cod3vlab.layoutrepository.R;
import com.daimajia.swipe.SwipeLayout;

public class SwipeLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe_layout);

        SwipeLayout swipeLayout = (SwipeLayout) findViewById(R.id.swipeLayout);
        swipeLayout.setShowMode(SwipeLayout.ShowMode.LayDown);
        swipeLayout.addDrag(SwipeLayout.DragEdge.Left, findViewById(R.id.bottom_left_wrapper));
        swipeLayout.addDrag(SwipeLayout.DragEdge.Right, findViewById(R.id.bottom_right_wrapper));
        swipeLayout.addDrag(SwipeLayout.DragEdge.Top, findViewById(R.id.bottom_top_wrapper));
        swipeLayout.addDrag(SwipeLayout.DragEdge.Bottom, findViewById(R.id.bottom_bottom_wrapper));
    }
}
