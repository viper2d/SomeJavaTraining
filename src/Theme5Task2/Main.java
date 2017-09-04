package Theme5Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("Author1",1700,"Title1",100);

        Book book2 = new Book();
        book2.setAuthor("Author2");
        book2.setTitle("Title2");
        book2.setYear(1800);
        book2.setPageCount(200);

        System.out.println(book1);
        System.out.println(book2);

        Book sevenHabits = new Book();
        sevenHabits.setTitle("The Seven Habits of Highly Effective People");
        sevenHabits.setAuthor("Stephen Covey");
        System.out.println(sevenHabits);

        Book powerOfNow = new Book("Eckhart Tolle", 2001, "Power of Now", 224);
        System.out.println("Power of Now title: " + powerOfNow.getTitle());

        Book peacefulWarrior = new Book("Dan Millman", 1980, "Way of the Peaceful Warrior", 180);
        System.out.println(peacefulWarrior);

        List<Book> books = new ArrayList();
        Book book3 = new Book("BAuthor3",2050,"Title5",450);
        books.add(book3);
        Book book4 = new Book("AAuthor4",2000,"Title4",400);
        books.add(book4);
        Book book5 = new Book("CAuthor5",2100,"Title6",500);
        books.add(book5);

        for (Book book : books){
            System.out.println(book.getAuthor());
        }

    }
}
