<<<<<<< HEAD
package com.example.litepaltest;


import org.litepal.crud.DataSupport;

public class Book  extends DataSupport {

    private int id;

    private String author;

    private double price;

    private int pages;

    private String name;

    private String press;

    public int getId() {
        return id;
    }

//    public Book(int id, String author, double price, int pages, String name) {
//        this.id = id;
//        this.author = author;
//        this.price = price;
//        this.pages = pages;
//        this.name = name;
//    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getPress() {
        return press;
    }
    public void setPress(String press) {
        this.press = press;
    }

}
=======
package com.example.litepaltest;


import org.litepal.crud.DataSupport;

public class Book  extends DataSupport {

    private int id;

    private String author;

    private double price;

    private int pages;

    private String name;

    private String press;

    public int getId() {
        return id;
    }

//    public Book(int id, String author, double price, int pages, String name) {
//        this.id = id;
//        this.author = author;
//        this.price = price;
//        this.pages = pages;
//        this.name = name;
//    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getPress() {
        return press;
    }
    public void setPress(String press) {
        this.press = press;
    }

}
>>>>>>> fc39a20ba4672ed61e92361009850fbac0de10f0
