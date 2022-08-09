import java.util.*;

import ru.netology.person.Person;

public class Main {

    public static List<Person> generateClients() {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Вася","Пупкин", 2));
        list.add(new Person("Света", "Соколова", 5));
        list.add(new Person("Иван", "Иванов", 3));
        list.add(new Person("Мирон", "Мирный", 1));
        list.add(new Person("Леди", "Гага",4));
        return(list);
    }

    public static void main(String[] args) {
        Deque<Person> queue = new ArrayDeque<>();

        for (Person person : generateClients()) {
            queue.offer(person);
        }

        while (!queue.isEmpty()) {
            Person person = queue.pollFirst();
            System.out.println(person + " прокатилась/ся на аттракционе");
            person.useTickets();
            if (person.getTickets() > 0) {
                queue.offerLast(person);
            }
        }
    }
}
