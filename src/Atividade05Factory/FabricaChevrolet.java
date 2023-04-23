package Atividade05Factory;

public class FabricaChevrolet implements FabricaDCarro{
    public Carro criarCarro() {
        return new Celta();
    }
}
