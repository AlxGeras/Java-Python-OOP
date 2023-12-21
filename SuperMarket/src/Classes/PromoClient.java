/**
 * Класс PromoClient:
 * 1. клиент участ в акции
 * 2. Наследник Класса Actor
 */
package Classes;

public class PromoClient extends Actor {

    private int idProm;

    /**
     * Базовый конструктор
     * 
     * @param name   имя
     * @param idProm номер участника акции
     */
    public PromoClient(String name, int idProm) {
        super(name);
        this.idProm = idProm;
    }

    /**
     * метод для получение номера
     * 
     * @return номер
     */
    public int getIdProm() {
        return idProm;
    }

    public String getName() {
        return super.name;
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    public void setTakeOrder(boolean pickUpOrder) {
        super.isTakeOrder = pickUpOrder;
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
