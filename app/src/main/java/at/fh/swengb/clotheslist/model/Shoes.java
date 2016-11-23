package at.fh.swengb.clotheslist.model;

import java.io.Serializable;

/**
 * Created by Sabine on 18.11.2016.
 */

public class Shoes extends Clothes implements Serializable {
    private String type;  //Sneakers, Pumps usw...

    public Shoes() {
    }

    public Shoes(String brand, int size, String colour, String gender, String type, boolean vaccinated) {
        this.brand = brand;
        this.size = size;
        this.colour = colour;
        this.gender = gender;
        this.type = type;
        this.vaccinated = vaccinated;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Shoes{" +
                "brand='" + brand + '\'' +
                ", size=" + size +
                ", colour='" + colour + '\'' +
                ", gender='" + gender + '\'' +
                ", type='" + type + '\'' +
                ", vaccinated=" + vaccinated +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Shoes shoes = (Shoes) o;

        if (size != shoes.size) return false;
        if (brand != null ? !brand.equals(shoes.brand) : shoes.brand != null) return false;
        if (colour != null ? !colour.equals(shoes.colour) : shoes.colour != null) return false;
        if (gender != null ? !gender.equals(shoes.gender) : shoes.gender != null) return false;
        return type != null ? type.equals(shoes.type) : shoes.type == null;

    }

    @Override
    public int hashCode() {
        int result = brand != null ? brand.hashCode() : 0;
        result = 31 * result + size;
        result = 31 * result + (colour != null ? colour.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    public void tieShoes(String text)  {
        System.out.println(brand + ": tie shoes; " + text);
    }

}
