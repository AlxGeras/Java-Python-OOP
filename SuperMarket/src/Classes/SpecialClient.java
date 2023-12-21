/**
 * Класс SpecialClient:
 * 1. покупатель со статусом
 * 2. Наследник от класса actor + idVip для идентификации покупателя.
 * 3. выполнение и прием заказов.
 */
package Classes;

public class SpecialClient extends Actor {
    private int idVIP;

    public SpecialClient(String name, int idVIP) {
        super(name);
        this.idVIP = idVIP;
    }

    public int getId() {
        return idVIP;
    }

    @Override
    public String getName() {
        return super.name;
    }

    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    public void setTakeOrder(boolean makeOder) {
        super.isMakeOrder = makeOder;
    }

    public void setMakeOrder(boolean pikUpOrder) {
        super.isTakeOrder = pikUpOrder;
    }

    public Actor getActor() {
        return this;

    }

    /**
     * @return
     *         проверка заявка на возврат
     */
    public boolean isRetornOrder() {
        return super.isRetornOrder;
    }

    /**
     * @return
     *         проверка на получение денег
     */
    public boolean isCash() {
        return super.isCash;
    }

    /**
     * @param RetornOrder
     *                    заявка на возврат
     */
    public void setRetornOrder(boolean RetornOrder) {
        super.isRetornOrder = RetornOrder;
    }

    /**
     * @param Cash
     *             покупатель забрал деньги
     */
    public void setCash(boolean Cash) {
        super.isCash = Cash;
    }

    
}