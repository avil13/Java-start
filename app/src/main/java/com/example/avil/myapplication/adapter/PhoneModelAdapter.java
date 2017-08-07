package com.example.avil.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.avil.myapplication.R;
import com.example.avil.myapplication.pojo.PhomeModel;

import java.util.List;

public class PhoneModelAdapter extends BaseAdapter {

    private List<PhomeModel> list;
    private LayoutInflater layoutInflater;

    public PhoneModelAdapter(Context context, List<PhomeModel> list) {
        this.list = list;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = layoutInflater.inflate(R.layout.item_layout, viewGroup, false);
        }

        PhomeModel phomeModel = getPhoneModel(i);

        TextView textView = (TextView) view.findViewById(R.id.itemTextView);
        textView.setText(phomeModel.getName());

        return view;
    }

    private PhomeModel getPhoneModel(int i){
        return (PhomeModel ) getItem(i);
    }
}
