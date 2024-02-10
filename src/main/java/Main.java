import customlist.LinkedRecords;

public class Main {

    public static void main(String[] args) {
        LinkedRecords<CustomType> lr = new LinkedRecords<>();
        lr.add(new CustomType("Petr1", 111));
        lr.add(new CustomType("Petr2", 222));
        lr.add(new CustomType("Petr3", 333));
        lr.add(new CustomType("Petr4", 444));
        lr.add(new CustomType("Petr5", 555));
        System.out.println(lr.getSize());
        System.out.println(lr.toString(x -> x.getAccountName()));

        System.out.println(lr.getSize());
        System.out.println(lr.toString(x -> Integer.toString(x.getPhoneNumber())));
    }
}
