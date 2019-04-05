public class ConcreteFactoryA implements AbstractFactory {

    @Override
    public AbstractProductA createProductA(){
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB(){
        return new ProductB1();
    }

}
