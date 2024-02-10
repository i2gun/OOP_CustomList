import customlist.LinkedRecords;

public class Main {

    public static void main(String[] args) {
        LinkedRecords<Integer> lr = new LinkedRecords<>();
        lr.add(5);
        lr.add(15);
        lr.add(22);
        lr.add(2);
        lr.add(4);

        System.out.println("list = "  + lr.toString(x -> Integer.toString(x)));
        System.out.println("item(0) = " + lr.getItem(0));
        System.out.println("item(4) = " + lr.getItem(4));
        System.out.println();

        lr.add(3);
        System.out.println("list = "  + lr.toString(x -> Integer.toString(x)));
        System.out.println("item(0) = " + lr.getItem(0));
        System.out.println("item(5) = " + lr.getItem(5));
        System.out.println();

        lr.addLast(100);
        System.out.println("list = "  + lr.toString(x -> Integer.toString(x)));
        System.out.println("item(0) = " + lr.getItem(0));
        System.out.println("item(6) = " + lr.getItem(6));
        System.out.println();

        System.out.println("size = " + lr.getSize());
    }
}
