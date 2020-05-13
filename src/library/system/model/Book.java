package library.system.model;
// Generated May 13, 2020 8:18:21 PM by Hibernate Tools 4.3.1



import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Book generated by hbm2java
 */
public class Book  implements java.io.Serializable {


     private String bookid;
     private Bookcategory bookcategory;
     private String title;
     private String publishinghouse;
     private Date dateofpublication;
     private String author;
     private Integer pages;
     private Integer numberofcopies;
     private Set checkinouts = new HashSet(0);

    public Book() {
    }

	
    public Book(String bookid) {
        this.bookid = bookid;
    }
    public Book(String bookid, Bookcategory bookcategory, String title, String publishinghouse, Date dateofpublication, String author, Integer pages, Integer numberofcopies, Set checkinouts) {
       this.bookid = bookid;
       this.bookcategory = bookcategory;
       this.title = title;
       this.publishinghouse = publishinghouse;
       this.dateofpublication = dateofpublication;
       this.author = author;
       this.pages = pages;
       this.numberofcopies = numberofcopies;
       this.checkinouts = checkinouts;
    }
   
    public String getBookid() {
        return this.bookid;
    }
    
    public void setBookid(String bookid) {
        this.bookid = bookid;
    }
    public Bookcategory getBookcategory() {
        return this.bookcategory;
    }
    
    public void setBookcategory(Bookcategory bookcategory) {
        this.bookcategory = bookcategory;
    }
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public String getPublishinghouse() {
        return this.publishinghouse;
    }
    
    public void setPublishinghouse(String publishinghouse) {
        this.publishinghouse = publishinghouse;
    }
    public Date getDateofpublication() {
        return this.dateofpublication;
    }
    
    public void setDateofpublication(Date dateofpublication) {
        this.dateofpublication = dateofpublication;
    }
    public String getAuthor() {
        return this.author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    public Integer getPages() {
        return this.pages;
    }
    
    public void setPages(Integer pages) {
        this.pages = pages;
    }
    public Integer getNumberofcopies() {
        return this.numberofcopies;
    }
    
    public void setNumberofcopies(Integer numberofcopies) {
        this.numberofcopies = numberofcopies;
    }
    public Set getCheckinouts() {
        return this.checkinouts;
    }
    
    public void setCheckinouts(Set checkinouts) {
        this.checkinouts = checkinouts;
    }




}

