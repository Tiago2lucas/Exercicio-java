
/*No método "main" de uma classe chamada "GerenciadorFuncionarios", crie um array de objetos do tipo "Funcionario" e preencha-o com instâncias de gerentes e vendedores. 
Em seguida, itere sobre o array e imprima o nome e o salário de cada funcionário. */

public class GerenciadorFuncionarios {
    

public static void main(String[] args) {
    
  Funcionario f[]= new Funcionario [5];
  
  
f [0]= new Gerente("Tiago", 2500, 50f);
f[1]= new Vendedor("Lucas", 1850, 39);


System.out.println(f[0].toString());
System.out.println(f[1].toString());





}

}
