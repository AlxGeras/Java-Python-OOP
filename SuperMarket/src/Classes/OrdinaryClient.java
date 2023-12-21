/**
 * Класс OrdinaryClient:
 * 1. обычный клиент
 * 2. Наследник Класса Actor
 */
package Classes;

public class OrdinaryClient extends Actor {

    public OrdinaryClient(String name) {
        super(name);
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