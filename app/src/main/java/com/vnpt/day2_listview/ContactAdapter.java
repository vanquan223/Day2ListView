package com.vnpt.day2_listview;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ContactAdapter extends BaseAdapter {

    List<Contact> listContact;
    Activity activity;


    public ContactAdapter(List<Contact> listContact, Activity activity) {
        this.listContact = listContact;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return listContact.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = activity.getLayoutInflater();
            convertView = inflater.inflate(R.layout.item_contact, parent, false);
            ViewHolder viewHolder = new ViewHolder();
            viewHolder.ivAvatar = convertView.findViewById(R.id.ivAvatar);
            viewHolder.tvName = convertView.findViewById(R.id.tvName);
            viewHolder.tvPhone = convertView.findViewById(R.id.tvPhone);
            convertView.setTag(viewHolder);
        }

        ViewHolder viewHolder = (ViewHolder) convertView.getTag();

        Contact contact = listContact.get(position);
        viewHolder.ivAvatar.setImageResource(contact.getAvatar());
        viewHolder.tvName.setText(contact.getUsername());
        viewHolder.tvPhone.setText(contact.getPhone());

        Log.d("ContactAdapter", convertView+"");

        return convertView;
    }

    public static class ViewHolder {
        ImageView ivAvatar;
        TextView tvName;
        TextView tvPhone;
    }
}
