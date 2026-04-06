public class Pessoa{
   private String nome;
   private String telefone=" ";
   private Data nascimento;
   
   public void getNome(String nome){
      this.nome=nome;
   }
   public void getTelefone(String telefone){
      this.telefone=telefone;
   }
   public String setNome(){
      return this.nome;
   }
   public String setTelefone(){
      return this.telefone;
   }
   
   public Pessoa(String nome, String telefone, Data nascimento){
       this.nome=nome;
       this.telefone=telefone;
       this.nascimento=nascimento;
   
   }
   
   public Pessoa(String nome, Data nascimento){
       this.nome=nome;
       this.nascimento=nascimento;
   
   }
   
   @Override
   public String toString(){
   
      return "Nome: " + nome + ", Telefone: " + telefone + ", Data de nascimento: " + nascimento;
   
   }

   

}