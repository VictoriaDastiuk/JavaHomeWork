package com.pb.datsiuk.hw7;

public class Atelier {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new Tshirt(Size.XS, ",бордовий", 350),
                new Tshirt(Size.L, "чорний", 250),
                new Pants(Size.M, "чорні", 500),
                new Pants(Size.XXS, "сині", 225),
                new Skirt(Size.S, "червона", 400),
                new Skirt(Size.M, "біла", 520),
                new Tie(Size.L, "чорний", 300),
                new Tie(Size.L, "синій", 280),
        };

        Dress studio = new Dress();
        studio.dressMale(clothes);
        System.out.println();
        studio.dressFemale(clothes);
    }
}
