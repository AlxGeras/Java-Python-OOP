/**
 * интерфейс магазина
 */
package Interfaces;

import java.util.List;
import Classes.Actor;

public interface iMarketBehaviour {
    /**
     * @param actor клиент вошел в магазин
     */
    void acceptToMarket(iActorBehaviour actor);

    /**
     * @param actors клиент покинул магазин
     */
    void releaseFromMarket(List<Actor> actors);

    void update();
}