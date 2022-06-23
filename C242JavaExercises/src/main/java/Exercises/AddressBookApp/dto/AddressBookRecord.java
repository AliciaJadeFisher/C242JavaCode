package Exercises.AddressBookApp.dto;

public class AddressBookRecord
{
    String firstName, lastName;
    Address address;

    public AddressBookRecord(String firstName, String lastName, Address address)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public Address getAddress()
    {
        return address;
    }

    public void setAddress(Address address)
    {
        this.address = address;
    }

    @Override
    public String toString()
    {
        return "AddressBook{" + "firstName=" + firstName + ", lastName=" + lastName +
                ", houseNumber=" + address.getNumber() + ", road=" + address.getRoad() +
                ", city=" + address.getCity() + ", state=" + address.getState() +
                ", postcode=" + address.getPostcode() + "}";
    }
}
