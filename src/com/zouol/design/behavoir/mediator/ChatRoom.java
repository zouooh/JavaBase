package com.zouol.design.behavoir.mediator;

import java.util.Date;

public class ChatRoom {

    public ChatRoom(){
    }

    public void welcome(User user){
        assert user!=null;
        showMessage(user,"进入聊天室");
    }

    public void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }

}
