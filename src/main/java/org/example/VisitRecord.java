package org.example;

import java.time.LocalDateTime;

public class VisitRecord {
    // Attributes
    String name;
    LocalDateTime entry;
    LocalDateTime exit;

    // Constructors
    public VisitRecord(String n, LocalDateTime en, LocalDateTime ex) throws Exception {
        if(ex.isBefore(en)) throw new InvalidEntryExitTimeException();
        this.name = n;
        this.entry = en;
        this.exit = ex;
    }
    public VisitRecord(String n, LocalDateTime en) throws Exception {
        this.name = n;
        this.entry = en;
        this.exit = null;
    }
}

class InvalidEntryExitTimeException extends Exception {
    public InvalidEntryExitTimeException(){
        super();
    }
}
