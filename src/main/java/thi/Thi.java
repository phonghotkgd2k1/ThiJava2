package thi;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;

public class Thi {

    static String path = "D:\\java\\thi\\src\\main\\java\\thi\\book.txt";

    public static void main(String args[]) throws IOException {
        bai2();
      //      bai1();
//            loadData();
    }


    public static void bai1() throws IOException {
        Scanner sc = new Scanner(System.in);
        List<Book> bookList = new ArrayList<>();
        String code;
        String title;
        String author;
        Double price;

        for(int i=0;i<2;i++){
            System.out.println("Nhập sách số " + i+1);
            System.out.println("Nhập mã sách: ");
            code = sc.nextLine();
            System.out.println("Nhập tiêu đề: ");
            title = sc.nextLine();
            System.out.println("Nhập tác giả: ");
            author = sc.nextLine();
            System.out.println("Nhập giá: ");
            price = Double.parseDouble(sc.nextLine());

            Book book = new Book(code,title,author,price);
            bookList.add(book);
        }

        XFile.writeObject(bookList, path);
    }

    public static void bai2(){
        Scanner sc = new Scanner(System.in);

        HashMap<String, String> hm = new HashMap<String, String>();

        String name = null;
        String phone;
        while(true) {

            System.out.println("Enter name of the student: ");
            name = sc.nextLine();
            if(name.equals("x") || name.equals("X")) break;

            System.out.println("Enter phone of the student: ");
            phone = sc.nextLine();
            hm.put(name, phone);

        }

//        while(i.hasNext()) {
//            Map.Entry me = (Map.Entry)i.next();
//            System.out.print(me.getKey() + " has the phone number:  ");
//            System.out.println(me.getValue());
//        }
        System.out.println(hm.toString());
    }

    public static  void loadData() throws IOException {
        List<Book> bookList = new ArrayList<>();
        bookList = (ArrayList<Book>) XFile.readObject(path);

        for(Book book : bookList){
            System.out.println(book.toString());
        }
    }

}
