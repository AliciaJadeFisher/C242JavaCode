package Exercises.AddressBookApp.dto;

public class Address
{
    int number;
    String road, city, state, postcode;

    public Address(int number, String road, String city, String state, String postcode)
    {
        this.number = number;
        this.road = road;
        this.city = city;
        this.state = state;
        this.postcode = postcode;
    }

    public int getNumber()
    {
        return number;
    }

    public String getRoad()
    {
        return road;
    }

    public String getCity()
    {
        return city;
    }

    public String getState()
    {
        return state;
    }

    public String getPostcode()
    {
        return postcode;
    }
}
