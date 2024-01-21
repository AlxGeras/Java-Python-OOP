package ISP;

public class Cub implements Area, Volume {
    private int edge;

    public Cub(Integer edge) {
        this.edge = edge;
    }

    @Override
    public double area() {
        return 6 * edge * edge;
    }

    @Override
    public double volume() {
        return edge * edge * edge;
    }

}
