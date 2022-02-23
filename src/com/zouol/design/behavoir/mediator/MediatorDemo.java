package com.zouol.design.behavoir.mediator;

/**
 * 中介者模式（Mediator Pattern）是用来降低多个对象和类之间的通信复杂性。这种模式提供了一个中介类，该类通常处理不同类之间的通信，并支持松耦合，使代码易于维护。中介者模式属于行为型模式。
 */
public class MediatorDemo {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();
        User xh = new User("小黑");
        User xb = new User("小白");
        xh.join(chatRoom);
        xb.join(chatRoom);
        xh.sendMessage("你好，小白");
        xb.sendMessage("你好，小黑");
    }
}
