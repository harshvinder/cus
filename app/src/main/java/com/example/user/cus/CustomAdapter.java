package com.example.user.cus;

import android.content.Context;
import android.widget.ArrayAdapter;

/**
 * Created by user on 4/15/2015.
 */
public class CustomAdapter extends ArrayAdapter<String> {
    Integer[] draw={R.drawable.patiala,R.drawable.achkan,R.drawable.suit};
    public CustomAdapter(Context context, String[] Names,Integer[] draw) {
        super(context,  );
    }
}
