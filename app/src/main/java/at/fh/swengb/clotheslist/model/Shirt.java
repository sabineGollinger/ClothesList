package at.fh.swengb.clotheslist.model;

import java.io.Serializable;

/**
 * Created by Sabine on 18.11.2016.
 */

public class Shirt extends Clothes implements Serializable {
    private String material;

    public Shirt() {
    }

    public Shirt(String brand, int size, String colour, String gender, String material, boolean vaccinated) {
        this.brand = brand;
        this.size = size;
        this.colour = colour;
        this.gender = gender;
        this.material = material;
        this.vaccinated = vaccinated;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "brand='" + brand + '\'' +
                ", size=" + size +
                ", colour='" + colour + '\'' +
                ", gender='" + gender + '\'' +
                ", material='" + material + '\'' +
                ", vaccinated=" + vaccinated +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Shirt shirt = (Shirt) o;

        if (size != shirt.size) return false;
        if (brand != null ? !brand.equals(shirt.brand) : shirt.brand != null) return false;
        if (colour != null ? !colour.equals(shirt.colour) : shirt.colour != null) return false;
        if (gender != null ? !gender.equals(shirt.gender) : shirt.gender != null) return false;
        return material != null ? material.equals(shirt.material) : shirt.material == null;

    }

    @Override
    public int hashCode() {
        int result = brand != null ? brand.hashCode() : 0;
        result = 31 * result + size;
        result = 31 * result + (colour != null ? colour.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (material != null ? material.hashCode() : 0);
        return result;
    }

    public void washShirt(String text)  {
        System.out.println(brand + ": wash shirt; " + text);
    }
}
