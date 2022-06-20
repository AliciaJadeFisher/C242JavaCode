package Practice.ClassModeling;

public class HouseGPS
{
    private final int number;
    private final String road;
    private final String city;
    private final String county;
    private final String country;
    private final String postcode;

    public HouseGPS(int number, String road, String city, String state, String country, String postcode)
    {
        this.number = number;
        this.road = road;
        this.city = city;
        this.county = state;
        this.country = country;
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

    public String getCounty()
    {
        return county;
    }

    public String getCountry()
    {
        return country;
    }

    public String getPostcode()
    {
        return postcode;
    }

    public String getAddress()
    {
        return number + ", " + road + ", " + city + ", " + county + ", " + country + ", " + postcode;
    }
}
