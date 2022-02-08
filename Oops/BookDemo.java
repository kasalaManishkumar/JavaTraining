package Oops;

public class BookDemo {
    public static void main(String args[]){
    Book GameOfThrones=new Book("Martin","Game of Thrones","fantasy",865);
    Book MathBook=new Book("james","calculus","Education",1350);
    Book JavaBook=new Book("leuis","programming in java","Education",1700);
    printBook(GameOfThrones);
    printBook(MathBook);
    printBook(JavaBook);
    }
    public static void printBook(Book book){
        System.out.println(book.getAuthor());
        System.out.println(book.getGenre());
        System.out.println(book.getTitle());
        System.out.println(book.getNumPages());
        System.out.println();

    }
}
