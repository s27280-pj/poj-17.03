package Vehicle;

class VehicleProg {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        minivan.passengers = 6;
        minivan.fuelcap = 70;
        minivan.lkm = 8;

        sportscar.passengers = 2;
        sportscar.fuelcap = 50;
        sportscar.lkm = 16;

        System.out.printf("Minivan przewozi %d osob na odleglosc do %d kilometrow\n", minivan.passengers, minivan.range());
        System.out.printf("Auto sportowe przewozi %d osoby na odleglosc do %d kilometrow\n", sportscar.passengers, sportscar.range());

        double fuelNeededMinivan = minivan.fuelNeeded(875);
        double fuelNeededSportscar = sportscar.fuelNeeded(440);
        System.out.printf("Minivan potrzebuje %.2f litrow paliwa\n", fuelNeededMinivan);
        System.out.printf("Auto sportowe potrzebuje %.2f litrow paliwa\n", fuelNeededSportscar);
    }
}