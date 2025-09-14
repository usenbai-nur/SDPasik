public class Director {
    public Car createSportsCar() {
        return new Car.CarBuilder()
                .setEngine("V8 turbo")
                .setSeats(2)
                .setGPS(true)
                .setAirConditioner(true)
                .setColor("red")
                .build();
    }

    public Car createSUV() {
        return new Car.CarBuilder()
                .setEngine("V6 diesel")
                .setSeats(7)
                .setGPS(true)
                .setAirConditioner(true)
                .setColor("black")
                .build();
    }
}
