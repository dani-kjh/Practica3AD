/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagen;

/**
 *
 * @author alumne
 */
public class Image {
    int id;
    String title;
    String description;
    String keywords;
    String author;
    String capture_date;  
    String storage_date;
    String creator;
    String filename;
    
    
    public String gettitle() {
        return title;
    }

    public void settitle(String title) {
        this.title = title;
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getdescription() {
        return description;
    }

    public void setDescripcio(String description) {
        this.description = description;
    }

    public String getkeywords() {
        return keywords;
    }

    public void setkeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getauthor() {
        return author;
    }

    public void setauthor(String author) {
        this.author = author;
    }

    public String getcapture_date() {
        return capture_date;
    }

    public void setcapture_date(String capture_date) {
        this.capture_date = capture_date;
    }

    public String getstorage_date() {
        return storage_date;
    }

    public void setstorage_date(String storage_date) {
        this.storage_date = storage_date;
    }

    public String getcreator() {
        return creator;
    }

    public void setcreator(String creator) {
        this.creator = creator;
    }
    
    public String getfilename() {
        return filename;
    }

    public void setfilename(String filename) {
        this.filename = filename;
    }
}
