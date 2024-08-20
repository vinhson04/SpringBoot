package jsp.codeview.vn.employeemanage.controller.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student_t")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int student_id;

    @Column(name = "student_code")
    private String student_code;
    @Column(name = "fullname")
    private String fullname;
    @Column(name = "subject_name")
    private String subject_name;
    @Column(name = "credit")
    private int credit;
    @Column(name = "score1")
    private double score1;
    @Column(name = "score2")
    private double score2;

    public Student(int student_id, String student_code, String fullname, int credit, double score1, double score2) {
        this.student_id = student_id;
        this.student_code = student_code;
        this.fullname = fullname;
        this.credit = credit;
        this.score1 = score1;
        this.score2 = score2;
    }

    public Student() {}

    public int getStudent_id() { return student_id; }
    public void setStudent_id(int student_id) { this.student_id = student_id; }
    public String getStudent_code() { return student_code; }
    public void setStudent_code(String student_code) { this.student_code = student_code; }
    public String getFullname() { return fullname; }
    public void setFullname(String fullname) { this.fullname = fullname; }
    public String getSubject_name() { return subject_name; }
    public void setSubject_name(String subject_name) { this.subject_name = subject_name; }
    public int getCredit() { return credit; }
    public void setCredit(int credit) { this.credit = credit; }
    public double getScore1() { return score1; }
    public void setScore1(double score1) { this.score1 = score1; }
    public double getScore2() { return score2; }
    public void setScore2(double score2) { this.score2 = score2; }


    @Override
    public String toString() {
        return "Student [student_id=" + student_id + ", student_code=" + student_code + ", fullname=" + fullname + ", subject_name=" + subject_name + ", credit=" + credit + ", score1=" + score1 + ", score2=" + score2 + "]";
    }


}
