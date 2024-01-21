package OCP;

public class Car extends Vehicle {
    /**
     * Конструктор
     *
     * @param maxSpeed макс скорость авто
     */
    public Car(int maxSpeed) {
        super(maxSpeed, "brand");
    }

    /**
     * @return разрешенная
     */
    @Override
    public double calculateAllowedSpeed() {
        return getMaxSpeed() * 0.8;
    }
}