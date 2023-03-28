package Vehicle;

class Vehicle {
    int passengers;
    int fuelcap;
    double lkm;

    double fuelNeeded(int km) {
        return km / 100.0 * lkm;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getFuelcap() {
        return fuelcap;
    }

    public void setFuelcap(int fuelcap) {
        this.fuelcap = fuelcap;
    }

    public double getLkm() {
        return lkm;
    }

    public void setLkm(double lkm) {
        this.lkm = lkm;
    }

    int range() {
        return (int) (fuelcap / lkm * 100) * passengers;
    }
}