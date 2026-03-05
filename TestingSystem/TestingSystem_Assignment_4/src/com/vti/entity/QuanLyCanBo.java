package com.vti.entity;

import java.util.ArrayList;

public class QuanLyCanBo {
    ArrayList<CanBo> list = new ArrayList<>();

    public void add(CanBo canBo) {
        list.add(canBo);
    }

    public void show() {
        for (CanBo canBo : list) {
            System.out.println(canBo.name);
        }
    }
}
