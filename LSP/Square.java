package LSP;
/**
 * наследник Rectangle
 */
public class Square extends Rectangle {
    /**
     * @param length длина 
     */
    @Override
    public void setWidth(int length) {
        super.setWidth(length);
        super.setHeight(length);
    }

 
    @Override
    public void setHeight(int length) {
        super.setWidth(length);
        super.setHeight(length);
    }
}
