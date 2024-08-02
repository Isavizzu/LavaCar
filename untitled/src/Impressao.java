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

    public int pergtInt(String pergt){
        imprimir(pergt);
        Scanner Scanner = new Scanner(System.in);
        return nextInt();
    }
}
