package at.fh.swengb.clotheslist.model;

import java.io.Serializable;

/**
 * Created by Sabine on 18.11.2016.
 */

public class Trousers extends Clothes implements Serializable {
    private String length;

    public Trousers() {
    }

    public Trousers(String brand, int size, String colour, String gender, String length, boolean vaccinated) {
        this.brand = brand;
        this.size = size;
        this.colour = colour;
        this.gender = gender;
        this.length = length;
        this.vaccinated = vaccinated;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Trousers{" +
                "brand='" + brand + '\'' +
                ", size=" + size +
                ", colour='" + colour + '\'' +
                ", gender='" + gender + '\'' +
                ", length='" + length + '\'' +
                ", vaccinated=" + vaccinated +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Trousers trousers = (Trousers) o;

        if (size != trousers.size) return false;
        if (brand != null ? !brand.equals(trousers.brand) : trousers.brand != null) return false;
        if (colour != null ? !colour.equals(trousers.colour) : trousers.colour != null) return false;
        if (gender != null ? !gender.equals(trousers.gender) : trousers.gender != null) return false;
        return length != null ? length.equals(trousers.length) : trousers.length == null;

    }

    @Override
    public int hashCode() {
        int result = brand != null ? brand.hashCode() : 0;
        result = 31 * result + size;
        result = 31 * result + (colour != null ? colour.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (length != null ? length.hashCode() : 0);
        return result;
    }

    public void putOnTheTrousers(String text)  {
        System.out.println(brand + ": put on the trousers; " + text);
    }

}
