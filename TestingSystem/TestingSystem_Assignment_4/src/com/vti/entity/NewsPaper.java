package com.vti.entity;

import java.time.LocalDate;

public class NewsPaper extends Document {
    private LocalDate day;

    public NewsPaper(LocalDate day, String idDoCument, String nameNXB, int soBanPhatHanh) {
        super(idDoCument, nameNXB, soBanPhatHanh);
        this.day = day;
    }

}
