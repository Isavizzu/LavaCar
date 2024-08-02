import java.util.ArrayList;
import java.util.Date;

public class Funcionario extends Pessoa{
    private ArrayList<Servico> servicos;
    private String cargo;


    public Funcionario(String nome, String cpf, String telefone, String cargo) {
        super(nome, cpf, telefone);
        this.servicos = new ArrayList<Servico>();
        this.cargo = cargo;
    }

    public String registrarServico(Cliente cliente, Funcionario funcionario, Automovel automovel, Date data, double preco){
        servicos.add(new Servico(data, preco, cliente, funcionario, automovel));
        return "Serviço para dia " + data + " do " +cliente.getNome() + " registrado!";
    }


    public String cadastrarAutomovel(String modelo, String placa, String marca, int ano, String cor, String tipo, Cliente cliente){
        Automovel automovel = new Automovel(modelo,placa,marca,ano,cor,tipo);
        cliente.registrarAutomvel(automovel);
        return "Novo(a) " + automovel.getModelo() + " da placa " + automovel.getPlaca() + " cadastrado!";
    }


    public Pessoa cadastrarPessoa(String nome, String cpf, String telefone, String cargo, int opt){
        if (opt == 1){
            return new Cliente(nome, cpf, telefone);
        }
        return new Funcionario(nome, cpf, telefone, cargo);
    }
}
