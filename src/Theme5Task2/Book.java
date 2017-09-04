package Theme5Task2;

/**
 * Created by vladkork on 20.09.2016.
 */
public class Book {
    private String author;
    private int year;
    private String title;
    private int pageCount;

    public Book(String author, int year, String title, int  pageCount){
        this.author = author;
        this.year = year;
        this.title = title;
        this.pageCount = pageCount;
    }


    public Book(){
    }

    public String getAuthor(){
        return author;
    }

    public int getYear(){
        return year;
    }

    public String getTitle(){
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String toString(){
        return getAuthor() + " " + getTitle() + " " + getYear() + " " + getPageCount();
    }

}
