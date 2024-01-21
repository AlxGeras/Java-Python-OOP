package LSP;

public class Rectangle {
    protected int width;
    protected int height;

    /**
     *
     * @param width ширина
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     *
     * @param height высота
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     *
     * @return площадь
     */
    public int area() {
        return this.width * this.height;
    }
}
