package entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exam {
    public int examId;
    public String code;
    public String title;
    public CategoryQuestion category;
    public int duration;
    public Account creator;
    public LocalDateTime createDate;
}
