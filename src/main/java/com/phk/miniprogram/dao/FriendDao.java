package com.phk.miniprogram.dao;

import com.phk.miniprogram.domain.Friend;
import com.phk.miniprogram.domain.Img;
import com.phk.miniprogram.domain.Moment;

import java.util.List;

public interface FriendDao {
    /**
     * 查询所有好友
     * @return
     */
    List<Friend> findAll();

    /**
     * 查询所有名字开头的字母
     * @return
     */
    List<String> findText();

    /**
     * 查询朋友圈
     * @return
     */
    List<Moment> findMoments();

    /**
     * 查询图片信息
     * @return
     */
    List<Img> findImg();
}
