package software.ulpgc.kata1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Paula", LocalDate.of(2003,11,9));
        System.out.println(person);
    }
}
