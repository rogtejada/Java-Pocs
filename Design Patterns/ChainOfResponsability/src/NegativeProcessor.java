public class NegativeProcessor implements Chain {

    private Chain nextInChain;

    @Override
    public void setNext(Chain nextChain) {
        nextInChain=nextChain;
    }

    @Override
    public void process(Number request) {
        if(request.getNumber()<0) {
            System.out.println("Negative Processor:" + request.getNumber());
        }else{
            nextInChain.process(request);
        }
    }
}

