package com.example.foodxpress.Model;

public class Pnr_Details {
    private String PNR_Number;
    private String Train_Number;
    private String Train_Name;
    private String Journry_Date;
    private String From;
    private String To;
    private String Class;
    private String Name;
    private String Age;

    public Pnr_Details() {
    }

    public Pnr_Details(String pnr_Number, String train_Number, String train_Name, String journry_Date, String from, String to, String aClass, String name, String age) {
        PNR_Number = pnr_Number;
        Train_Number = train_Number;
        Train_Name = train_Name;
        Journry_Date = journry_Date;
        From = from;
        To = to;
        Class = aClass;
        Name = name;
        Age = age;
    }

    public  String getPNR_Number() {
        return PNR_Number;
    }

    public void setPNR_Number(String pnr_number) {
        PNR_Number = pnr_number;
    }

    public String getTrain_Number() {
        return Train_Number;
    }

    public void setTrain_Number(String train_Number) {
        Train_Number = train_Number;
    }

    public String getTrain_Name() {
        return Train_Name;
    }

    public void setTrain_Name(String train_Name) {
        Train_Name = train_Name;
    }

    public String getJournry_Date() {
        return Journry_Date;
    }

    public void setJournry_Date(String journry_Date) {
        Journry_Date = journry_Date;
    }

    public String getFrom() {
        return From;
    }

    public void setFrom(String from) {
        From = from;
    }

    public String getTo() {
        return To;
    }

    public void setTo(String to) {
        To = to;
    }

    public void setClass(String aClass) {
        Class = aClass;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }
}
