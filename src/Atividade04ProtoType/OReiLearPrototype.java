package Atividade04ProtoType;

public class OReiLearPrototype extends  LivroPrototype {

    public  OReiLearPrototype (){

    }
    OReiLearPrototype  ( OReiLearPrototype  novo ){

        this.título = "O Rei Lear" ;
        this.nomeDoAutor = "William Shakespeare" ;
        this.Dedicatórias = novo . getDedicatória ();
    }


    public  void  imprimir () {

        System.out.println ( "O livro " + this.título + "do autor " + this.nomeDoAutor + "Dedicado a " + getDedicatória());

    }


    public  OReiLearPrototype  clonar () {

        return  new  OReiLearPrototype (this);
    }

}
