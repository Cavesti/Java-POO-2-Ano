public class Data{

   private int dia;
   private int mes;
   private int ano;
   
   
   
   public void setDia(int dia){
      if(dia>31 || dia<1){
         System.out.println("Dia invalido");
      }
      this.dia=dia;
    }
   
   public void setMes(int mes){
   
      if(mes>12 || mes<1){
      System.out.println("Mes invalido");
   }
      this.mes=mes;
      
   }
   
   public void setAno(int ano){
      this.ano=ano;
   
   }
   
   public int getDia(){
      return this.dia;
   }
   
   public int getMes(){
      return this.mes;
   }
   
   public int getAno(){
      return this.ano;
   }
   
   
   public Data(int dia, int mes, int ano){
   
      this.dia=dia;
      this.mes=mes;
      this.ano=ano;
   
   }
   @Override
   public String toString(){
      return "Dia: "+ dia + ", Mes: " + mes + ", Ano: " + ano;
      
   }
    
}