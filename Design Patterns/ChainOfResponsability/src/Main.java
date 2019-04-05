public class Main {
    public static void main(String[] args) {

        Chain firstChain = new NegativeProcessor();
        Chain secondChain = new ZeroProcessor();
        Chain thirdChain = new PositiveProcessor();
        firstChain.setNext(secondChain);
        secondChain.setNext(thirdChain);

        firstChain.process(new Number(10));
        firstChain.process(new Number(-4));
        firstChain.process(new Number(0));
        firstChain.process(new Number(30));
    }
}
