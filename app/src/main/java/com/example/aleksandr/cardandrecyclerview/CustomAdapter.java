package com.example.aleksandr.cardandrecyclerview;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by aleksandr on 24.08.2015.
 */
public class CustomAdapter extends ArrayAdapter<Integer> {


    public CustomAdapter(Context c, ArrayList<Integer> imgs) {
        super(c, R.layout.single_card,imgs);
    }
}
