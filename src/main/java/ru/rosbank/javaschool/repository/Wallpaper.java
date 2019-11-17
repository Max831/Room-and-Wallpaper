package ru.rosbank.javaschool.repository;

public class Wallpaper {
    private double width;
    private double length;
    private double rapport;
    private double offsetRapport;
    private int countSheetForRoom;
    private final static double heightUsability = 0.1;
    private int countSheetInOneOfWallpaper;

    public Wallpaper(double width, double length) {
        this.width = width;
        this.length = length;
        this.rapport = 0.0;
        this.offsetRapport = 0.0;
    }
    public Wallpaper(double width, double length, double rapport) {
        this.width = width;
        this.length = length;
        this.rapport = rapport;
        this.offsetRapport = 0.0;
    }

    public Wallpaper(double width, double length, double rapport, double offsetRaport) {
        this.width = width;
        this.length = length;
        this.rapport = rapport;
        this.offsetRapport = offsetRaport;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int getCountSheetForRoom() {
        return countSheetForRoom;
    }

    public void setCountSheetForRoom(int countSheetForRoom) {
        this.countSheetForRoom = countSheetForRoom;
    }

    public static double getHeightUsability() {
        return heightUsability;
    }

    public int getCountSheetInOneOfWallpaper() {
        return countSheetInOneOfWallpaper;
    }

    public void setCountSheetInOneOfWallpaper(int countSheetInOneOfWallpaper) {
        this.countSheetInOneOfWallpaper = countSheetInOneOfWallpaper;
    }

    public double getRapport() {
        return rapport;
    }

    public void setRapport(double rapport) {
        this.rapport = rapport;
    }

    public double getOffsetRapport() {
        return offsetRapport;
    }

    public void setOffsetRapport(double offsetRapport) {
        this.offsetRapport = offsetRapport;
    }
}
