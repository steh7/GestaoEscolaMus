public class Aluno extends Pessoa implements Identificavel {
    private String numeroMatricula;

    public Aluno(String nome, int idade, String numeroMatricula) {
        super(nome, idade);
        this.numeroMatricula = numeroMatricula;
    }

    @Override
    public String atividade() {
        return "Frequenta aulas e pratica instrumentos.";
    }

    @Override
    public String getId() {
        return "Matrícula: " + numeroMatricula;
    }
}
