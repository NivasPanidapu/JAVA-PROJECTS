class Organization implements Cloneable {
    private String organizationCode;
    private String organizationName;
    private String organizationAddress;

    public Organization(String code, String name, String address) {
        this.organizationCode = code;
        this.organizationName = name;
        this.organizationAddress = address;
    }

    // Getter and Setter methods

    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationAddress() {
        return organizationAddress;
    }

    public void setOrganizationAddress(String organizationAddress) {
        this.organizationAddress = organizationAddress;
    }

    // Clone method
    @Override
    public Organization clone() throws CloneNotSupportedException {
        return (Organization) super.clone();
    }

    // Method to print object details
    public void printDetails() {
        System.out.println("Organization Code: " + organizationCode);
        System.out.println("Organization Name: " + organizationName);
        System.out.println("Organization Address: " + organizationAddress);
    }
}

public class Main {
    public static void main(String[] args) {
        Organization org1 = new Organization("001", "ABC Corp", "123 Main St");
        try {
            Organization org2 = org1.clone();
            System.out.println("Original Object:");
            org1.printDetails();
            System.out.println("\nCloned Object:");
            org2.printDetails();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
