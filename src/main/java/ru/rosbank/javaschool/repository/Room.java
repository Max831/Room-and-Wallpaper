package ru.rosbank.javaschool.repository;

public class Room {
    private double width;
    private double length;
    private double height;
    private double perimeter;
    private int countRollsOfWallpaper;

    public Room(double width, double length, double height) {
        this.width = width;
        this.length = length;
        this.height = height;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public int getCountRollsOfWallpaper() {
        return countRollsOfWallpaper;
    }

    public void setCountRollsOfWallpaper(int countRollsOfWallpaper) {
        this.countRollsOfWallpaper = countRollsOfWallpaper;
    }
}
