package com.example.udemyjavacourse.udemy_section_eight;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        this.tonerLevel = tonerLevel < 0 || tonerLevel > 100 ? -1 : tonerLevel;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount < 0 || tonerAmount > 100) {
            return -1;
        }

        if (tonerAmount + tonerLevel > 100) {
            return -1;
        }

        return tonerLevel += tonerAmount;
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;

        pagesToPrint = duplex ? (pagesToPrint % 2 + (pagesToPrint / 2)) : pagesToPrint;
        pagesPrinted += pagesToPrint;

        return pagesToPrint;
    }


    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
