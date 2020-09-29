package com.phk.miniprogram.domain;

import java.util.List;

public class FriendList {
    private String text;
    private List<Friend> list_tool;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Friend> getList_tool() {
        return list_tool;
    }

    public void setList_tool(List<Friend> list_tool) {
        this.list_tool = list_tool;
    }

    @Override
    public String toString() {
        return "FriendList{" +
                "text='" + text + '\'' +
                ", list_tool=" + list_tool +
                '}';
    }
}
