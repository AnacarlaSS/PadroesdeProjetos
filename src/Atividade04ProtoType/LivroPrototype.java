package Atividade04ProtoType;

public abstract class LivroPrototype {
 String título  ;
 String  nomeDoAutor ;
 String Dedicatórias;


 public  String  getTitulo (){
  return título;
 }
 public  String  getNomeDoAutor (){
  return  nomeDoAutor ;
 }
 public  String  getDedicatória (){
  return  Dedicatórias ;
 }

 public  void  setTitulo ( String  titulo ){
  this.título = título ;
 }
 public  void  setNomeDoAutor ( String  nomeDoAutor ){
  this.nomeDoAutor = nomeDoAutor ;
 }
 public  void  setDedicatoria ( String  dedicatoria ){
  this.Dedicatórias = dedicatoria ;
 }

 public  abstract  void  imprimir ();

 public  abstract LivroPrototype clonar();
}


