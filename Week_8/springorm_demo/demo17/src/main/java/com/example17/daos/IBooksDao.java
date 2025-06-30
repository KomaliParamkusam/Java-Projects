package com.example17.daos;

import java.util.List;

import com.example17.entity.Books;

public interface IBooksDao 
{
    public int insert(Books b);
     public Books getOneBookDetails(int bid);
      public List<Books> getAllBooks();
       public void updateBook(Books b);
        public void deleteBook(int bid);
}
