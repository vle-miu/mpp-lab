package lecture3.prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {

    private double maintenanceCosts;

    List<Apartment> apartments = new ArrayList<>();

    public Building(double maintenanceCosts, double rent) {
        this.maintenanceCosts = maintenanceCosts;
        addApartment(rent);
    }

    public void addApartment(double rentPrice) {
        Apartment newApartment = new Apartment(rentPrice);
        apartments.add(newApartment);
    }

    public double calcProfits() {
        double profits = 0;
        for (Apartment apartment : apartments) {
            profits += apartment.getRentPrice();
        }

        return profits - maintenanceCosts;
    }

    public List<Apartment> getApartments() {
        return apartments;
    }

}
