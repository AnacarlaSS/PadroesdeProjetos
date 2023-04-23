package Atividade04ProtoType;

public class MobyDickPrototype extends LivroPrototype {
    public  MobyDickPrototype (){

    }
    MobyDickPrototype ( MobyDickPrototype  novo ){

        this.título = "Moby Dick" ;
        this.nomeDoAutor = "Herman Melville " ;
        this.Dedicatórias = novo . getDedicatória ();
    }


    public  void  imprimir () {

        System.out.println ( "O livro " + this.título + " do autor " + this . nomeDoAutor + " Dedicado a " + getDedicatória ());

    }



    public  MobyDickPrototype  clonar () {

        return  new  MobyDickPrototype ( this );
    }

}

