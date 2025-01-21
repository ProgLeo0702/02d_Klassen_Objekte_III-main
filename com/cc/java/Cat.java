package com.cc.java;

public class Cat {

    private String firstName;
    private String furColor;
    private int age;
    private boolean isFemale;

    private int counter;

    
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
            return checkCompliance();
        } else {
            return Integer.toString(age);
        }


        
    }

    private String checkCompliance(){

        counter++;

        switch (counter) {
            case 1:
                return "This is an inappropriate question!";
               
            case 2:
                return "I've told you once!";
                
            case 3:
            return "Talk to the hand!" ;
               
            default:
            return "Fuck you!";
        }


    }
  


}
