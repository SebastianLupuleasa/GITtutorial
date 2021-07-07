package com.endava.special;

public class SpecialApp {

    public static void main(String[] args) {

        System.out.println("Hello");

        SpecialPerson sp = new SpecialPerson();
        sp.setDatabaseId(1L);
        sp.setName("John");
        sp.setEmailAddress("john@endava.com");
        System.out.println("Created person: " + sp);

    }
}
