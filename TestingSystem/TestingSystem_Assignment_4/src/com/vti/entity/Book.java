package com.vti.entity;

public class Book extends Document {
    private String bookName;
    private int soTrang;

    public Book(String bookName, int soTrang, String idDocument, String nameNXB, int soBaPhatHanh) {
        super(idDocument, nameNXB, soBaPhatHanh);
        this.bookName = bookName;
        this.soTrang = soTrang;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
}
