package marzec;

import java.util.Objects;

public class Manufacturer_12 {
    private String name, country;
    private Integer year;

    public Manufacturer_12(String name, String country, Integer year) {
        this.name = name;
        this.country = country;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public Integer getYear() {
        return year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manufacturer_12 that = (Manufacturer_12) o;
        return Objects.equals(name, that.name) && Objects.equals(country, that.country) && Objects.equals(year, that.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, country, year);
    }

    @Override
    public String toString() {
        return name + '(' + country + ')';
    }
}
