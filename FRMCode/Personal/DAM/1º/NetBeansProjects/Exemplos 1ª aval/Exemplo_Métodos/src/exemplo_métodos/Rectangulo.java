package exemplo_métodos;

public class Rectangulo {
    private float base,altura;
    //constructores
    // 1º:Predeterminado de java
    public Rectangulo(){
    
}
    
    // 2º Instanciado personal.
    public Rectangulo(float base,float altura){
        this.base=base;
        this.altura=altura;
    }
//metodos de acceso, sets e gets

public void setBase(float b){
base=b;
}
public float getBase (){
return base;
}
public void setAltura(float a){
altura=a;
}
public float getAltura (){
return altura;
}

public void amosar(){
    System.out.println("A base é de "+getBase()+"uds.\n "
            + "e a altura é de "+getAltura()+"uds.");
} 
public void calcArea(float ba,float hi ){
System.out.println("A área do rectangulo é de "+(ba*hi)+" unidades ó cuadrado.");
}
public float calcPerim(float ba,float hi){
    float perim=(2*ba+2*hi);
    System.out.println("O perimetro do rectangulo é de "+perim+"unidades ó cuadrado.");
    return perim;
}

public String visualizar(){
    return ("base="+base+", Altura="+altura);
}
}