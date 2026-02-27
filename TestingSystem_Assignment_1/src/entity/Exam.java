package entity;

import java.time.LocalDate;

public class Exam {
    public int examId;
    public String code;
    public String title;
    public CategoryQuestion category;
    public int duration;
    public Account creator;
    public LocalDate createDate;
}
