import java.util.Scanner;

public class Calculator {
    double totalPrice;
    double priceForPerson;
    double price;
    int numberOfPeople = 1;
    String productList = "Добавленные товары:";


    void priceForPerson() {
        priceForPerson = totalPrice / numberOfPeople;
        Formatter formatter = new Formatter();
        formatter.formatRub(priceForPerson);
        System.out.println(String.format("Каждый человек должен заплатить %.2f %s", priceForPerson, formatter.rub));
    }

    void addProduct() {
        System.out.println("Введите наименование товара");
        Scanner scanner = new Scanner(System.in);
        String input="";
        while (true) {
            if(input.isEmpty()) {
                input = scanner.next();
            }
            productList = productList + "\n" + input;
            System.out.println("Введите цену товара в формате рубли,копейки");
            price = scanner.nextFloat();
            totalPrice = totalPrice + price;
            System.out.println("Товар добавлен");
            System.out.println("Для продолжения введите наименование следующего товара. Для окончания подсчёта введите \"Завершить\"");
            input = scanner.next();
            if (input.equalsIgnoreCase("Завершить")) {
                System.out.println(productList);
                break;
            }


        }

    }
     void getNumberOfPeople () {
        System.out.println("Введите число человек, на которых необходимо разделить счёт");
         Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNextInt()) {
                numberOfPeople = scanner.nextInt();
                if (numberOfPeople > 1) {
                    break;
                } else {
                    System.out.println("Некорректное число. Порпробуйте снова");
                }
            } else {
                System.out.println("Неоходимо ввести число");
                scanner.next();
            }


        }
    }

}