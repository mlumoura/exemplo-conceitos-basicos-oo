package Poo.PooModel;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa{
    public String numCartao;

    // O endereço, como o cliente pode ter vários, virou a classe Endereco
    // public List<Endereco> enderecos; para que não seja possível acessar, a não ser pelo getter
    // trocou o public pelo private

    private List<Endereco> enderecos;

    // Em java, quando tenho um objeto complexo como a lista acima, ele normalmente é nulo.
    // Se eu tentar adicionar um endereço sem inicializar a lista = ERRO

        /*public void setEnderecos (List<Endereco> enderecos) {
            this.endereco = endereco;
        }  Foi retirado porque não é para acessar a lsita e sim incluir endereco 1 por 1
        */

    /*public void setEnderecos (List<Endereco> enderecos) {
            this.endereco = endereco;
      }  Foi retirado porque não é para acessar a lsita e sim incluir endereco 1 por 1
    */

    public void adicionaEndereco(Endereco endereco) {
        // não quero que adicione nada vazio ou nulo. Ir na classe EntregaCartaoApp e trocar get e trocar getEnderecos
        // por adicionaEndereco
        if (endereco == null) {
            throw new NullPointerException("Endereço não pode ser nulo");
        }
        if (getDocumento() == null) {
            throw new NullPointerException("Documento não pode ser nulo");
        }
        getEnderecos().add(endereco);
    }

    public List<Endereco> getEnderecos() {
        if (enderecos == null) {
            //enderecos = new ArrayList<Endereco>();
            enderecos = new ArrayList<>();
        }
        return enderecos;
    }
}
