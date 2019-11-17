package ru.rosbank.javaschool.service;

import ru.rosbank.javaschool.repository.Room;
import ru.rosbank.javaschool.repository.Wallpaper;

public class WallpaperService {

    public void initialize(Room room, Wallpaper wallpaper) {
        if (room.getWidth() > 0) {
            if (room.getLength() > 0) {
                if (room.getHeight() > 0) {
                    if (wallpaper.getLength() > 0) {
                        if (wallpaper.getWidth() > 0) {
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
            }
        }
    }

    private void countSheetForRoom(Room room, Wallpaper wallpaper) {
        wallpaper.setCountSheetForRoom((int) Math.ceil(room.getPerimeter() / wallpaper.getWidth()));
        System.out.println("Count sheet for room " + wallpaper.getCountSheetForRoom());
    }

    private void countSheetInOneOfWallpaper(Room room, Wallpaper wallpaper) {
        wallpaper.setCountSheetInOneOfWallpaper((int) Math.floor(wallpaper.getLength()
                / (room.getHeight() + Wallpaper.getHeightUsability() + wallpaper.getRapport()
                + wallpaper.getOffsetRapport())));
            System.out.println("Count sheet in one of wallpaper "
                    + wallpaper.getCountSheetInOneOfWallpaper());
    }

    private void rollsOfWallpaper(Room room, Wallpaper wallpaper) {
        room.setCountRollsOfWallpaper(wallpaper.getCountSheetForRoom()
                / wallpaper.getCountSheetInOneOfWallpaper());
        System.out.println("Count rolls of wallpaper " + room.getCountRollsOfWallpaper());
    }
}
