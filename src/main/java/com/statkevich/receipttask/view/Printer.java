package com.statkevich.receipttask.view;

import com.statkevich.receipttask.dto.ReceiptDto;

/**
 * Described class used to handle output of application.
 * Must be implemented by {@link com.statkevich.receipttask.view.ConsolePrinter},
 * {@link com.statkevich.receipttask.view.FilePrinter} and
 * {@link com.statkevich.receipttask.view.PdfPrinter}
 */
public interface Printer {

    void print(ReceiptDto receiptDto);
}
