import customlist.LinkedRecords;

public class Main {

    public static void main(String[] args) {
        LinkedRecords<Integer> lr = new LinkedRecords<>();
        lr.add(5);
        lr.add(15);
        lr.add(22);
        lr.add(2);
        lr.add(4);
        System.out.println(lr.getSize());
        System.out.println(lr.toString(x -> Integer.toString(x)));
    }
}
