import java.util.*;
//creating class for Rooms data
class Room {
    int Capacity=3;
    int Number;
    int occupancy=0;

}
//creating class for students and, it has method to show data
class Student {

    int Id;
    String Name;
    String Dept;
    int year;
    double Phone_Number;
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
// creating class for staff and, it also has method to show info
class Staff{
    int Staff_Id;
    String Staff_Name;
    int salary;
    void Show_Info(){
        System.out.println("Name:"+" "+this.Staff_Name);
        System.out.println("ID:"+" "+this.Staff_Id);
        System.out.println("Salary:"+" "+this.salary);
    }


}
//created a class for all methods to implement
class methods {
    Scanner sc= new Scanner(System.in);
    Student[] student1 = new Student[300];
    for(int i=0;i<300;i++){
        student1[i]=new Student();
    }
    Staff[] staff = new Staff[10];
    for(int i=0;i<10;i++){
        staff[i]=new Staff();
    }
    Room[] rooms = new Room[100];
    for(int i=0;i<100;i++){
        rooms[i]=new Room();
    }

    void Add_Student(int last_num) {
        System.out.print("Enter Student Name:");
        student1[last_num].Name = sc.nextLine();
        System.out.println("Enter Roll Number:");
        student1[last_num].Id = sc.nextInt();
        System.out.println("Enter Department:");
        student1[last_num].Dept = sc.nextLine();
        System.out.println("Enter PhoneNumber:");
        student1[last_num].Phone_Number = sc.nextDouble();
        System.out.println("Fees:");
        student1[last_num].Hostel_Fees = sc.nextInt();
        System.out.println("Enter Room Number Allocated:");
        student1[last_num].Room = sc.nextInt();
        rooms[student1[last_num].Room].Number = student1[last_num].Room;
        last_num++;
    }

    void Add_Staff(int fi) {
        System.out.println("Enter staff member Name:");
        staff[fi].Staff_Name = sc.nextLine();
    }
    for(int i=0;i<last_num;i++){
        rooms[student1[i].Room].Number=student1[i].Room;
        rooms[student1[i].Room].Capacity=3;
        rooms[student1[i].Room].occupancy++;

    }
}
public class Main{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int m= sc.nextInt();
        Student[] student1=new Student[m];
        int last_num=0,fi=0;

        /* Input from user to execute */

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
            if(n==1) {

            }
            else if(n==2){
                int id=sc.nextInt();
                for(int i=0;i<300;i++){
                    if(student1[i].Id==id){
                        student1[i].Show_Info();
                        break;
                    }
                }
            }
            else if(n==3){
                int id=sc.nextInt();
                for(int i=0;i<300;i++){
                    if(student1[i].Id==id){
                        student1[i].Room=sc.nextInt();
                        student1[i].Hostel_Fees=sc.nextInt();
                        break;
                    }
                }
            }
            else if(n==4){
                int id=sc.nextInt();
                for(int i=0;i<300;i++){
                    if(student1[i].Id==id){
                        student1[i]=NULL;
                        break;
                    }
                }

            }
            else if(n==5){
                int id=sc.nextInt();
                for(int i=0;i<300;i++){
                    if(student1[i].Id==id){
                        student1[i].Room=sc.nextInt();
                        break;
                    }
                }

            }
            else if(n==6){
                int id=sc.nextInt();
                System.out.println("Enter the amount of fees paid:");
                int fees=sc.nextInt();
                for(int i=0;i<300;i++){
                    if(student1[i].Id==id){
                        student1[i].Hostel_Fees=student1[i].Hostel_Fees-fees;
                        break;
                    }
                }
            }
            else if(n==7){
                int id=sc.nextInt();
                for(int i=0;i<10;i++){
                    if(Staff[i].Staff_Id==id){
                        Staff[i].Show_Info();

                    }
                }

            }

        }

    }
}



