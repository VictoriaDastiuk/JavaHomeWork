package com.pb.datsiuk.hw7;

public class Tshirt extends Clothes implements ManClothes, WomenClothes{
    public Tshirt(Size size, String color) {
        super(size, color);
    }

    public Tshirt(Size size, String color, double cost) {
        super(size, color, cost);
    }

    @Override
    public String toString() {
        return "Футболка{" +
                "розмір = " + getSize() +
                ", ціна = " + getCost() + " грн" +
                ", колір = " + getColor() +
                "}";
    }
}
