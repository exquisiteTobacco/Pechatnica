package com.printinghouse.model;

public class Publication {
    private String  name;
    private int numberOfPages;

    private PaperSize size;

    public Publication(String name, int numberOfPages, PaperSize size) {
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public PaperSize getSize() {
        return size;
    }

    public void setSize(PaperSize size) {
        this.size = size;
    }
}
