public class Customer {
    private String name;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String country;

    public Customer(String name, String addressLine1, String addressLine2, String city, String state, String country) {
        this.name = name;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String Details() {
        return firstletter(name) + "," + addressLine1 + "," + addressLine2 + "," + city + "," + state + "," + country;
    }

    public String getName() {
        return name;
    }

    private String firstletter(String caps) {
        if (caps == null || caps.isEmpty()) {
            return caps;
        }
        return Character.toUpperCase(caps.charAt(0)) + caps.substring(1);
    }
}
