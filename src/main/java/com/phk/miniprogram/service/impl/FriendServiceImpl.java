package com.phk.miniprogram.service.impl;

import com.phk.miniprogram.dao.FriendDao;
import com.phk.miniprogram.dao.impl.FriendDaoImpl;
import com.phk.miniprogram.domain.Friend;
import com.phk.miniprogram.domain.FriendList;
import com.phk.miniprogram.domain.Img;
import com.phk.miniprogram.domain.Moment;
import com.phk.miniprogram.service.FriendService;

import java.util.ArrayList;
import java.util.List;

public class FriendServiceImpl implements FriendService {
    private FriendDao  friendDao = new FriendDaoImpl();
    @Override
    public List<FriendList> findAll() {
        List<Friend> friends = friendDao.findAll();
        List<FriendList> list = new ArrayList<>();
        List<String> text = friendDao.findText();
        for (String s : text) {
            FriendList friendList = new FriendList();
            friendList.setText(s);
            List<Friend> l =new ArrayList<>();
            for (Friend friend : friends) {
                if(s.equals(friend.getText())){
                    l.add(friend);
                }
            }
            friendList.setList_tool(l);
            list.add(friendList);
        }
        return list;
    }

    @Override
    public List<Moment> findMoments() {
        //调用dao查询moments
         List<Moment> listMoment = friendDao.findMoments();
         //根据图片id查询img
        List<Img> imgList = friendDao.findImg();
        for (Moment moment : listMoment) {
            List<String> imgs = new ArrayList<>();
            for (Img img : imgList) {
                if (moment.getImgid() == img.getId()) {
                    imgs.add(img.getPath());
                }
            }
            moment.setImg(imgs);
        }
        return listMoment;
    }
}
