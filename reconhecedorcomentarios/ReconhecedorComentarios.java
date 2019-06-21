package reconhecedorcomentarios;

import java.util.Scanner;
//
public class ReconhecedorComentarios{
    int count;
    char palavra[]; 
    public static void main(String[] args) {
      ReconhecedorComentarios r = new ReconhecedorComentarios();
      String sentenca;
      Scanner entrada = new Scanner(System.in);
      System.out.println("Digite  Sentenca");
      sentenca = entrada.nextLine();
      r.palavra = sentenca.toCharArray();
      r.Iniciar();
    }
    
    public void Iniciar(){
       count = 0;
       Q0();
    }
    public void Q0(){
       if(count < palavra.length){
         if(palavra[count] == '*'){
           erro();
         }
         else if(palavra[count] == '/'){
           count++;
           Q1();
         }
         else{
            erro();
         }
       }
       else{
         erro();
       }
    }
    public void Q1(){
     if(count < palavra.length){
         if(palavra[count] == '*'){
           count++;
           Q4();
         }
         else if(palavra[count] == '/'){
           count++;
           Q3();
         }
         else{
            erro();
         }
       }
       else{
         erro();
       }
    }
    public void Q3(){
       System.err.println("Sentenca do Automato aceita ");
    }
    public void Q4(){
       if(count < palavra.length){
         if(palavra[count] == '/'){
           count++;
           Q4();
         }
         else if(palavra[count] == '*'){
           count++;
           Q5();
         }
         else{
            erro();
         }
       }
       else{
         erro();
       }
    }
    public void Q5(){
      if(count < palavra.length){
         if(palavra[count] == '*'){
           count++;
             Q5();
         }
         else if(palavra[count] == '/'){
           count++;
           Qf();
         }
         else{
            erro();
         }
       }
       else{
         erro();
       }
    }
    public void Qf(){
       if(palavra.length == 0){ 
          System.err.println("Sentenca do Automato aceita ");
       }
       else if(palavra[count] == '/'){
          count++;
          Q1();
       }
       else{
          erro();
       }
     }
    public void erro(){
      System.err.println("Sentenca do Automato nao aceita ");
    }
}
