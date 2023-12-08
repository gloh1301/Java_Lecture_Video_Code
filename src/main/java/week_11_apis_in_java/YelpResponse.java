package week_11_apis_in_java;

public class YelpResponse {
    public Business[] businesses;
}

class Business {
    public String name;
    public double rating;
    public Location location;
}

class Location {
    public String city;
    public String address1;
}