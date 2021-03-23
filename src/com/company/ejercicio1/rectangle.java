package com.company.ejercicio1;

public class rectangle {
    private double broad = 1.0;
    private double height = 1.0;

    public rectangle(){
    }

    public  rectangle(double broad, double height){
        this.broad = broad;
        this.height = height;
    }

    public double getBroad() {
        return broad;
    }

    public void setBroad(double broad) {
        this.broad = broad;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateArea(){
        return broad * height;
    }

    public double calculatePerimeter(){
        return 2 * (broad + height);
    }
}
