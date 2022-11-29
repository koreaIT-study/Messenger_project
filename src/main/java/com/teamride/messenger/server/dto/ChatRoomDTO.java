package com.teamride.messenger.server.dto;

import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(content = Include.NON_NULL)
public class ChatRoomDTO {
    private String roomId; // pk
    private String roomName;
    private String message;
    private String time;
    private int cnt;
    private String isGroup;

    public static ChatRoomDTO create(String roomName, String isGroup){
        ChatRoomDTO room = new ChatRoomDTO();

        room.setRoomId(UUID.randomUUID().toString());
        room.setRoomName(roomName);
        room.setIsGroup(isGroup);
        return room;
    }

    public static ChatRoomDTO create(ChatRoomDTO room2){
        ChatRoomDTO room = new ChatRoomDTO();
        room.setRoomId(UUID.randomUUID().toString());
        room.setRoomName(room2.getRoomName());
        room.setIsGroup(room2.getIsGroup());
        return room;
    }
}
