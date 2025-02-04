package org.example;

public class Car {
    protected String Brand;
    protected String Color;

    public Car(String brand, String Color) {
        this.Brand = brand;
        this.Color = Color;
    }
    public String getBrand() {
        return Brand;
    }
    public void setBrand(String Brand){
        this.Brand = Brand;
    }

    public void displayInfo(){
        System.out.println("Brand: " + Brand + ", Color: " + Color);
    }

}
