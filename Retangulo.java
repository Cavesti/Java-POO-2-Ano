public class Retangulo extends Paralelogramo {

   
   
   public Retangulo(double lado1, double lado2){
   
   super(lado1,lado2);
   
   }
   
    public double calcularArea(){
   
      return  lado1*lado2;
   
   }


    public double calcularPerimetro(){
   
      return lado1+lado1+lado2+lado2;
   
   }



   public void diminuirFigura(double valor){
   
      this.lado1 = this.lado1 - valor;
      this.lado2 = this.lado2 - valor;
      
   
   }




 public void aumentarFigura(double valor){
   
      this.lado1 = this.lado1 + valor;
      this.lado2 = this.lado2 + valor;
      
   
   }


   public void setlado1(double lado1){
   
      this.lado1=lado1;
   
   }
   
   public double getlado1(){
      
      return this.lado1;   
   
   }


   public void setlado2(double lado2){
   
      this.lado2=lado2;
   
   }
   
   public double getlado2(){
      
      return this.lado2;   
   
   }


@Override
         public String toString(){
         
            return "Lado 1: " + lado1 + "|Lado 2: " + lado2 + "|Perimetro: " + calcularPerimetro() + "|Area: " + calcularArea();
         
         }




}