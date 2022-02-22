public class Principal {
    public static void main(String[] args) {
    Novo novo = new Novo();
    novo.setEndereco("Rua caxias do SUl");
    novo.setPreco(180000);
    novo.setAdicional(5000);

    Velho velho = new Velho();
    velho.setEndereco("Rua caxias do Sul");
    velho.setPreco(15500);
    velho.setDesconto(15000);

    System.out.println("================================");
    System.out.println("Dados do Imóvel novo ");
    System.out.println(".................................");
    System.out.println(novo.getEndereco());
    System.out.println(novo.getPreco());
    System.out.println(novo.valorAdicional());
    System.out.println("================================");
    
    System.out.println("Dados do Imóvel Velho");  
    System.out.println(".................................");
    System.out.println(velho.getEndereco());
    System.out.println(velho.getPreco());
    System.out.println(velho.valorDesconto());
    System.out.println("================================");
    }
    
}
