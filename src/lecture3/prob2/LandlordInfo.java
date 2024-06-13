package lecture3.prob2;

import java.util.ArrayList;
import java.util.List;

public class LandlordInfo {

    List<Building> buildings = new ArrayList<>();

    public void addBuilding(double maintenanceCosts, double rent) {
        Building newBuilding = new Building(maintenanceCosts, rent);
        buildings.add(newBuilding);
    }

    public List<Building> getBuildings() {
        return buildings;
    }

    public double calcProfits() {
        double profits = 0;
        for (Building building : buildings) {
            profits += building.calcProfits();
        }
        return profits;
    }
}
