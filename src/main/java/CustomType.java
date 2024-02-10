public class CustomType {

    private final Integer phoneNumber;
    private final String accountName;

    CustomType(String name, Integer number) {
        phoneNumber = number;
        accountName = name;
    }

    String getAccountName() {
        return accountName;
    }

    Integer getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return getAccountName();
    }
}
