package LearnJaVa.OOPBasic.Classx2Class_longnhau;

public class Address {
    public String line1;
    public String street;
    public String city;
    Location location;


    public Address(String line1, String street, String city, Location location) {
        this.line1 = line1;
        this.street = street;
        this.city = city;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Address{" +
                "line1='" + line1 + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", location=" + location +
                '}';
    }

    static class Location{
        double _long;
        double _lat;

        public Location(double _long, double _lat) {
            this._long = _long;
            this._lat = _lat;
        }

        @Override
        public String toString() {
            return "Location{" +
                    "_long=" + _long +
                    ", _lat=" + _lat +
                    '}';
        }
    }
}
