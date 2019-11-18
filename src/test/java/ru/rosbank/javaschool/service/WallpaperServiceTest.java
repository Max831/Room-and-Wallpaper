package ru.rosbank.javaschool.service;

import org.junit.jupiter.api.Test;
import ru.rosbank.javaschool.repository.Room;
import ru.rosbank.javaschool.repository.Wallpaper;

class WallpaperServiceTest {
    private static RoomService roomService =  new RoomService();
    private static WallpaperService wallpaperService = new WallpaperService();

    private Room roomNumber1 = new Room(0,6,2);
    private Wallpaper wallpaperForRoomNumber1 = new Wallpaper(1.06, 10);

    private Room roomNumber2 = new Room(5,6.5,2.85);
    private Wallpaper wallpaperForRoomNumber2 = new Wallpaper(0, -3, 0.6);

    private Room roomNumber3 = new Room(5,6,2.85);
    private Wallpaper wallpaperForRoomNumber3 = new Wallpaper(1.06, 10);

    private Room roomNumber4 = new Room(5,6,2.85);
    private Wallpaper wallpaperForRoomNumber4 = new Wallpaper(11.06, 1);


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
    }
}