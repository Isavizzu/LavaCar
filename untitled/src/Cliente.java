import java.util.ArrayList;

public class Cliente extends Pessoa{
    private ArrayList<Automovel> automoveis;

    public Cliente(String nome, String cpf, String telefone){
        super(nome, cpf, telefone);
        this.automoveis = new ArrayList<Automovel>();
    }

    public void registrarAutomvel(Automovel automovel){
        automoveis.add(automovel);
    }

}
