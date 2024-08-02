import java.time.LocalDate;
import java.util.Date;

public class Servico {
    private LocalDate data;
    private double preco;
    private Pessoa cliente;
    private Pessoa funcionario;
    private Automovel automovel;


    public Servico(LocalDate data, double preco, Pessoa cliente, Pessoa funcionario, Automovel automovel){
        this.data = data;
        this.preco = preco;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.automovel = automovel;
    }
}
