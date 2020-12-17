package Homework_2;

public class LinkedListExample {

    private static LinkedListExample list;
    private Node first;
    private Node last;

    public static void main(String[] args) {
        list = new LinkedListExample();
        list.insert("Макс", 36);
        list.insert("Оля", 35);
        list.insert("Ника", 9);
        list.insertLast("Глеб", 5);

        System.out.println("List:");
        list.display();
        System.out.println();

        System.out.println("Remove Глеб");
        list.delete("Глеб");
        list.display();
        System.out.println();

        System.out.println("Remove first");
        list.delete();
        list.display();
    }

    public LinkedListExample() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void display() {
        Node current = first;
        while (current != null) {
            current.display();
            current = current.next;
        }
    }

    // Вставка
    public void insert(String name, int age) {
        Node newNode = new Node(name, age);
        if (this.isEmpty()) last = newNode;
        newNode.next = first;
        first = newNode;
    }

    // Вставка последним
    public void insertLast(String name, int age) {
        Node newNode = new Node(name, age);
        if (this.isEmpty()) first = newNode;
        else last.next = newNode;
        last = newNode;
    }

    // Удаление
    public Node delete() {
        Node temp = first;
        if (first.next == null) last = null;
        first = first.next;
        return temp;
    }

    // Удаление по значению
    public Node delete(String name) {
        Node current = first;
        Node previous = first;
        while (!current.name.equals(name)) {
            if (current.next == null) return null;
            else {
                previous = current;
                current = current.next;
            }
        }
        if (current == first) first = first.next;
        else previous.next = current.next;
        return current;
    }

    // Поиск по значению
    public Node find(String name) {
        Node current = first;
        while (!current.name.equals(name)) {
            if (current.next == null) return null;
            else current = current.next;
        }
        return current;
    }

    public static class Node {

        private String name;
        private Node next;
        private int age;

        public Node(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void display() {
            System.out.println("Имя: " + this.name + ", Возраст: " + this.age);
        }
    }

    /**Также есть удобные методы addFirst(), addLast(), addAll().
     Получить объект можно через get(), getFirst(), getLast().
     Для изменения элемента используется метод set().
     Для удаления - remove() и clear().
     Метод contains() проверяет наличие конкретного элемента.
     На самом деле методов гораздо больше, изучайте документацию.
     Например, метод element() идентичен getFirst() и присутствует из-за принадлежности к интерфейсу Queue,
     который используется в LinkedList. А также есть метод peek(), который идентичен getFirst(),
     но не вызовет ошибку, если объект будет несуществующим, а просто вернёт null.
     Так же есть метод peekFist(), который аналогичен peek(), но более понятен по названию.
     */
}
