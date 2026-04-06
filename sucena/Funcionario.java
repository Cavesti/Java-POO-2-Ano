public class Funcionario extends Pessoa{

   private int registro;
   private double salario;
   
   public Funcionario(String nome, String telefone, Data nascimento, int registro, double salario){
   
       super(nome, nascimento);
       this.registro=registro;
       this.salario=salario;
       
   
   
   }
   
   public void setRegistro(int registro){
      this.registro=registro;
   }
   
   public void setSalario(double salario){
      this.salario=salario;
   }
   public int getRegistro(){
      return this.registro;
   }
   public double getSalario(){
      return this.salario;
   }


}
// aq deu um erro de tipo ah telefone private acess in Pessoa
// pra resolver, vc coloca o super com os parametros da classe pessoa,
// dai ele puxa as coisas e vc so adiciona as coisas novas
