/** 
 Абстрактный класс.
 интерфейс iActorBehaviour
 интерфейс iReturnOrder
  
*/
package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

/** базовый класс */

public abstract class Actor implements iActorBehaviour,iReturnOrder {
    
    protected String name; 
   /** выполнение заказа */
    protected boolean isTakeOrder;
    /** получение заказа */
    protected boolean isMakeOrder;
    /** оплата */
    protected boolean isCash;
    /** Возврат товара */
    protected boolean isRetornOrder;

    /** конструктор
     * @param name имя
     */
    public Actor(String name) {
        this.name = name;
    }

    abstract public String getName();

}