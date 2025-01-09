package org.example;

public class Point {

    // Instance Variables
    private int x;
    private int y;

    // Constructor
    public  point(int x, int y){
        this.x= x;
        this.y= y;
    }
    // Getter and Setter Methods
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x= x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }
    // Method - distance
    public double distance(){
        return Math.sqrt(x * x + y * y);
    }
    // Method - distance to another Point
    public double distance(Point p) {
        return Math.sqrt((p.x - this.x) * (p.x - this.x) + (p.y - this.y) * (p.y - this.y));
    }

    // Method - distance to given (a, b)
    public double distance(int a, int b) {
        return Math.sqrt((a - this.x) * (a - this.x) + (b - this.y) * (b - this.y));
    }

}
