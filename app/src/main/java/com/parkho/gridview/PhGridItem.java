package com.parkho.gridview;

public class PhGridItem {

    public PhGridItem(int a_imageResId, String a_strName) {
        mImageResId = a_imageResId;
        mStrName = a_strName;
    }

    private int mImageResId;

    private String mStrName;

    public int getImageResId() {
        return mImageResId;
    }

    public void setName(String a_strName) {
        mStrName = a_strName;
    }

    public String getName() {
        return mStrName;
    }
}