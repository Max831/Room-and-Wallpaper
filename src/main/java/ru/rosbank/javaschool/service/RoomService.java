package ru.rosbank.javaschool.service;

import ru.rosbank.javaschool.repository.Room;

public class RoomService {

    public void perimeter(Room room) {
        if (validateValueRoom(room)) {
            room.setPerimeter(room.getLength() * 2 + room.getWidth() * 2);
            System.out.println("Perimeter " + room.getPerimeter());
        } else {
            System.out.println("Incorrect parameters");
        }
    }
    public boolean validateValueRoom(Room room) {
            if (room.getWidth() > 0) {
                if (room.getLength() > 0) {
                    return room.getHeight() > 0;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

}
