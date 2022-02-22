public class Velho extends Imóvel{
    double desconto;

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    };

    public double valorDesconto(){
        double totalDesconto=getPreco()-getDesconto();
        return totalDesconto;
    }
}
