package Homework_2;

import java.util.*;

/**
 * Существует две основные разновидности List:
 *  1. Базовый контейнер ArrayList, оптимизированный для произвольного доступа к элементам, но с относительно медленными
 *  операциями вставки/удаления элементов в середине списка.
 *  2. Контейнер LinkedList, оптимизированный для последовательного доступа, с быстрыми операциями вставки/удаления в
 *  середине списка. Произвольный доступ к элементам LinkedList выполняется относительно медленно, но по широте возможностей превосходит ArrayList.
 */

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<Cat> cats = new ArrayList<>();
        cats.ensureCapacity(10);

        Cat cat1 = new Cat("№0");
        cats.add(cat1);

        cats.add(new Cat("#1"));
        cats.add(new Cat("#2"));
        cats.add(new Cat("#4"));
        cats.add(new Cat("#5"));
        cats.add(new Cat("#6"));
        cats.add(2, new Cat("#3"));

        int filIndex = cats.indexOf(cat1);
        System.out.println(filIndex);

        /**
         * get() - поиск элемента по индексу.
         */
        Cat secondCat = cats.get(2);
        System.out.println(secondCat);


        /**
         * Просмотр всех элементов через цикл
         */
        String catName = "";
        for(Cat cat : cats) {
            catName = catName + cat + " ";
        }
        System.out.println("All cats " + catName);

        /**
         * Поиск элемента по содержимому
         */
        System.out.println(catName.contains("#4"));

        /**
         * remove() - удаление элемента
         * removeIf() - удаление элемента по предикату
         */
        cats.remove(0);
        cats.remove("#5");

        /**
         * set() - замена элемента
         */
        cats.set(1, new Cat("#7"));

        /**
         * toArray() - конвертируем в обычный массив
         */
        Cat[] newCats = cats.toArray(new Cat[0]);
        System.out.println("Массив: " + Arrays.toString(newCats));


        /**
         * Сколько повторений
         */
        int count = Collections.frequency(cats, "#7");
        System.out.println("We have: " + count);

        /**
         * clear() - очистка массива
         * removeAll()
         */

        /**
         * Сортировка при помощи метода Collections.sort().
         */
        List<String> items = new ArrayList<>();
        items.add("d");
        items.add("c");
        items.add("b");
        items.add("a");
        Collections.sort(items);
        System.out.println(items.toString());

        /**
         * Интерфейс ListIterator - Позволяет проходить по всем элементам вперёд или назад. Для этого он проверяет,
         * есть ли следующий/предыдущий элемент после текущего.
         */
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ListIterator iterator = numbers.listIterator();
        System.out.println("Iterating in forward direction: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
        System.out.println("Iterating in backward direction: ");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
