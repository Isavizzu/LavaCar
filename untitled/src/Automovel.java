public class Automovel {
    private String modelo;
    private String placa;
    private String marca;
    private int ano;
    private String cor;
    private String tipo;

    public Automovel (String modelo, String placa, String marca, int ano, String cor, String tipo){
        this.modelo = modelo;
        this.placa = placa;
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
        this.tipo = tipo;
    }


    public String getModelo(){
        return modelo;
    }


    public String getPlaca(){
        return placa;
    }

}
