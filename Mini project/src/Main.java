import java.util.*;

class Student{
    int Id;
    String Name;
    String Dept;
    int year;
    private double Phone_Number;
    int Room;
    int Hostel_Fees ;
    void Show_Info(){
        System.out.println("Name :"+" "+this.Name);
        System.out.println("Department"+" "+this.Dept);
        System.out.println("Roll No:"+" "+this.Id);
        System.out.println("Year"+" "+this.year);
        System.out.println("Room Number"+" "+this.Room);
        System.out.println("Hostel Fees Status:"+" "+this.Hostel_Fees);
    }
}
class Staff{
    int Staff_Id;
    String Staff_Name;
    int salary;

}
class Room extends Student{
    int Capacity;
    String Type;

}
public class Main{
    public static void main(String [] args){



















        /* Input from user to execute */
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        do{
            System.out.println("1.Add Student");
            System.out.println("2.View Student");
            System.out.println("3.Update Student");
            System.out.println("4.Remove Student");
            System.out.println("5.Room Allotment");
            System.out.println("6.Pay Hostel Fees");
            System.out.println("7.View Staff");
            System.out.println("8.Exit");
        }
        while(n!=8){

        }
    }
}
