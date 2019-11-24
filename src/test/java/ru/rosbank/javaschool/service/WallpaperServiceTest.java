package ru.rosbank.javaschool.service;

import org.junit.jupiter.api.Test;
import ru.rosbank.javaschool.model.Wallpaper;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class WallpaperServiceTest {

    @Test
    void validateValueWallpaperLengthFalse() {
        Wallpaper wallpaper = new Wallpaper(1.06, 0);
        WallpaperService wallpaperService = new WallpaperService();
        assertEquals(false, wallpaperService.validateValueWallpaper(wallpaper));
    }

    @Test
    void validateValueWallpaperWidthFalse() {
        Wallpaper wallpaper = new Wallpaper(-1, 2);
        WallpaperService wallpaperService = new WallpaperService();
        assertEquals(false, wallpaperService.validateValueWallpaper(wallpaper));
    }

    @Test
    void validateValueWallpaperTrue() {
        Wallpaper wallpaper = new Wallpaper(10, 20);
        WallpaperService wallpaperService = new WallpaperService();
        assertEquals(true, wallpaperService.validateValueWallpaper(wallpaper));
    }

    @Test
    void countSheetForRoomThrow() {
        Wallpaper wallpaper = new Wallpaper(1.06, 0);
        WallpaperService wallpaperService = new WallpaperService();
        assertThrows(RuntimeException.class, ()->wallpaperService.countSheetForRoom(0.0, wallpaper));
    }


    @Test
    void countSheetForRoomValid() {
        Wallpaper wallpaper = new Wallpaper(3.06, 2);
        WallpaperService wallpaperService = new WallpaperService();
        assertEquals(0, wallpaperService.countSheetForRoom(0, wallpaper));
    }

    @Test
    void countSheetInOneOfWallpaperValid() {
        Wallpaper wallpaper = new Wallpaper(3.06, 5);
        WallpaperService wallpaperService = new WallpaperService();
        assertEquals(2, wallpaperService.countSheetInOneOfWallpaper(2.0, wallpaper));
    }


    @Test
    void rollsOfWallpaperThrows() {
        Wallpaper wallpaper = new Wallpaper(1.06, 0);
        wallpaper.setCountSheetInOneOfWallpaper(0);
        WallpaperService wallpaperService = new WallpaperService();
        assertThrows(RuntimeException.class, ()->wallpaperService.rollsOfWallpaper(wallpaper));
    }

    @Test
    void rollsOfWallpaperValid() {
        Wallpaper wallpaper = new Wallpaper(4.06, 10);
        wallpaper.setCountSheetInOneOfWallpaper(4);
        wallpaper.setCountSheetForRoom(8);

        WallpaperService wallpaperService = new WallpaperService();
        assertEquals(2, wallpaperService.rollsOfWallpaper(wallpaper));
    }

}