package com.statkevich.receipttask.view;

public class PdfPrinterFactory implements PrinterFactory {
    @Override
    public Printer createPrinter() {
        return new PdfPrinter();
    }
}
