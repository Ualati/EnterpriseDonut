package uk.ac.tees.q5113445live.enterpriseproject2;

import android.graphics.Bitmap;
import android.media.Image;
import android.net.Uri;

/**
 * Created by Luke on 13/02/2018.
 */

public class User
{
    String name;
    String cityName;
    String postcode;
    String location;
    String email;
    String regNumber;
    String wallet;
    boolean driver = false;
    String number;
    String baseRating;
    int newRating;

    User()
    {
        name = "";
        email = "";
        location ="";
        number = "";
        regNumber = "";
        wallet = "";
        baseRating = "2.5";
    }

    User(String wall)
    {
        wallet = wall;

    }

    User(String n, String e, String l,  String num, String wal)
    {
        name= n;
        email = e;
        location = l;
        number = num;
        regNumber = "";
        driver = false;
        wallet = wal;
    }

    User(String n, String e, String l, String num, String reg, String wal)
    {
        name= n;
        email = e;
        location = l;
        number = num;
        regNumber = reg;
        driver = true;
        wallet = wal;
    }

    public String getWallet() {
        return wallet;
    }

    public void setWallet(String wallet) {
        this.wallet = wallet;
    }

    public String getNumber()
    {
        return number;
    }

    public void setNumber(String number)
    {
        this.number = number;
    }

    public String getRegNumber()
    {
        return regNumber;
    }


    public void setRegNumber(String regNumber)
    {
        this.regNumber = regNumber;
    }

    public boolean isDriver()
    {
        return driver;
    }

    public void setDriver(boolean driver)
    {
        this.driver = driver;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getRating() {return baseRating;}

    public void setRating(String rating){
        rating = "2.5";
        this.baseRating = rating;
    }
}
