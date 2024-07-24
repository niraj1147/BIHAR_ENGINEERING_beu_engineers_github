package com.example.beuengineers.Pyq;

public class PyqModel {


    String id,pyqchapter,pyqpdfLink;

    public PyqModel() {

    }

    public PyqModel(String id, String pyqchapter, String pyqpdfLink) {
        this.id = id;
        this.pyqchapter = pyqchapter;
        this.pyqpdfLink = pyqpdfLink;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getChapter() {
        return pyqchapter;
    }

    public void setChapter(String chapter) {
        this.pyqchapter = chapter;
    }

    public String getPdfLink() {
        return pyqpdfLink;
    }

    public void setPdfLink(String pdfLink) {
        this.pyqpdfLink = pdfLink;
    }


}
