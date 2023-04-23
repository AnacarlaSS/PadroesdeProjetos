package Atividade04ProtoType;

// ANA CARLA DE S. SANTOS

public class Cliente {
    public  static  void  principal ( String [] args ) {
        System.out.println();

        OReiLearPrototype  livroPrototype01 = new  OReiLearPrototype ();
        OReiLearPrototype  OReiLearPrototype1 =   livroPrototype01.clonar();

        OReiLearPrototype1.setDedicatoria ( "Ana" );
        OReiLearPrototype1.imprimir ();

        OReiLearPrototype  OReiLearPrototype2 =   livroPrototype01.clonar();

        OReiLearPrototype2.setDedicatoria( "Carlos" );
        OReiLearPrototype2.imprimir();

        MobyDickPrototype  livroPrototype02 = new  MobyDickPrototype ();
        MobyDickPrototype  MobyDickPrototype01 =   livroPrototype02.clonar();

        MobyDickPrototype01.setDedicatoria ( "Max" );
        MobyDickPrototype01.imprimir ();

        MobyDickPrototype  MobyDickPrototype02 =   livroPrototype02.clonar();

        MobyDickPrototype02.setDedicatoria ( "Caio" );
        MobyDickPrototype02.imprimir ();
    }
}
