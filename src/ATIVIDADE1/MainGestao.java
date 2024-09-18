import java.util.ArrayList;

public class MainGestao {
    public static void main(String[] args) {
        // Criando um ArrayList para armazenar objetos Pessoa
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        // Criando instâncias de Aluno, Professor e Funcionario
        Aluno aluno = new Aluno("João", 20, "A123");
        Professor professor = new Professor("Maria", 45, "P456");
        Funcionario funcionario = new Funcionario("Carlos", 35, "F789");

        // Adicionando as pessoas à lista
        pessoas.add(aluno);
        pessoas.add(professor);
        pessoas.add(funcionario);

        // Usando polimorfismo para percorrer a lista e exibir as atividades e identificadores
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getClass().getSimpleName() + ":");
            System.out.println("Nome: " + pessoa.nome);
            System.out.println("Idade: " + pessoa.idade);
            System.out.println("Atividade: " + pessoa.atividade());

            if (pessoa instanceof Identificavel) {
                Identificavel identificavel = (Identificavel) pessoa;
                System.out.println("ID: " + identificavel.getId());
            }
            System.out.println();
        }
    }
}
