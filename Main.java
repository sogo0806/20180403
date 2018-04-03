
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        ArrayList<Student>students1 = new ArrayList<>();
        ArrayList<Teacher>teachers1 = new ArrayList<>();
        ArrayList<Starf>starf1 = new ArrayList<>();
        Student student1 = new Student("蕭詠心","anita","資訊工程學系","anita1999349@yahoo.com.tw","0966811427123","asia","10602101ASD2", (short) 2,165,55);
        System.out.println("姓名:"+student1.getcName());
        System.out.println("英文:"+student1.geteName());
        System.out.println("系別:"+student1.getDepartment());
        System.out.println("信箱:"+student1.getEmail());
        System.out.println("電話:"+student1.getPhone());
        System.out.println("住址:"+student1.getAddress());
        System.out.println("id:"+student1.getId());
        System.out.println("性別:"+student1.getSex());
        System.out.println("身高:"+student1.getHeight());
        System.out.println("體重:"+student1.getWeight());
    }
}
