package com.vnpt.day2_listview;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RCAdapter extends RecyclerView.Adapter {
    private Activity activity;
    private List<Contact> listContact;

    public RCAdapter(Activity activity, List<Contact> listContact) {
        this.activity = activity;
        this.listContact = listContact;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = activity.getLayoutInflater();
        View v = inflater.inflate(R.layout.item_contact, parent, false);
        ContactHolder holder = new ContactHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ContactHolder contactHolder = (ContactHolder) holder;
        Contact contact = listContact.get(position);
        contactHolder.ivAvatar.setImageResource(contact.getAvatar());
        contactHolder.tvPhone.setText(contact.getPhone());
        contactHolder.tvName.setText(contact.getUsername());

    }

    @Override
    public int getItemCount() {
        return listContact.size();
    }

    public static class ContactHolder extends RecyclerView.ViewHolder{
        ImageView ivAvatar;
        TextView tvPhone;
        TextView tvName;

        public ContactHolder(View itemView) {
            super(itemView);
            ivAvatar = itemView.findViewById(R.id.ivAvatar);
            tvPhone = itemView.findViewById(R.id.tvPhone);
            tvName = itemView.findViewById(R.id.tvName);
        }
    }
}
