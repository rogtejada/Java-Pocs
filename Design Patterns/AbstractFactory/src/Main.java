public class Main {

    public static void main(String[] args) {

        AbstractFactory factoryA = new ConcreteFactoryA();
        Client firstClient = new Client(factoryA);
        firstClient.execute();

        AbstractFactory factoryB = new ConcreteFactoryB();
        Client secondClient = new Client(factoryB);
        secondClient.execute();

    }
}
