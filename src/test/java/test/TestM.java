package test;

import com.phk.miniprogram.dao.impl.FriendDaoImpl;
import com.phk.miniprogram.domain.Friend;
import com.phk.miniprogram.domain.FriendList;
import com.phk.miniprogram.domain.Img;
import com.phk.miniprogram.domain.Moment;
import com.phk.miniprogram.service.impl.FriendServiceImpl;
import org.junit.Test;

import java.util.List;

public class TestM {
    @Test
    public void test1() {
        FriendDaoImpl dao = new FriendDaoImpl();
        List<Friend> all = dao.findAll();
        System.out.println(all);
    }
    @Test
    public void test2() {
        FriendDaoImpl dao = new FriendDaoImpl();
        List<String> text = dao.findText();
        System.out.println(text);
    }

    @Test
    public void test3() {
        FriendServiceImpl friendService = new FriendServiceImpl();
        List<FriendList> all = friendService.findAll();
        System.out.println(all);
    }

    @Test
    public void test4() {
        List<Moment> moments = new FriendDaoImpl().findMoments();
        System.out.println(moments);
    }

    @Test
    public void test5() {
        List<Img> imgList = new FriendDaoImpl().findImg();
        System.out.println(imgList);
    }
}
