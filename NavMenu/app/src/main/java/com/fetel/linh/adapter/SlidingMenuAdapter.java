package com.fetel.linh.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.fetel.linh.model.ItemSlideMenu;
import com.fetel.linh.navmenu.R;

import java.util.List;

/**
 * Created by NGUYEN DUC LINH on 28/03/2016.
 */
public class SlidingMenuAdapter extends BaseAdapter {
    private Context context;
    private List<ItemSlideMenu> listItem;

    public SlidingMenuAdapter(Context context, List<ItemSlideMenu> listItem) {
        this.context = context;
        this.listItem = listItem;
    }

    @Override
    public int getCount() {
        return listItem.size();
    }

    @Override
    public Object getItem(int position) {
        return listItem.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(context, R.layout.item_sliding_menu,null);

        ImageView img = (ImageView)v.findViewById(R.id.item_img);
        TextView tv = (TextView)v.findViewById(R.id.item_title);

        ItemSlideMenu item= listItem.get(position);
        img.setImageResource(item.getImgId());
        tv.setText(item.getTitle());
        return v;
    }
}
