package com.vti.entity;

import java.util.ArrayList;
import java.util.Scanner;

public class MyNews {
    public static void questionh_1() {
        ArrayList<News> listNews = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1.Insert news ");
            System.out.println("2.View list news ");
            System.out.println("3.Average rate ");
            System.out.println("4.Exit ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    News news = new News();
                    System.out.println("Nhập Title: ");
                    news.setTitle(sc.nextLine());
                    System.out.println("Nhập PublishDate: ");
                    news.setPublishDate(sc.nextLine());
                    System.out.println("Nhập  Author: ");
                    news.setAuthor(sc.nextLine());
                    System.out.println("Nhập Content:");
                    news.setContent(sc.nextLine());
                    for (int i = 0; i < 3; i++) {
                        System.out.println("Rate" + (i + 1) + ": ");
                        news.rates[i] = sc.nextInt();
                    }
                    sc.nextLine();
                    listNews.add(news);
                    break;
                case 2:
                    for (News news1 : listNews) {
                        news1.display();
                    }
                    break;
                case 3:
                    for (News news1 : listNews) {
                        news1.calculate();
                        news1.display();
                    }
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Nhập sai!");
            }
        }
    }
}
