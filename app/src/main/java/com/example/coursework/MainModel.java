package com.example.coursework;

public class MainModel {

    String dob, email, name, turl;
    MainModel(){

    }

    public MainModel (String name, String dob, String email, String turl){
        this.name = name;
        this.dob = dob;
        this.email = email;
        this.turl = turl;
    }
     public String getName() {
         return name;
     }
     public void setName(String name){
         this.name = name;
     }

    public String getDob() {
        return dob;
    }
    public void setDob(String dob){
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getTurl(){
        return turl;
    }
    public void setTurl(String turl){
        this.turl = turl;
    }
}
