package Contact_Management_System;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Contact> contacts = new ArrayList<>();
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("1.Add the Contact");
            System.out.println("2.view contact");
            System.out.println("3.search contact");
            System.out.println("4.Exit");

            System.out.println("Select the option");
            int option = sc.nextInt();
            sc.nextLine();


            switch (option)
            {
                case 1:
                    System.out.println("Enter contact name");
                    String name = sc.nextLine();
                    System.out.println("Enter contact number");
                    String number = sc.nextLine();
                    contacts.add(new Contact(name,number));
                    break;
                case 2:
                    System.out.println("Contacts");
                    for(Contact contact : contacts)
                    {
                        System.out.println(contact);
                    }
                    break;
                case 3:
                    System.out.println("Enter name to search");
                    String searchname = sc.nextLine();
                    boolean found = false;
                    for(Contact contact : contacts)
                    {
                        if(contact.getName().equalsIgnoreCase(searchname))
                        {
                            System.out.println(contact);
                            found = true;
                        }
                    }
                    if(!found)
                    {
                        System.out.println("Contact not found");
                    }
                    break;
                case 4:
                    return;

                default:
                    System.out.println("invalid option.");
            }

        }


    }

    static class Contact
    {

        private  String name;
        private String number;

        public Contact(String name,String number) {
            this.name = name;
            this.number = number;

        }

        public String getName()
        {
            return  name;

        }
        @Override
        public String toString()
        {
            return "Name:-"+name +" number:- "+number;
        }
    }
}
