public class Circulo implements FiguraGeometrica,FiguraEscalavel {
   
   private double raio;
   
   public double calcularArea(){
   
   return (3.1415*raio*raio);
   
   }
   
   public double calcularPerimetro(){
   
      return (2*3.1415*raio);
   
   }

   public void diminuirFigura(double valor){
   
      this.raio=this.raio - valor;
   
   }
   
   
   public void aumentarFigura(double valor){
   
      this.raio=this.raio + valor;
   
   }

   
   public void setraio(double raio){
   
      this.raio=raio;
   
   }
   
   public double getraio(){
      
      return this.raio;   
   
   }

   public Circulo(double raio){
   
      this.raio=raio;
   
   }
   
   
   
   
   @Override
         public String toString(){
         
            return "Raio: "+ raio+  "|Perimetro: " + calcularPerimetro() + "|Area: " + calcularArea();
         
         }

   

}