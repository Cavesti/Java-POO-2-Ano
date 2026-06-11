public class Quadrado extends Paralelogramo {

   
   public Quadrado(double lado1,double lado2){
      
      super(lado1,lado2);
   
   }
   
   
   public double calcularArea(){
   
      return  lado1*lado1;
   
   }

   public double calcularPerimetro(){
   
      return lado1+lado1+lado1+lado1;
   
   }

   public void diminuirFigura(double valor){
   
      this.lado1 = this.lado1 - valor;
   
   }
   
   
   public void aumentarFigura(double valor){
   
      this.lado1= this.lado1 + valor;
   
   }

   
   public void setlado1(double lado1){
   
      this.lado1=lado1;
   
   }
   
   public double getlado1(){
      
      return this.lado1;   
   
   }
   
      @Override
         public String toString(){
         
            return "Lado 1: " + lado1 + "|Perimetro: "+calcularPerimetro() + "|Area: "+calcularArea();
         
         }
   
   
   
   
   
   



}