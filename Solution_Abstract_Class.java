abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

class Book1 extends Book{
    @Override
    void setTitle(String s) {
        this.title = s;
    }
}

public class Solution_Abstract_Class {
    public static void main(String[] args){
        Book1 book = new Book1();
        book.setTitle("A tale of two cities");
        System.out.println("The title is: " + book.getTitle());
    }
}
