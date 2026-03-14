package com.vti.entity;

import java.time.LocalDate;

public class Magazine extends Document {
    private int soPhatHanh;
    private LocalDate month;

    public Magazine(int soPhatHanh, LocalDate month, String idDocument, String nameNXB, int soBanPhatHanh) {
        super(idDocument, nameNXB, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.month = month;
    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public LocalDate getMonth() {
        return month;
    }

    public void setMonth(LocalDate month) {
        this.month = month;
    }
}
