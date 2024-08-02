import java.util.Scanner;

public class Impressao {
    public void imprimir(String conteudo){
        System.out.println(conteudo);
    }


    public void imprimirLinha (int quant){
        String linha = "";
        for (int i = 0; i < quant; i++){
            linha += "-";
        }
        imprimir(linha);
    }


    public void imprimirCamadas (int quant, String conteudo){
        imprimirLinha(quant);
        imprimir(conteudo);
        imprimirLinha(quant);
    }


    public int pergtInt(String pergt){
        return scanner(pergt).nextInt();
    }


    public double pergtDouble(String pergt){
        return scanner(pergt).nextDouble();
    }


    public String pergtString(String pergt){
        return scanner(pergt).nextLine();
    }


    public Scanner scanner(String pergt){
        imprimir(pergt);
        return new Scanner(System.in);
    }
}
