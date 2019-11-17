package ru.rosbank.javaschool;

import ru.rosbank.javaschool.repository.Room;
import ru.rosbank.javaschool.repository.Wallpaper;
import ru.rosbank.javaschool.service.RoomService;
import ru.rosbank.javaschool.service.WallpaperService;

public class Main {
    private static RoomService roomService =  new RoomService();
    private static WallpaperService wallpaperService = new WallpaperService();

    public static void main(String[] args) {
        Room roomNumber1 = new Room(5,6,2.75);
        Wallpaper wallpaperForRoomNumber1 = new Wallpaper(1.06, 10);
        calculateAll(roomNumber1, wallpaperForRoomNumber1);
    }

    private static void calculateAll(Room room, Wallpaper wallpaper) {
        roomService.perimeter(room);
        wallpaperService.initialize(room, wallpaper);
    }
}
