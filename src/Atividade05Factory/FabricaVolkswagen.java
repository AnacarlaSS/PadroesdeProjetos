package Atividade05Factory;

public class FabricaVolkswagen implements FabricaDCarro{

    @Override
    public Carro criarCarro() {
        return new Gol();
    }
}
