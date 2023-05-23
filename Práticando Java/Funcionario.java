
/*Crie uma classe abstrata chamada "Funcionario" que possua os seguintes atributos privados:

nome (String): representa o nome do funcionário.
salarioBase (double): representa o salário base do funcionário.
A classe "Funcionario" deve possuir um construtor que receba e inicialize o nome e o salário base. */

public abstract class Funcionario{

private String nome;
private double salarioBase;


public Funcionario( String n, double sb) {
    setNome(n);
    setSsalarioBase(sb);
}
protected String getNome(){
return this.nome;

}
protected void setNome( String n){
    this.nome= n;
}

protected double getSalarioBase(){
    return this.salarioBase;
}

protected void setSsalarioBase( double sa){
    this.salarioBase= sa;
}

@Override
public String toString() {
    
    return  " Funcionario [ [ Nome..:" + this.nome + ", Salario..:" + this.salarioBase + "]";
}

}