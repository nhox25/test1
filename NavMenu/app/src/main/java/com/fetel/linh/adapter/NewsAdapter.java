package com.fetel.linh.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.fetel.linh.model.RssItem;
import com.fetel.linh.navmenu.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by NGUYEN DUC LINH on 25/03/2016.
 */
public class NewsAdapter extends ArrayAdapter<RssItem> {
    private Context context;
    private List<RssItem> items;
    //private int ivIcon;

    public NewsAdapter(Context context, int ivIcon, List<RssItem> items) {
        super(context, ivIcon, items);
        this.context = context;
        this.items = items;
        //this.ivIcon = ivIcon;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup paprent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.list_title_bai_bao, paprent, false);

        ImageView iv = (ImageView) rowView.findViewById(R.id.imgIcon);
        TextView tv = (TextView) rowView.findViewById(R.id.title);
        TextView txtPubdate = (TextView)rowView.findViewById(R.id.pubDate);
        if(items.get(position).getDescription().length()<5){
            tv.setText(items.get(position).getTitel());
            iv.setImageResource(R.drawable.icon_bai_bao);
        }else {
            Picasso.with(context).load(items.get(position).getDescription())
                    .placeholder(R.drawable.icon_bai_bao).error(R.drawable.icon_bai_bao).into(iv);

            tv.setText(items.get(position).getTitel().trim());
            txtPubdate.setText(items.get(position).getDate().trim());
        }
        return rowView;
    }
}
