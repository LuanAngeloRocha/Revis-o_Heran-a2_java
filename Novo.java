public class Novo extends Imóvel{
    double adicional;

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {

        this.adicional = adicional;
    }

    public double valorAdicional(){
       double total =  getPreco()+getAdicional();
       return total;
    }
    
}
