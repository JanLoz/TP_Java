package com.m2i.poe.shop;

import java.io.IOException;
import java.util.List;

public interface IBookRepository {

    void load (String uri) throws IOException;
    List<Book> getAll();
    Book getById (int id);
    List<Book> getByTitle(String title);
    List<Book> getByPrice (double price);
    List<Book> getByNpages (double nbpages);
    List<Book> getByPublisher(String publisher);

}

