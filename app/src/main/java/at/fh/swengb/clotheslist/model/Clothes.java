package at.fh.swengb.clotheslist.model;

import java.io.Serializable;

/**
 * Created by Sabine on 18.11.2016.
 */

public class Clothes implements Serializable {
    protected String brand;
    protected int size;
    protected String colour;
    protected String gender;
    protected boolean vaccinated;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }
}
