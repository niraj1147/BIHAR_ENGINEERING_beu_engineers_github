package com.example.beuengineers.Recyclernotes;

public class Model {

    String id,chapter,pdfLink;

    public Model() {

    }

    public Model(String id, String chapter, String pdfLink) {
        this.id = id;
        this.chapter = chapter;
        this.pdfLink = pdfLink;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getChapter() {
        return chapter;
    }

    public void setChapter(String chapter) {
        this.chapter = chapter;
    }

    public String getPdfLink() {
        return pdfLink;
    }

    public void setPdfLink(String pdfLink) {
        this.pdfLink = pdfLink;
    }
}
