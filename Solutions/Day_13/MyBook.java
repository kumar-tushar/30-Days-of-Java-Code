package Solutions.Day_13;

import java.util.Scanner;

public class MyBook extends Book{
    int bookPrice;

    public MyBook(String title, String author, int price){
        super(title,author);
        bookPrice=price;
    }

    public void display(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+bookPrice);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }

}
