public class ConcreteFactoryB implements AbstractFactory {

    @Override
    public AbstractProductA createProductA(){
        return new ProductA2();
    }

    @Override
    public AbstractProductB  createProductB(){
        return new ProductB2();
    }

}