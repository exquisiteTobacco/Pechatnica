package com.printinghouse.model;

public class Paper {
    private PaperSize size;
    private PaperType type;

    private double  basePrice;

    public Paper(PaperSize size, PaperType type, double basePrice) {
        this.size = size;
        this.type = type;
        this.basePrice = basePrice;
    }

    public PaperSize getSize() {
        return size;
    }

    public void setSize(PaperSize size) {
        this.size = size;
    }

    public PaperType getType() {
        return type;
    }

    public void setType(PaperType type) {
        this.type = type;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
}
