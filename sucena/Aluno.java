
public class Aluno extends Pessoa{

   private String  ra;
   
   public Aluno(String nome, Data nascimento, String ra){
   
      super(nome,nascimento);
      this.ra=ra;
   
   }
   public String getRa(){
      return this.ra;
   }
   public void setRa(String ra){
      this.ra=ra;
   }
   
   @Override
   public String toString(){
      return super.toString() + "\nRA: " + this.ra;
   }

}