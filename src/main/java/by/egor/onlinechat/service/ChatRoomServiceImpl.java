package by.egor.onlinechat.service;

import by.egor.onlinechat.model.ChatRoom;

public interface ChatRoomServiceImpl {

    ChatRoom create();

    ChatRoom getById(Long id);

    ChatRoom updateNameById(Long id, String name);

    ChatRoom updateDescriptionById(Long id, String name);

    void deleteById(Long id);

}
