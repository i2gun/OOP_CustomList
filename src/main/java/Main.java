import customlist.LinkedRecords;

public class Main {

    public static void main(String[] args) {
        LinkedRecords<CustomType> lr = new LinkedRecords<>();
        lr.add(new CustomType("Petr1", 111));
        lr.add(new CustomType("Petr2", 222));
        lr.add(new CustomType("Petr3", 333));
        lr.add(new CustomType("Petr4", 444));
        lr.add(new CustomType("Petr5", 555));

        System.out.println("list = "  + lr);
        System.out.println("item(0) = " + lr.getItem(0));
        System.out.println("item(4) = " + lr.getItem(4));
        System.out.println();

        lr.add(new CustomType("Petr6", 666));
        System.out.println("list = "  + lr);
        System.out.println("item(0) = " + lr.getItem(0));
        System.out.println("item(5) = " + lr.getItem(5));
        System.out.println();

        lr.addLast(new CustomType("Petr10", 1000));
        System.out.println("list = "  + lr);
        System.out.println("item(0) = " + lr.getItem(0));
        System.out.println("item(6) = " + lr.getItem(6));
        System.out.println();

        System.out.println("size = " + lr.getSize());
    }
}
