package ISP;

public class Circle implements Area {
    public double radius;

    /**
     * @param radius радиус круга
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 2 * Math.PI * radius;
    }

}
