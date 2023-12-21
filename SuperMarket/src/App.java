import Classes.Market;
import Classes.OrdinaryClient;
import Classes.PromoClient;
import Classes.SpecialClient;
import Classes.TaxService;
import Interfaces.iActorBehaviour;

public class App {
    public static void main(String[] args) throws Exception {
        Market market = new Market();
        iActorBehaviour client1 = new OrdinaryClient("User1");
        iActorBehaviour client2 = new OrdinaryClient("User2");
        iActorBehaviour client3 = new SpecialClient("Guber"+" статуса: VIP", 1);
        iActorBehaviour client4 = new PromoClient("Ivan"+ " участвующий в акции", 12);

        market.acceptToMarket(client1);
        market.acceptToMarket(client2);
        market.acceptToMarket(client3);
        market.acceptToMarket(new TaxService());
        market.acceptToMarket(client4);

        market.update();
    }
}
