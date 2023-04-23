package Atividade05Factory;

public class FabricaFord implements FabricaDCarro {
    public Carro criarCarro() {
        return new Fiesta();
    }
}
