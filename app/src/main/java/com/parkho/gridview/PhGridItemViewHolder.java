package com.parkho.gridview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PhGridItemViewHolder {

    public ImageView ivIcon;

    public TextView tvName;

    public PhGridItemViewHolder(View a_view) {
        ivIcon = a_view.findViewById(R.id.iv_icon);
        tvName = a_view.findViewById(R.id.tv_name);
    }
}