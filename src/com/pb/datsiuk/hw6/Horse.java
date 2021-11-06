package com.pb.datsiuk.hw6;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Horse extends Animal implements Serializable {
    private String name;
    public Horse() {
    }

    public Horse(String food, String location) {
        super(food, location);
    }
    @Override
    public void eat() {
        System.out.println("Кінь їсть.");
    }

    @Override
    public String makeNoise() {
        return "Ігого!!!";
    }
    @Override
    public String makeSleep() {
        return "Кінь спить";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Horse)) return false;
        if (!super.equals(o)) return false;

        Horse horse = (Horse) o;

        return name != null ? name.equals(horse.name) : horse.name == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "food: '" + getFood() + '\'' +
                ", location: '" + getLocation() + '\'' +
                '}';
    }

    private void writeObject(ObjectOutputStream os) {
        try {
            os.defaultWriteObject();
            os.writeObject(getFood());
            os.writeObject(getLocation());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void readObject(ObjectInputStream is) {
        try {
            is.defaultReadObject();
            this.setFood((String) is.readObject());
            this.setLocation((String) is.readObject());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
