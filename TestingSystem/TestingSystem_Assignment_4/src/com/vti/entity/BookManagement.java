package com.vti.entity;

import java.util.ArrayList;
import java.util.List;

public class BookManagement {
    List<Document> danhSach = new ArrayList<>();

    public void addDocument(Document document) {
        danhSach.add(document);
    }

    public void removeDocument(String id) {
        danhSach.removeIf(t -> id.equals(t.getIdDocument()));
    }

    public void disPlay() {
        for (Document document : danhSach) {
            System.out.println(document);
        }
    }

    public void timTheoLoai(String name) {
        for (Document document : danhSach) {
            if (name.equals("Book") && document instanceof Book) {
                System.out.println(document);
            }
            if (name.equals("Magazine") && document instanceof Magazine) {
                System.out.println(document);
            }
            if (name.equals("NewsPaper") && document instanceof NewsPaper) {
                System.out.println(document);
            }
        }
    }
}
