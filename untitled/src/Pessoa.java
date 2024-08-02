import java.util.ArrayList;

public abstract class Pessoa {
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


    public String getCpf(){
        return cpf;
    }


    public abstract ArrayList<Automovel> getAutomoveis();



        public abstract void registrarAutomvel(Automovel automovel);

}
