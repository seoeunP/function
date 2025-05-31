package com.domain.studyroom.rooms;

public class RoomParticipant {
    private int id;
    private int roomId;
    private String username;
    private String jitsiRoomName;

    public RoomParticipant(int roomId, String username, String jitsiRoomName) {
        this.roomId = roomId;
        this.username = username;
        this.jitsiRoomName = jitsiRoomName;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getJitsiRoomName() {
        return jitsiRoomName;
    }

    public void setJitsiRoomName(String jitsiRoomName) {
        this.jitsiRoomName = jitsiRoomName;
    }
}