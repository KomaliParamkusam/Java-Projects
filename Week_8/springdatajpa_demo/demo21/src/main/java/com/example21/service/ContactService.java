package com.example21.service;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example21.entity.Contact;
import com.example21.repository.ContactRepositoty;



@Service("contactSer")
public class ContactService 
{
    @Autowired
    private ContactRepositoty repo;
    Scanner sc=new Scanner(System.in);
    public List<Contact> getAllContacts()
    {
        List<Contact> l=repo.findAll();
        return l;
    }
    public Optional<Contact> getContactById(Integer id)
    {
        Optional<Contact> c=repo.findById(id);
        return c;
    }
    @Transactional
    public Contact addContact(Contact con)
    {
        return repo.save(con);
    }
     @Transactional
    public String updateContact(int c)
    {
    Optional<Contact> optionalContact = repo.findById(c);

    if (optionalContact.isPresent()) 
    {
        Contact con = optionalContact.get();  

        System.out.print("Enter the first name: ");
        con.setFirstName(sc.next());

        System.out.print("Enter the last name: ");
        con.setLastName(sc.next());

        System.out.print("Enter the email id: ");
        con.setEmail(sc.next());

        repo.save(con);  

        return "Contact updated successfully: " + con.toString();
    }

            return "Contact not found";
    }

    
    @Transactional
    public void deleteContact(int id)
    {
        repo.deleteById(id);
        System.out.println("Contact with Id: "+id+" deleted successfully");
    }
    public List<Contact> searchContactByLastName(String lastname)
    {
        return repo.findByLastNameIgnoreCase(lastname);
    }
    public List<Contact> searchContactByLetter(String letter)
    {
        return repo.findByFirstNameContainingIgnoreCase(letter);
    }
    public List<Contact> searchContactByName(String name)
    {
        return repo.findByFirstNameOrLastName(name,name);
    }
}
