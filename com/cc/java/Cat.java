package com.cc.java;

public class Cat {

    private String firstName;
    private String furColor;
    private int age;
    private boolean isFemale;

    
    public Cat(String firstName, String furColor, int age, boolean isFemale) {
        this.firstName = firstName;
        this.furColor = furColor;
        this.age = age;
        this.isFemale = isFemale;
    }

    

    /** Getter */
    public String getStringAttributes(String op) {
      switch (op) {
        case "#name":
            return firstName;
        case "#color":
            return furColor;
        default:
            return "ERROR";
      }
    }

    public String getAge() {

        if (isFemale) {
            return "This is an inappropriate question!";
        } else {
            return Integer.toString(age);
        }


        
    }

    
  


}
