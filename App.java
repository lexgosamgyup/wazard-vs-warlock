public class App {
    public static void main(String[] args) throws Exception {
       
        System.out.println("=============================");
        System.out.println("~~~~~~~~The Undefiable Battle Between a Wizard and a Warlock Begins!~~~~~~~~");
        System.out.println("=============================");
        
        Wizard CaptainMarvel = new Wizard("CaptainMarvel");
        Warlock WandaVision = new Warlock("WandaVision");
        CaptainMarvel.Polymorph(WandaVision);
        CaptainMarvel.WaterTide(WandaVision);
        WandaVision.Meteor(CaptainMarvel);
        CaptainMarvel.Firebolt(WandaVision);
        WandaVision.Fireball(CaptainMarvel);
        CaptainMarvel.FireHeal(WandaVision);
        CaptainMarvel.Prestidigitation(WandaVision);
        WandaVision.Tsunami(CaptainMarvel);
        CaptainMarvel.Clone(WandaVision);
     

    }
}

