package com.rough;

public class Optional_Parameter_In_Method {

    public static void main(String[] args) {

        Optional_Parameter_In_Method obj = new Optional_Parameter_In_Method();

        System.out.println(obj.optionalParameter("Pankaj", "Sarjal"));
        System.out.println(
                obj.optionalParameter("Sachin", "Tendulkar", "Ramesh"));

    }

    public String optionalParameter(String firstName, String lastName,
            String... middleName) {
        String name = null;
        if (middleName.length == 0) {
            name = firstName + " " + lastName;
        } else {
            name = firstName + " " + middleName[0] + " " + lastName;
        }

        return name;

    }

}
