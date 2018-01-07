package creational_patterns.builder;

public class Car {

    // Required parameters
    private final String brand;
    private final String type;

    // Optional parameters
    private final int power;
    private final int torque;
    private final int gears;
    private final String color;

    // Changed to protected
    protected Car(Builder builder) {
        this.brand = builder.brand;
        this.type = builder.type;
        this.power = builder.power;
        this.torque = builder.torque;
        this.gears = builder.gears;
        this.color = builder.color;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public int getPower() {
        return power;
    }

    public int getTorque() {
        return torque;
    }

    public int getGears() {
        return gears;
    }

    public String getColor() {
        return color;
    }

    // New methods below
    protected Builder newBuilder() {
        return new Builder(getBrand(), getType());
    }

    protected Builder decorate(Builder builder) {
        return builder.withPower(  getPower() )
        			  .withTorque( getTorque() )
        			  .withGears(  getGears() )
        			  .withColor(  getColor() );
    }

    public Builder toBuilder() {
        return decorate(newBuilder());
    }
    
    public static class Builder {

        // Required parameters
        private final String brand;
        private final String type;

        // Optional parameters
        private int power;
        private int torque;
        private int gears;
        private String color;

        public Builder(String brand, String type) {
            this.brand = brand;
            this.type = type;
        }

        public Builder withPower(int power) {
            this.power = power;
            return this;
        }

        public Builder withTorque(int torque) {
            this.torque = torque;
            return this;
        }

        public Builder withGears(int gears) {
            this.gears = gears;
            return this;
        }

        public Builder withColor(String color) {
            this.color = color;
            return this;
        }

        public Car build() {
            return new Car(this);
        }

    }
}