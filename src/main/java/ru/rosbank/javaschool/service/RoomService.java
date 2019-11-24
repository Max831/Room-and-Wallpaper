package ru.rosbank.javaschool.service;

import ru.rosbank.javaschool.model.Room;

public class RoomService {

    public double perimeter(Room room) {
        if (validateValueRoom(room)) {
            room.setPerimeter(room.getLength() * 2 + room.getWidth() * 2);
            return room.getPerimeter();
        }
        throw new RuntimeException("Incorrect parametrs");
    }
    public boolean validateValueRoom(Room room) {
        if (room.getWidth() <= 0) {
            return false;
        } else if (room.getLength() <= 0) {
            return false;
        } else if (room.getHeight() <= 0) {
            return false;
        }
        return true;
    }
}
