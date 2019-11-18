package ru.rosbank.javaschool.service;

import ru.rosbank.javaschool.repository.Room;
import ru.rosbank.javaschool.repository.Wallpaper;

public class WallpaperService {

    public void initialize(Room room, Wallpaper wallpaper) {
        if (validateValueRoom(room)) {
            if (validateValueWallpaper(wallpaper)) {
                countSheetForRoom(room, wallpaper);
                countSheetInOneOfWallpaper(room, wallpaper);
                if (wallpaper.getCountSheetInOneOfWallpaper() > 0) {
                    rollsOfWallpaper(room, wallpaper);
                } else {
                    System.out.println("Incorrect parameters");
                }
            }
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

    public boolean validateValueWallpaper(Wallpaper wallpaper) {
        if (wallpaper.getLength() > 0) {
            return wallpaper.getWidth() > 0;
        } else {
            return false;
        }
    }
    public void countSheetForRoom(Room room, Wallpaper wallpaper) {
        wallpaper.setCountSheetForRoom((int) Math.ceil(room.getPerimeter() / wallpaper.getWidth()));
        System.out.println("Count sheet for room " + wallpaper.getCountSheetForRoom());
    }

    public void countSheetInOneOfWallpaper(Room room, Wallpaper wallpaper) {
        wallpaper.setCountSheetInOneOfWallpaper((int) Math.floor(wallpaper.getLength()
                / (room.getHeight() + Wallpaper.getHeightUsability() + wallpaper.getRapport()
                + wallpaper.getOffsetRapport())));
            System.out.println("Count sheet in one of wallpaper "
                    + wallpaper.getCountSheetInOneOfWallpaper());
    }

    public void rollsOfWallpaper(Room room, Wallpaper wallpaper) {
        room.setCountRollsOfWallpaper(wallpaper.getCountSheetForRoom()
                / wallpaper.getCountSheetInOneOfWallpaper());
        System.out.println("Count rolls of wallpaper " + room.getCountRollsOfWallpaper());
    }
}
