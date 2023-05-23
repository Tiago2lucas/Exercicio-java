
/*
Crie uma classe chamada "Vendedor" 
que herde da classe "Funcionario". A classe "Vendedor" deve possuir um atributo privado adicional:

comissao (double): representa a comissão a ser acrescida ao salário base do vendedor.
A classe "Vendedor" deve possuir um construtor que receba e inicialize o nome, o salário base e a comissão do vendedor.

Ambas as classes "Gerente" e "Vendedor" devem implementar um método chamado "calcularSalario"
que retorne o salário total do funcionário (salário base + bônus ou comissão). */

public class Vendedor extends Funcionario{

private double comissao;

    public Vendedor(String n, double sb, double co ) {
        super(n, sb);
        setComissao(co);
        
    }

public double getComissao() {
    return comissao;
}

    public void setComissao(double comissao) {
        try{ if( comissao >0){
            this.comissao = comissao;

        } else{
            throw new ArithmeticException("Comissao invalida, valor de Comissão não pode ser zero.");
        } 
    }catch (ArithmeticException | IllegalArgumentException e) {
    
        e.printStackTrace();
    }
    }
    protected double calcularBonus(){
        double total = getSalarioBase() * (comissao/100);
        return getSalarioBase() + total;
        }

        
        @Override
        public String toString() {
            
            return super.toString()+ "Valor da sua comissao..: " + comissao+ " Total do seu Salario..:" + this.calcularBonus();
        }
    
}
