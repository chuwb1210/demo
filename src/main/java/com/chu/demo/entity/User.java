package com.chu.demo.entity;

public class User {
    private int id;
    private String name;
    private String password;
    private String number;
    private String birthday;
    private String job;
    private String gender;

    public int getId() {return id;}
    public void setId(int id) {this.id = id; }
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getPassword() {return password;}
    public void setPassword(String password) {this.password =password;}
    public String getNumber() { return number;}
    public void setNumber(String number) {this.number = number;}
    public String getBirthday() {return birthday;}
    public void setBirthday(String birthday) {this.birthday = birthday; }
    public String getJob() {return job; }
    public void setJob(String job) {this.job = job; }
    public String getGender() { return gender;}
    public void setGender(String gender) {this.gender = gender; }
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ",gender="+gender+", job="+job+",password=" + password + "," +
                "birthday="+birthday+", number=" + number + "password="+password+"]";
    }
}
