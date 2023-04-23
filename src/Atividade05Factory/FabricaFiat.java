package Atividade05Factory;

public class FabricaFiat implements FabricaDCarro {
    public Carro criarCarro() {
        return new Palio();
 }
}
