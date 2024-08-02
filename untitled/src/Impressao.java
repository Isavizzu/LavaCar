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
}
