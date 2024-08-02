import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        static String[] menu = new String[4];
        menu[0] = "1-Cadastrar funcionário";
        menu[1] = "2-Cadastrar cliente";
        menu[2] = "3-Cadastrar automovel";
        menu[3] = "4-Registrar serviço";


        Impressao i = new Impressao();
        i.imprimir("Bem-Vindo ao Sistema");
        i.imprimirLinha(30);
        while (true){
            for (String opt:menu){
                i.imprimir(opt);
            }
        int resp = i.pergtInt("Digite a opção: ");
        }
    }
}