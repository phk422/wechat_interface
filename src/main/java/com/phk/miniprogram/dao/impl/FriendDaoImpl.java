package com.phk.miniprogram.dao.impl;

import com.phk.miniprogram.dao.FriendDao;
import com.phk.miniprogram.domain.Friend;
import com.phk.miniprogram.domain.Img;
import com.phk.miniprogram.domain.Moment;
import com.phk.miniprogram.util.JdbcUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.*;

public class FriendDaoImpl implements FriendDao {
    private JdbcTemplate template=new JdbcTemplate(JdbcUtils.getDataSource());
    @Override
    public List<Friend> findAll() {
        String sql = "select *from friend order by text";
        List<Friend> list = template.query(sql, new BeanPropertyRowMapper<>(Friend.class));
        return list;
    }

    @Override
    public List<String> findText() {
        String sql = "select distinct(text) from friend order by text";
        List<Map<String, Object>> list = template.queryForList(sql);
        List<String> texts = new ArrayList<>();
        for (Map<String, Object> map : list) {
            Collection<Object> values = map.values();
            for (Object value : values) {
                texts.add((String) value);
            }
        }
        return texts;
    }

    @Override
    public List<Moment> findMoments() {
        String sql = "select *from moments order by time desc";
        List<Moment> momentList = template.query(sql, new BeanPropertyRowMapper<>(Moment.class));
        return momentList;
    }

    @Override
    public List<Img> findImg() {
        String sql = "select id,path from img ";
        List<Img> imgList = template.query(sql, new BeanPropertyRowMapper<>(Img.class));
        return imgList;
    }
}
