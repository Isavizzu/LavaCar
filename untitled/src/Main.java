import java.time.LocalDate;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static Pessoa encontrarPessoa(Impressao i, ArrayList<Pessoa> pessoas, String mensagem) {
        String cpf = i.pergtString(mensagem);
        return pessoas.stream()
                .filter(pes -> pes.getCpf().equals(cpf))
                .findFirst()
                .orElse(encontrarPessoa(i, pessoas, "CPF não encontrado!\nCPF do dono do veículo: "));
    }

    public static void main(String[] args) {

        String[] menu = new String[4];
        menu[0] = "1-Cadastrar funcionário";
        menu[1] = "2-Cadastrar cliente";
        menu[2] = "3-Cadastrar automovel";
        menu[3] = "4-Registrar serviço";

        ArrayList<Pessoa> pessoas = new ArrayList<>();


        Impressao i = new Impressao();
        Funcionario func = new Funcionario("Joâo", "123.456.789-12", "(32) 92879-1829)", "Gerente chefe");
        i.imprimir("Bem-Vindo ao Sistema");
        i.imprimirLinha(30);
        while (true){
            for (String opt:menu){
                i.imprimir(opt);
            }
        switch(i.pergtInt("Digite a opção: ")){
            case 1:
                i.imprimirCamadas(30, "Novo Funcionário");
                pessoas.add(func.cadastrarPessoa(i.pergtString("Nome: "), i.pergtString("CPF: "), i.pergtString("Telefone: "), i.pergtString("Cargo: "), 2));
                break;
            case 2:
                i.imprimirCamadas(30, "Novo Cliente");
                pessoas.add(func.cadastrarPessoa(i.pergtString("Nome: "), i.pergtString("CPF: "), i.pergtString("Telefone: "), "", 1));
                break;
            case 3:
                i.imprimirCamadas(30, "Novo Automóvel");
                func.cadastrarAutomovel(i.pergtString("Modelo: "), i.pergtString("Placa: "), i.pergtString("Marca: "), i.pergtInt("Ano: "), i.pergtString("Cor"), i.pergtString("Tipo de veículo: "), encontrarPessoa(i, pessoas, "Cpf do dono do veículo: "));
                break;
            case 4:
                i.imprimirCamadas(30, "Registrando Serviço Prestado");
                func.registrarServico(encontrarPessoa(i, pessoas, "Cpf do dono do veículo: "), encontrarPessoa(i, pessoas, "Cpf do funcionário: "), LocalDate.now(), i.pergtDouble("Valor: "), i);
                break;
            case 5:
                i.imprimirCamadas(30, "Novo Cliente");
                func.cadastrarPessoa(i.pergtString("Nome: "), i.pergtString("CPF: "), i.pergtString("Telefone: "), "", 1);
                break;
            default:
                i.imprimir("Opção não encontrada!");
                break;
        }
        }
    }
}