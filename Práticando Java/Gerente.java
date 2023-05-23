/*Crie uma classe chamada "Gerente" que herde da classe "Funcionario". A classe "Gerente" 
deve possuir um atributo privado adicional:

bonus (double): representa o bônus a ser acrescido ao salário base do gerente.
A classe "Gerente" deve possuir um construtor que receba e inicialize o nome, o salário base e o bônus do gerente. */


public class Gerente extends Funcionario{
private double bonusPercentual;


    public Gerente(String n, double sb, double bo) {
        super(n, sb);
        setBonusPercentual(bo);
        calcularBonus();
    }
    
    protected double getBonusPercentual() {
        return bonusPercentual;
    }


    protected void setBonusPercentual(double bon) {
       try{ if (bon > 0) {
            this.bonusPercentual = bon;
        } else {
            throw new IllegalArgumentException("O bônus não pode ser negativo.");
        }
    }catch(IllegalArgumentException | ArrayIndexOutOfBoundsException | ArithmeticException e){
        e.printStackTrace();
    } 
     finally{
        System.out.println("Código Finalizado");
    }
    
    }

protected double calcularBonus(){
double total = getSalarioBase() * (bonusPercentual/100);
return getSalarioBase() + total;
}

@Override
public String toString() {
    
    return super.toString()+ " [bonus de " + this.bonusPercentual + " Porcento  do seu salario" + 
    " Valor total do salario e..: " + this.calcularBonus() ;
}

}
