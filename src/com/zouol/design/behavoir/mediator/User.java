package com.zouol.design.behavoir.mediator;

public class User {
    private String name;
    private ChatRoom chatRoom;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name){
        this.name  = name;
    }

    public void sendMessage(String message){
        chatRoom.showMessage(this,message);
    }

    public void join(ChatRoom chatRoom){
        this.chatRoom = chatRoom;
        this.chatRoom.welcome(this);
    }
}
