package com.printinghouse.service;
import com.printinghouse.exception.PaperColorException;
import com.printinghouse.model.*;
import com.printinghouse.exception.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PrintingMachine {
    private String id;
    private int maxPaper;
    private Boolean colorPrint;

    private int currentPaperLoad;
    private int pagePerMin;


    private int totalPrintedPages;

    private Map<Publication,Integer>PrintedPublication;

    public PrintingMachine(String id, int maxPaper, Boolean colorPrint, int pagePerMin) {
        this.id = id;
        this.maxPaper = maxPaper;
        this.colorPrint = colorPrint;
        this.pagePerMin = pagePerMin;
        this.currentPaperLoad = 0;
        this.totalPrintedPages = 0;
        this.PrintedPublication = new HashMap<>();
    }
    public void loadPaper() {
        this.currentPaperLoad = maxPaper;
    }
    public void printPublication(Publication publication, int copies, boolean color) throws PaperColorException {
        if (color != this.colorPrint) {
            throw new PaperColorException("Color mismatch");
        }

        int pagesToPrint = publication.getNumberOfPages() * copies;



        int printTime = pagesToPrint / this.pagePerMin;

        this.currentPaperLoad -= pagesToPrint;
        this.totalPrintedPages += pagesToPrint;
        this.PrintedPublication.put(publication, copies);

        System.out.println("Printing " + copies + " copies of '" + publication.getName() + "' (" +
                (color ? "Color" : "Black and White") + ")...");
        System.out.println("Printed " + pagesToPrint + " pages in " + printTime + " minutes.");
    }

    public int getTotalPrintedPages() {
        return totalPrintedPages;
    }



}
