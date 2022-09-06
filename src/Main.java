import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Deque<Person> deque = new ArrayDeque<>();
        for (int i = 0; i < generateClients().size(); i++) {
            deque.push(generateClients().get(i));
        }

        while (!deque.isEmpty()) {
            Person p = deque.pop();
            p.tickets = p.tickets - 1;
            System.out.println(p.name + " " + p.surname + " took a ride on the attraction," +
                    "tickets left:" + p.tickets);
            if (p.tickets != 0) {
                deque.addLast(p);
            }

        }
    }
    public static List<Person> generateClients() {
        List<Person> list = new LinkedList<>();
        Person person1 = new Person("Alexey", "Navalnyy", 4);
        Person person2 = new Person("Andrey", "Rublev", 20);
        Person person3 = new Person("Anna", "Brodskaya", 10);
        Person person4 = new Person("Johny", "Catsvill", 5);
        Person person5 = new Person("Emma", "Stone", 1);
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);
        return list;
    }
}