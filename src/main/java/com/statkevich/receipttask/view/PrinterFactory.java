package com.statkevich.receipttask.view;

/**
 * Described class used to instantiate implementations of Printer interface.
 * Must be implemented by {@link com.statkevich.receipttask.view.ConsolePrinterFactory},
 * {@link com.statkevich.receipttask.view.FilePrinterFactory} and
 * {@link com.statkevich.receipttask.view.PdfPrinterFactory}
 */
public interface PrinterFactory {
    Printer createPrinter();
}
