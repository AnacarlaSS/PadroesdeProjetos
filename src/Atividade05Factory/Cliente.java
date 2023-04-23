package Atividade05Factory;

public class Cliente {
    public static  void Principal(String[] args){
        FabricaChevrolet Celta = new FabricaChevrolet();
        FabricaFord Fiesta = new FabricaFord();
        FabricaVolkswagen Gol = new FabricaVolkswagen();
        FabricaFiat Ford = new FabricaFiat();


    }
}
