package ru.rosbank.javaschool.service;

import org.junit.jupiter.api.Test;
import ru.rosbank.javaschool.repository.Room;
import ru.rosbank.javaschool.repository.Wallpaper;

import static org.junit.jupiter.api.Assertions.*;

class RoomServiceTest {
    private static RoomService roomService =  new RoomService();
    private static WallpaperService wallpaperService = new WallpaperService();

    private Room roomNumber1 = new Room(5,6,2.75);
    private Wallpaper wallpaperForRoomNumber1 = new Wallpaper(1.06, 10);

    private Room roomNumber2 = new Room(3,6.5,2.85);
    private Wallpaper wallpaperForRoomNumber2 = new Wallpaper(1.06, 10, 0.6);

    private Room roomNumber3 = new Room(3.3,7.9,2.87);
    private Wallpaper wallpaperForRoomNumber3 = new Wallpaper(1.01, 10.5, 0.32, 0.16);

    private Room roomNumber4 = new Room(-3.3,7.9,2.87);
    private Wallpaper wallpaperForRoomNumber4 = new Wallpaper(1.01, 10.5, 0.32, 0.16);

    private Room roomNumber5 = new Room(-3.3,7.9,2.87);
    private Wallpaper wallpaperForRoomNumber5 = new Wallpaper(1.01, 2.5, 1.32, 3.16);

    @Test
    void all() {
        roomService.perimeter(roomNumber1);
        wallpaperService.initialize(roomNumber1, wallpaperForRoomNumber1);
        roomService.perimeter(roomNumber2);
        wallpaperService.initialize(roomNumber2, wallpaperForRoomNumber2);
        roomService.perimeter(roomNumber3);
        wallpaperService.initialize(roomNumber3, wallpaperForRoomNumber3);
        roomService.perimeter(roomNumber4);
        wallpaperService.initialize(roomNumber4, wallpaperForRoomNumber4);
        roomService.perimeter(roomNumber5);
        wallpaperService.initialize(roomNumber5, wallpaperForRoomNumber5);
    }
}