package com.pb.datsiuk.hw7;

public class Pants extends Clothes implements ManClothes, WomenClothes{
    public Pants(Size size, String color) {
        super(size, color);
    }

    public Pants(Size size, String color, double cost) {
        super(size, color, cost);
    }

    @Override
    public String toString() {
        return "Штани{" +
                "розмір = " + getSize() +
                ", ціна = " + getCost() + " грн" +
                ", колід = " + getColor() +
                "}";
    }
}
