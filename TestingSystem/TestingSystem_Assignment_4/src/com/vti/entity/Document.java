package com.vti.entity;

public class Document {
    private final String idDocument;
    private String nameNXB;
    private int soBanPhatHanh;

    public Document(String idDocument, String nameNXB, int soBanPhatHanh) {
        this.idDocument = idDocument;
        this.nameNXB = nameNXB;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public String getIdDocument() {
        return idDocument;
    }

    public String getNameNXB() {
        return nameNXB;
    }

    public void setNameNXB(String nameNXB) {
        this.nameNXB = nameNXB;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }

    @Override
    public String toString() {
        return "Document{" +
                "idDocument=" + idDocument +
                ", nameNXB='" + nameNXB + '\'' +
                ", soBanPhatHanh=" + soBanPhatHanh +
                '}';
    }
}
