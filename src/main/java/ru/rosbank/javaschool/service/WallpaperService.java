package ru.rosbank.javaschool.service;

import ru.rosbank.javaschool.model.Wallpaper;

public class WallpaperService {

    public boolean validateValueWallpaper(Wallpaper wallpaper) {
        if (wallpaper.getLength() <= 0) {
            return false;
        } else if (wallpaper.getWidth() <= 0) {
            return false;
        }
        return true;
    }
    public int countSheetForRoom(double perimeter, Wallpaper wallpaper) {
        if (validateValueWallpaper(wallpaper)) {
            wallpaper.setCountSheetForRoom((int) Math.ceil(perimeter / wallpaper.getWidth()));
            return wallpaper.getCountSheetForRoom();
        }
        throw new RuntimeException("Incorrect Parameters");
    }

    public int countSheetInOneOfWallpaper(double height, Wallpaper wallpaper) {
        wallpaper.setCountSheetInOneOfWallpaper((int) Math.floor(wallpaper.getLength()
                / (height + Wallpaper.getHeightUsability() + wallpaper.getRapport()
                + wallpaper.getOffsetRapport())));
        return wallpaper.getCountSheetInOneOfWallpaper();
    }

    public int rollsOfWallpaper(Wallpaper wallpaper) {
        if (wallpaper.getCountSheetInOneOfWallpaper() > 0) {
            wallpaper.setCountRollsOfWallpaper(wallpaper.getCountSheetForRoom()
                    / wallpaper.getCountSheetInOneOfWallpaper());
            return wallpaper.getCountRollsOfWallpaper();
        }
        throw new RuntimeException("Incorrect parametrs");
    }

}
