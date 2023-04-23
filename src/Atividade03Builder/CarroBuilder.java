package Atividade03Builder;

public abstract class CarroBuilder {
     protected Carrocorridaproduct carro;

     public CarroBuilder () {
           carro = new Carrocorridaproduct();
     }
     public abstract void modeloBuilder();
     public abstract void motorBuilder();
    public abstract void combustivelBuilder();
    public abstract void cacidadetanqueBuilder();
    public abstract void controleestabilBuilder();
    public abstract void velocidadeMaximaBuilder();
    public abstract void VálvulasBuilder();
    public abstract void TorqueBuilder();
    public Carrocorridaproduct getCarro() {
        return carro;
    }
}
