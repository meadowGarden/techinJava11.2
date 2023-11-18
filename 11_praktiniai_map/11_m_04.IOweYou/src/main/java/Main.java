
public class Main {

    public static void main(String[] args) {

        IOU book = new IOU();

        book.setSum("tonis", 200);
        book.setSum("vinis", 500);

        System.out.println(book);
        System.out.println(book.howMuchDoIOweTo("tonis"));


    }









}
