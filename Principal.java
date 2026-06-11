public class Principal{

   public static void main(String args[]){
   
      FiguraGeometrica[] figuras = new FiguraGeometrica[3];
      
        figuras[0] = new Quadrado(4, 4);
        figuras[1] = new Retangulo(3, 5);
        figuras[2] = new Circulo(7);
        
        for(int i=0; i<figuras.length;i++){
        
         ((FiguraEscalavel) figuras[i]).diminuirFigura(1);
         
         System.out.println(figuras[i].toString());
        
        }
   
   
      for(int i=0; i<figuras.length;i++){
         ((FiguraGeometrica) figuras[i]).calcularArea();
         
         System.out.println(figuras[i].calcularArea());

   
   
   }




}
}