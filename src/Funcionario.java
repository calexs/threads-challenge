public class Funcionario{

    private static Funcionario instancia;
    private double salario;
    private String nome;

    private Funcionario(String n, double s){
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ex){
            ex.printStackTrace();
        }
        nome = n;
        salario = s;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String valor){
        nome = valor;
    }

    public Double getSalario(){
        return salario;
    }

    public void setSalario(double valor){
        salario = valor;
    }

    public static Funcionario getInstance(String valorNome, double valorSalario){
        if (instancia == null){
            instancia = new Funcionario(valorNome, valorSalario);         
            
        }
        return instancia;
    }    
}