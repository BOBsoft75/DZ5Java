package DZ5JAVA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class dz5_1 {
    public static void main(String[] args) {
        HashMap<String,ArrayList<String>> phoneBook = new HashMap<>();
        //телефонная книга
        ArrayList<String> list = new ArrayList<>();
        list.add("89212354867");
        list.add("89051556799");
        phoneBook.put("Иванов", list);
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("89041997474");
        list2.add("89038765463");
        phoneBook.put("Петров", list2);
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("89213097692");
        list3.add("89018065566");
        phoneBook.put("Сидоров", list3);
        System.out.println(phoneBook);
        //добавить контакт
        String name = getName();
        phoneBook.put(name, getPhoneNumbers());
        System.out.println("имя " + name + " добавленно!");
        //вывести список контактов
        System.out.println(phoneBook);
        //удалить контакт
        deleteContact(phoneBook);
        System.out.println("удален!");
        System.out.println(phoneBook);
    }

    static String getName() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Имя : ");
        String name = iScanner.nextLine();
        return name;
    }

    static ArrayList<String> getPhoneNumbers() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Количество номеров : ");
        int n = iScanner.nextInt();
        ArrayList<String> list = new ArrayList<>();
        int count = 0;
        while (count < n) {
            Scanner yScanner = new Scanner(System.in);
            System.out.printf("Введите " + (count+1) + " телефон: ");
            String i = yScanner.nextLine();
            list.add(i);
            count++;
        }
        return list;
    }

    static HashMap<String,ArrayList<String>> deleteContact(HashMap<String,ArrayList<String>> phoneBook) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите для удаления имя: ");
        String name = iScanner.nextLine();
        phoneBook.remove(name);
        return phoneBook;
    }
}
