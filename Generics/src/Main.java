import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("joao", 18));
        personList.add(new Person("Maria", 15));
        personList.add(new Person("Carlos", 36));
        System.out.println("Printing Person list:");
        GenericPrint<Person> personPrint = new GenericPrint<>();
        personPrint.print(personList);

        System.out.println("Printing String list:");
        List<String> stringList = new ArrayList<>();
        stringList.add("string");
        stringList.add("another");
        GenericPrint<String> stringPrint = new GenericPrint<>();
        stringPrint.print(stringList);
    }
}
