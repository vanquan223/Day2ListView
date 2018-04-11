package com.vnpt.day2_listview;

public class Contact {

    private String username;
    private String phone;
    private int avatar;

    public Contact(String username, String phone, int avatar) {
        this.username = username;
        this.phone = phone;
        this.avatar = avatar;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }
}
