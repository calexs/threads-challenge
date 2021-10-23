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
    
    public static void mensagemLogger(String nn, double vv){
        System.out.println("funcionario com nome " + nn + " e salario " + vv " cadastrado.";
     }

    public static Funcionario getInstance(String valorNome, double valorSalario){
        if (instancia == null){
            instancia = new Funcionario(valorNome, valorSalario);         
            Thread minhaThread = new Thread(Funcionario.mensagemLogger(n, s));
            minhaThread.Start();
        }
        return instancia;
    }    
}
