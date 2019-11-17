package ru.rosbank.javaschool.service;

import ru.rosbank.javaschool.repository.Room;

public class RoomService {

    public void perimeter(Room room) {
        if (room.getLength() > 0) {
            if (room.getWidth() > 0) {
                if (room.getHeight() > 0) {
                    room.setPerimeter(room.getLength() * 2 + room.getWidth() * 2);
                    System.out.println("Perimeter " + room.getPerimeter());
                } else {
                    System.out.println("Incorrect parameters");
                }
            } else {
                System.out.println("Incorrect parameters");
            }
        } else {
            System.out.println("Incorrect parameters");
        }
    }

}
