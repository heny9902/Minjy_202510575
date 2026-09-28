import java.util.Scanner;
class Student {
    long studentId;
    String name;
    String major;
    long phone;

    long getStudentId() {return studentId;}

    void setStudentId(long id) {studentId = id;}

    String getName() {return name;}

    void setName(String n) {name = n;}

    String getMajor() {return major;}

    void setMajor(String m) {major = m;}

    long getPhone() {return phone;}

    void setPhone(long p) {phone = p;}
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            students[i] = new Student();

            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");

            String idStr = scanner.next();
            String nameStr = scanner.next();
            String majorStr = scanner.next();
            String phoneStr = scanner.next();

            students[i].setStudentId(Long.parseLong(idStr));
            students[i].setName(nameStr);
            students[i].setMajor(majorStr);
            students[i].setPhone(Long.parseLong(phoneStr));
        }

        System.out.println("\n입력된 학생들의 정보는 다음과 같습니다.");

        for (int i = 0; i < 3; i++) {
            String phoneString = Long.toString(students[i].getPhone());

            phoneString = "0" + phoneString;

            String part1 = phoneString.substring(0, 3);
            String part2 = phoneString.substring(3, 7);
            String part3 = phoneString.substring(7);

            String formattedPhone = part1 + "-" + part2 + "-" + part3;

            System.out.println((i + 1) + "번째 학생: " + students[i].getStudentId() + " " +
                    students[i].getName() + " " + students[i].getMajor() + " " +formattedPhone);
        }
    }
}