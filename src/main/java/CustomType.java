public class CustomType {

    Integer phoneNumber;
    String accountName;

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

}
