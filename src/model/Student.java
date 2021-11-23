package model;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private String gender;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int studentAge) {
        this.age = studentAge;
    }

    public String getGender(){
        return gender;
    }

    public void setGender(String studentGender){
        if(Objects.equals(studentGender, "M")){
            this.gender = "Male";
        }else if(Objects.equals(studentGender, "F")){
            this.gender = "Female";
        }else{
            this.gender = "Unknown";
        }
    }

    public String getID(){
        return id;
    }

    public void setId(String studentID){
        if(studentID.length()==7){
            this.id = studentID+"(0)";
        }else{
            this.id = studentID+"(A)";
        }
    }

}
