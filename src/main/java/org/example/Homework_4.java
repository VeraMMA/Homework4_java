package org.example;

import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
public class Homework_4 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        LinkedList<Integer> link = new LinkedList<>();
        link.add(43);
        link.add(35);
        link.add(15);
        link.add(94);
        link.add(56);
        link.add(48);
        System.out.println("Список: " + link);
        LinkedList<Integer> reversedLink = reverseLink(link);
        System.out.println("Развернутый список: " + reversedLink + "\n");

        Deque<String> line = new LinkedList<>();
        line.add("Один");
        line.add("Два");
        line.add("Три");
        line.add("Четыре");
        line.add("Пять");
        System.out.println(line);
        System.out.println("Введиет номер операции: 1 — поместить элемент в конец очереди;" +
                " 2 — вернуть первый элемент из очереди и удалить его; 3 — вернуть первый элемент из очереди, не удаляя;" +
                " 4 — завершение работы");
        while(true){

            int operation = Integer.parseInt(scanner.nextLine());
            if (operation == 1){
                enqueue(line);
                System.out.println(line);
                continue;
            }
            if (operation == 2) {
                System.out.println("Первый элемент: " + dequeue(line));
                System.out.println(line);
                continue;
            }
            if (operation == 3){
                System.out.println("Первым элементом был: " + first(line));
                continue;
            }
            if (operation == 4) break;
            else {
                System.out.println("Для выхода из программы введите 4");
            }
            scanner.close();
        }
    }

    public static LinkedList reverseLink (LinkedList list){
        Collections.reverse(list);
        return list;
    }

    public static void enqueue(Deque<String> list){
        System.out.println("Введите элемент, который необходимо добавить: ");
        Scanner element1 = new Scanner(System.in);
        String element = element1.nextLine();
        list.addLast(element);
        element1.close();
    }
    public static String dequeue(Deque<String> list){
        String item = list.pollFirst();
        return item;
    }
    public static String first(Deque<String> list){
        return list.peekFirst();
    }
}

