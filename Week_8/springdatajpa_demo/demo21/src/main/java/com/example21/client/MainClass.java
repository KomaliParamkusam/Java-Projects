package com.example21.client;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example21.entity.Contact;
import com.example21.service.ContactService;

public class MainClass {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/example21/cfgs/application.xml");
        ContactService service = ctx.getBean("contactSer", ContactService.class);
        Scanner sc = new Scanner(System.in);
        OUTER:
        while (true) {
            System.out.println("-------------------------------------------");
            System.out.println("1. Add Contacts");
            System.out.println("2. List all Contacts");
            System.out.println("3. Update a Contact");
            System.out.println("4. Delete a Contact");
            System.out.println("5. Search Particular Contact by id");
            System.out.println("6. Search Contact by lastname");
            System.out.println("7. Search Contact by letter");
            System.out.println("8. Exit");
            System.out.println("-------------------------------------------");
            System.out.print("Enter your choice:: ");
            int n = sc.nextInt();
            System.out.println("Enter the name");
            String s=sc.next();
            List<Contact> l=service.searchContactByName(s);
            System.out.println(l);
            // switch (n) {
            //     case 1:
            //         Contact con = new Contact();
            //         System.out.print("Enter first name:");
            //         String fname = sc.next();
            //         System.out.print("Enter last name:");
            //         String lname = sc.next();
            //         System.out.print("Enter phone number:");
            //         String pno = sc.next();
            //         con.setFirstName(fname);
            //         con.setLastName(lname);
            //         con.setPhnNum(new BigInteger(pno));
            //         System.out.print("Enter email:");
            //         String email = sc.next();
            //         con.setEmail(email);
            //         System.out.println(service.addContact(con));
            //         System.out.println("Contact added successfully");
            //         break;
            //     case 2:
            //         {
            //             List<Contact> l = service.getAllContacts();
            //             System.out.println(l.size());
            //             l.forEach((contacts) -> {
            //                 System.out.println(contacts);
            //             });     break;
            //         }
            //     case 3:
            //         System.out.println("Enter the id to be updated");
            //         int id = sc.nextInt();
            //         sc.nextLine();
            //         System.out.println(service.updateContact(id));
            //         break;
            //     case 4:
            //         {
            //             System.out.println("Enter the id to be deleted");
            //             int i = sc.nextInt();
            //             sc.nextLine();
            //             service.deleteContact(i);
            //             break;
            //         }
            //     case 5:
            //         {
            //             System.out.println("Enter the id");
            //             int i = sc.nextInt();
            //             sc.nextLine();
            //             System.out.println(service.getContactById(i));
            //             break;
            //         }
            //     case 6:
            //         {
            //             System.out.print("Enter the last name:: ");
            //             String s = sc.next();
            //             List<Contact> l = service.searchContactByLastName(s);
            //             l.forEach(c -> {
            //                 System.out.println(c);
            //             });     break;
            //         }
            //     case 7:
            //         {
            //             System.out.print("Enter the letter:: ");
            //             String s = sc.next();
            //             List<Contact> l = service.searchContactByLetter(s);
            //             l.forEach(c -> {
            //                 System.out.println(c);
            //             });     break;
            //         }
            //     case 8:
            //         System.out.println("-------Exited--------");
            //         break OUTER;
            //     default:
            //         System.out.println("Invalid Option");
            //         break;
            // }
        }

    }
}
