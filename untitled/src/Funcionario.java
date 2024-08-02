import java.time.LocalDate;
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

    public void registrarServico(Pessoa cliente, Pessoa funcionario, LocalDate data, double preco, Impressao i){
        servicos.add(new Servico(data, preco, cliente, funcionario, encontrarVeiculo(cliente.getAutomoveis(), i, "Digite a Placa do carro")));
        i.imprimir("Serviço para dia " + data + " do " +cliente.getNome() + " registrado!");
    }


    public Automovel encontrarVeiculo (ArrayList<Automovel> automoveis, Impressao i, String mensagem){
        return automoveis.stream().filter(automovel -> automovel.getPlaca().equals(i.pergtString(mensagem))).findFirst().orElse(encontrarVeiculo(automoveis, i, "Placa não Encontrada!\nDigite a Placa do carro"));
    }


    public String cadastrarAutomovel(String modelo, String placa, String marca, int ano, String cor, String tipo, Pessoa cliente){
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

    @Override
    public void registrarAutomvel(Automovel automovel) {}


    public ArrayList<Automovel> getAutomoveis(){
        return new ArrayList<Automovel>();
    }
}
