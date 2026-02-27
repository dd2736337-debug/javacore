package entity;

import java.time.LocalDate;

public class Question {
    public int questionId;
    public String conTent;
    public CategoryQuestion category;
    public TypeQuestion typequestion;
    public Account creator;
    public LocalDate createDate;
}
