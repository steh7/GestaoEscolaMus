public class Funcionario extends Pessoa implements Identificavel {
    private String numeroCracha;

    public Funcionario(String nome, int idade, String numeroCracha) {
        super(nome, idade);
        this.numeroCracha = numeroCracha;
    }

    @Override
    public String atividade() {
        return "Realiza tarefas administrativas.";
    }

    @Override
    public String getId() {
        return "Crachá: " + numeroCracha;
    }
}
