package Atividade06AbstractyFactory;

public class CrroLuxoFactory extends CarroFactory{
    @Override
    public Roda montarRoda() {
        return new RodaLigaLeve();
    }

    @Override
    public Som montarSom() {
        return new CDPlayer() ;
    }
}
