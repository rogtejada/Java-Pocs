public class Client {
    private AbstractProductA productA;
    private AbstractProductB productB;

    public Client(AbstractFactory abstractFactory) {
        this.productA = abstractFactory.createProductA();
        this.productB = abstractFactory.createProductB();
    }

    public void execute(){
        productB.interact(productA);
    }
}
