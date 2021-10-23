import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean flag = false;
        String content = "";
        Funcionario[] vetor = new Funcionario[5];

        do{
            for (int i = 0; i < 5; i++){
                String nome;
                double salario;
            
                try{
                    
                    System.out.println("Digite o nome do funcionario " + i);
                    nome = s.nextLine();

                    System.out.println("Digite o salario do funcionario " + i);
                    salario = Double.parseDouble(s.nextLine());

                    vetor[i] = new Funcionario(nome, salario);

                    content += vetor[i].getNome() + "-" + vetor[i].getSalario() + "\n";

                }
                catch(NumberFormatException e){
                    flag = false;
                    System.out.println("entrada invalida.");
                }
            }
            Arquivo.Write("arq.txt", content);
        }while(flag == false);

    }
}