import java.util.Date;

public class Servico {
    private Date data;
    private double preco;
    private Cliente cliente;
    private Funcionario funcionario;
    private Automovel automovel;


    public Servico(Date data, double preco, Cliente cliente, Funcionario funcionario, Automovel automovel){
        this.data = data;
        this.preco = preco;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.automovel = automovel;
    }
}
