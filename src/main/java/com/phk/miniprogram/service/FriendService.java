package com.phk.miniprogram.service;

import com.phk.miniprogram.domain.FriendList;
import com.phk.miniprogram.domain.Moment;

import java.util.List;

public interface FriendService {
    List<FriendList> findAll();

    List<Moment> findMoments();
}
