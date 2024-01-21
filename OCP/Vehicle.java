package OCP;

public abstract class Vehicle {
    int maxSpeed;
    String type;

    /**
     *
     * @param maxSpeed макс скорость т\с
     * @param type     тип т\с
     */
    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    /**
     * @return макс скорость
     */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
     * @return тип т\с
     */
    public String getType() {
        return this.type;
    }

 
    public abstract double calculateAllowedSpeed();

}
