package Atividade05Factory;

//Ana Carla S. Santos
public abstract class FabricadeCarro {
    public Carro criarCarro(ModelodeCarro modelo) {
        switch (modelo) {
            case celta:
                return new Celta();
            case fiesta:
                return new Fiesta();
            case gol:
                return new Gol();
            case palio:
                return new Palio();
            default:
                break;
        }
        return null;
    }
}
