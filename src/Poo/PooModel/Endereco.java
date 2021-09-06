package Poo.PooModel;

public class Endereco {
    public enum TipoEndereco {RESIDENCIAL, TRABALHO, ENTREGA}
    public String endereco;
    public String numero;
    public String complemento;
    public String bairro;
    public String estado;
    public String cep;
    public TipoEndereco tipo;
    // Todas as variáveis "numéricas" que não serão usadas em cálculos = String
}