package com.phk.miniprogram.web.servlet;

import com.phk.miniprogram.domain.FriendList;
import com.phk.miniprogram.domain.Moment;
import com.phk.miniprogram.service.FriendService;
import com.phk.miniprogram.service.impl.FriendServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/friend/*")
public class FindFriend extends BaseServlet {
    private FriendService service = new FriendServiceImpl();

    public void findAll(HttpServletRequest request, HttpServletResponse response) {
        List<FriendList> all = service.findAll();
        System.out.println("findAll 被执行了");
        try {
            writeValue(all,response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getMoments(HttpServletRequest request, HttpServletResponse response) throws IOException {
       List<Moment> all = service.findMoments();
       writeValue(all,response);
    }
}
