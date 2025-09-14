public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        Car sportsCar = director.createSportsCar();
        Car suv = director.createSUV();

        System.out.println(sportsCar);
        System.out.println(suv);

        Car customCar = new Car.CarBuilder()
                .setEngine("Electric")
                .setSeats(4)
                .setGPS(false)
                .setAirConditioner(true)
                .setColor("white")
                .build();

        System.out.println(customCar);
    }
}