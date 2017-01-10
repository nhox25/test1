package com.fetel.linh.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.fetel.linh.navmenu.R;
import com.fetel.linh.Variables.Variables;

/**
 * Created by NGUYEN DUC LINH on 25/03/2016.
 */
public class PaperAdapter extends ArrayAdapter {
    private Context context;
    private String [] papers;
    public PaperAdapter(Context context, int pape, String[] paper) {
        super(context, pape, paper);

        this.context = context;
        this.papers = paper;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup paprent){
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.item_sliding_menu, paprent, false);

        ImageView iv =(ImageView)rowView.findViewById(R.id.item_img);
        TextView  tv =(TextView)rowView.findViewById(R.id.item_title);
        iv.setImageResource(Variables.ICONS[position]);
        tv.setText(papers[position]);
        return rowView;
    }
}
