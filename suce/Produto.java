public class Produto{

   private String nome;
   private int quantidade;
   private float preco;
   
   public void setNome(String nome){
            this.nome=nome;
           }
   public void setQuantidade(int quantidade){
   
      if(quantidade>=0)
         this.quantidade=quantidade;
      else System.out.println("Valores negativos nao sao permitidos");
   
        }
        
   public void setPreco(float preco){
      if(preco>=0)
         this.preco=preco;
      else System.out.println("Preco invalido");
      
   
      }  
        
        
        
   public String getNome(){
   
   return this.nome;
   
      }

   public int getQuantidade(){
   
      return this.quantidade;
   
   }

   public float getPreco(){
  
  
      return this.preco;  
   
   }


   public void vender(int qtde){
   
      if(qtde>0 && qtde<=this.quantidade)
               this.quantidade=this.quantidade-qtde;
      else System.out.println("Nao foi possivel realizar a venda.");
   
   }
   
   public void comprar(int qtde){
   
   if(qtde>0)
      this.quantidade = this.quantidade+qtde;
   else System.out.println("Nao e possivel comprar essa quantidade");   
   
   }
   public void reajustar(int percent){
   
      if(percent>0 && percent<=100)
      
         this.preco= this.preco + ((this.preco * percent)/100);
         
      else System.out.println("Nao foi possivel realizar o reajuste");   
   
   
   }
   
   public void imprimir(){
   
      System.out.println("Nome: "+this.nome);
      System.out.println("Preco: "+this.preco);
      System.out.println("Quantidade: "+this.quantidade);
   
   }
   
}