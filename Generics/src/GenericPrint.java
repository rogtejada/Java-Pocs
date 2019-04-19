import java.util.List;

public class GenericPrint<Type> {

    public void print(List<Type> list){
        for(Type type: list){
            System.out.println(type);
        }
    }
}
