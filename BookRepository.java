package com.m2i.poe.shop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BookRepository implements IBookRepository {


    private List<Book > bookList =new ArrayList<> ();

    @Override
    public void load(String uri) throws IOException {
        BufferedReader reader = new BufferedReader ( new FileReader (uri) );
        reader.readLine ();  // saute la premiere ligne
        String line= reader.readLine();
        while(line!=null) {
            StringTokenizer st= new StringTokenizer(line,";" ); //separe les columns
            st.nextToken();
            bookList.add (new Book(st.nextToken(),  //New Book added in booklist : id
                            st.nextToken (), // title
                            Double.parseDouble(st.nextToken()), //price
                    "2018", //publication year
                        ""));   //type
            line=reader.readLine ();
        }
        reader.close ();
    }

    @Override
    public List<Book> getAll() {

        for (Book b:bookList) {
            System.out.println ( b.toString ());
        }
        return bookList;
    }

    @Override
    public Book getById(int id) {
        return null;
    }


    @Override
    public List<Book> getByTitle(String title) {

        return null;
    }


    @Override
    public List<Book> getByPrice(double price) {
        return null;
    }

    @Override
    public List<Book> getByNpages(double nbpages) {
        return null;
    }

    @Override
    public List<Book> getByPublisher(String publisher) {
        return null;
    }
}
