public class Car {
    private final String engine;
    private final int seats;
    private final boolean gps;
    private final boolean airConditioner;
    private final String color;

    private Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.seats = builder.seats;
        this.gps = builder.gps;
        this.airConditioner = builder.airConditioner;
        this.color = builder.color;
    }

    public String getEngine() { return engine; }
    public int getSeats() { return seats; }
    public boolean hasGPS() { return gps; }
    public boolean hasAirConditioner() { return airConditioner; }
    public String getColor() { return color; }

    @Override
    public String toString() {
        return "Car [engine=" + engine + ", seats=" + seats +
                ", gps=" + gps + ", airConditioner=" + airConditioner + ", color=" + color + "]";
    }

    public static class CarBuilder {
        private String engine;
        private int seats;
        private boolean gps;
        private boolean airConditioner;
        private String color;


        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder setSeats(int seats) {
            this.seats = seats;
            return this;
        }

        public CarBuilder setGPS(boolean gps) {
            this.gps = gps;
            return this;
        }

        public CarBuilder setAirConditioner(boolean airConditioner) {
            this.airConditioner = airConditioner;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;

        }
        public Car build() {
            return new Car(this);
        }
    }
}
