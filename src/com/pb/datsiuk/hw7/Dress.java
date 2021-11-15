package com.pb.datsiuk.hw7;

public class Dress {
           public void dressMale(Clothes[] clothes) {
            System.out.println("Чоловічий одяг, який в наявності:");
            for (Clothes clothe : clothes) {
                if (clothe instanceof ManClothes) {
                    System.out.println(clothe);
                }
            }
        }

        public void dressFemale(Clothes[] clothes) {
            System.out.println("Жіночий одяг в наявності:");
            for (Clothes clothe : clothes) {
                if (clothe instanceof WomenClothes) {
                    System.out.println(clothe);
                }
            }
        }
    }
