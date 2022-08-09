package ru.netology.person;

public class Person {

    protected String name;
    protected String surname;
    protected int tickets;

    public Person(String name, String surname, int tickets) {
        this.name = name;
        this.surname = surname;
        this.tickets = tickets;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getTickets() {
        return tickets;
    }

    public boolean useTickets() {
        if (tickets > 0) {
            tickets--;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return name + " " + surname + " (осталось билетов " + tickets + " шт.)";
    }
}
