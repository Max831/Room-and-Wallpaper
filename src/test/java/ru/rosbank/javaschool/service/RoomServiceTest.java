package ru.rosbank.javaschool.service;

import org.junit.jupiter.api.Test;
import ru.rosbank.javaschool.model.Room;
import ru.rosbank.javaschool.model.Wallpaper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RoomServiceTest {
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
    void PerimeterIncorrect() {
        RoomService roomService =  new RoomService();
        WallpaperService wallpaperService = new WallpaperService();
        Room roomNumber1 = new Room(0,6,2);
        Wallpaper wallpaperForRoomNumber1 = new Wallpaper(1.06, 10);
        assertThrows(RuntimeException.class, ()->roomService.perimeter(roomNumber1));
    }

    @Test
    void PerimeterValidate() {
        RoomService roomService =  new RoomService();
        Room room = new Room(2,6,2);
        assertEquals(16, roomService.perimeter(room));
    }

    @Test
    void validateValueRoomFalseLength() {
        RoomService roomService =  new RoomService();
        Room room = new Room(2,0,2);
        assertEquals(false, roomService.validateValueRoom(room));
    }

    @Test
    void validateValueRoomFalseWidth() {
        RoomService roomService =  new RoomService();
        Room room = new Room(0,1,2);
        assertEquals(false, roomService.validateValueRoom(room));
    }

    @Test
    void validateValueRoomFalseHeight() {
        RoomService roomService =  new RoomService();
        Room room = new Room(4,1,0);
        assertEquals(false, roomService.validateValueRoom(room));
    }

    @Test
    void validateValueRoomTrue() {
        RoomService roomService =  new RoomService();
        Room room = new Room(2,6,2);
        assertEquals(true, roomService.validateValueRoom(room));
    }
}