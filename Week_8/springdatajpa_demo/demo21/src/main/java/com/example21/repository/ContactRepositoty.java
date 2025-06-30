package com.example21.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example21.entity.Contact;


public interface ContactRepositoty extends JpaRepository<Contact, Integer>
{
    
    public List<Contact> findByLastNameIgnoreCase(String lastname);
    public List<Contact> findByFirstNameContainingIgnoreCase(String keyword);
    public List<Contact> findByFirstNameOrLastName(String fname,String lname);
    
}
