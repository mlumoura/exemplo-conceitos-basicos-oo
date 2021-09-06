package Poo.PooModel;

public class EntregaCartaoApp {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        // dados do endereco
        endereco.cep = ("0000000");

        Cliente cliente = new Cliente ();
        // dados do cliente
        
        /* if (cliente.enderecos == null) {
            cliente.enderecos = new ArrayList<E>(); 
        } Como trocou de public para private, lá em Cliente, enderecos é private! Então não tem acesso
        
        Cliente.enderecos.add(endereco) => Erro NullPointnerException porque o endereco também é um objeto,
        uma lista de endereco que não foi inicializada
        */
        
        // Solução: porque é uma lista, um objeto que já está programado no Java, e tem uma função chamada "add"
        // que vai adicionar como uma lista. A solução certa: encapsulamento da validação

        // Usando o try/catch força o tratamento de erro e não deixa acontecer a exceção

        try {
            cliente.adicionaEndereco(endereco);
            System.out.println("Endereço adicionado com sucesso!");
        } catch (Exception e) {
            System.err.println("Houve um erro ao adicionar endereço: " + e.getMessage());
        }






    }
}
