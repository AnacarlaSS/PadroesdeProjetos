package Atividade03Builder;

public class MontadoraDirector {
    private CarroBuilder Montadora;

    public MontadoraDirector(CarroBuilder montadora){
        this.Montadora=montadora;
    }
    public void construirCarro(){
        Montadora.cacidadetanqueBuilder();
        Montadora.combustivelBuilder();
        Montadora.controleestabilBuilder();
        Montadora.modeloBuilder();
        Montadora.motorBuilder();
        Montadora.TorqueBuilder();
        Montadora.velocidadeMaximaBuilder();
        Montadora.VálvulasBuilder();
    }

    public Carrocorridaproduct getCarro() {
        return Montadora.getCarro();
    }
}
