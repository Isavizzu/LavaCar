public class Pessoa {
    private String nome;
    private String cpf;
    private String telefone;

    public Pessoa(String nome, String cpf, String telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public String getNome(){
        return nome;
    }

    public String cadastrarPessoa(String nome, String cpf, String telefone){
        Pessoa  = super(nome, cpf, telefone);
        return "Novo(a) Cliente " + automovel.getPlaca() + " cadastrado!";
    }
}
