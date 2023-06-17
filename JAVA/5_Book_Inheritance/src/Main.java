import java.util.*;

class Publication{
    String title;
    float price;

    Publication()
    {

    }

    Publication(String title, float price)
    {
        this.title = title;
        this.price = price;
    }

    void getdata()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter title: ");
        title = sc.nextLine();
        System.out.print("Enter price: ");
        price = sc.nextFloat();
        sc.close();
    }

    void putdata()
    {
        System.out.println("title: " + title);
        System.out.println("price: "+ price);
    }
}

class Book extends Publication{
    int pagec;
    Book(){

    }

    Book(String title, float price, int pagec)
    {
        super(title,price);
        this.pagec = pagec;
    }

    void getdata()
    {
        super.getdata();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the page count: ");
        pagec = sc.nextInt();
        sc.close();
    }

    void putdata()
    {
        super.putdata();
        System.out.println("Page Count: " + pagec);
    }

}

class Audio extends Publication{
    float Playtime;
    Audio(){

    }

    Audio(String title, float price, float Playtime)
    {
        super(title , price);
        this.Playtime = Playtime;
    }

    void getdata()
    {
        super.getdata();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Play time: ");
        Playtime = sc.nextFloat();
        sc.close();
    }

    void putdata()
    {
        super.putdata();
        System.out.println("PlayTime: " + Playtime);
    }
}

public class Main{
    public static void main(String[] args) {
        Book b1 = new Book("CPP",50,5);
        Book b2 = new Book();
        b2.getdata();
        b1.putdata();
        b2.putdata();

        Audio a1 = new Audio("Java",99,100);
        Audio a2 = new Audio();
        a2.getdata();
        a1.putdata();
        a2.putdata();

    }
}