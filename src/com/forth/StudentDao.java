package com.forth;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDao {
    ArrayList<String> stuNames = new ArrayList<String>(10);
    ArrayList<String> stuLastNames = new ArrayList<String>(10);
    ArrayList<Long> stuPhoneNums= new ArrayList<Long>(10);
    ArrayList<Integer> stuSsn  = new ArrayList<Integer>(10);
    ArrayList<Double> stuGpa = new ArrayList<Double>(10);
    ArrayList<Integer> stuIds = new ArrayList<Integer>(10);
    ArrayList<String> stuEmails = new ArrayList<String>(10);
    ArrayList<Integer> stuIndex = new ArrayList<Integer>(10);
    ArrayList<String> stuFullNames = new ArrayList<String>(20);
    int stunum=-1;
    int index = 0;
    Object[] stuInfo = new Object[7];
    int status;

    public void Starts (){

        Student test = new Student();
        ArrayList<Student> StudentInfo = new ArrayList<>();
        System.out.println("                           TechBee Solutions Academy                                     ");
        System.out.println("                           Instructor Deep Singh                                         ");
        System.out.println("(1)Add Student   (2)Remove Student  (3)Update Student Info  (4)Current Students   (5)Quit");


        Scanner scan = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please select number or hit (5) to quit.");
        status = scan.nextInt();
        boolean on = true;
        while (on) {
            switch(status) {



                case 1:
                    //test.addStudent();




                    Student newStu = new Student();
                    stunum++;
                    if(stunum>10){

                        System.out.println("Maximum number of students reached./n Please remove a student.");
                    }else {
                        Scanner scans = new Scanner(System.in);
                        System.out.println("Enter student first name:");
                        stuNames.add(scans.nextLine());

                        stuIndex.add(index);
                        index++;


                        System.out.println("Enter student last name:");
                        stuLastNames.add(scans.nextLine());
                        String entry = stuNames.get(stunum) + " " + stuLastNames.get(stunum);
                        stuFullNames.add(entry);
                        //System.out.println(stuFullNames.get(stunum));


                        System.out.println("Enter student telephone number:");
                        stuPhoneNums.add(scans.nextLong());


                        System.out.println("Enter student Gpa");
                        stuGpa.add(scans.nextDouble());


                        System.out.println("Enter student social security number:");
                        stuSsn.add(scans.nextInt());



                        System.out.println("Enter student Email Address:");
                        Scanner scan2 = new Scanner(System.in);
                        stuEmails.add(scan2.nextLine());


                        stuIds.add(createId());
                        for(int i=0; i>stuIds.size(); i++){
                            if (stuIds.get(stunum) == stuIds.get(i))  {
                                stuIds.set(stunum, createId());

                            }
                        }
                        System.out.println(stuNames.get(stunum) + "" + stuLastNames.get(stunum) + "ID number is: " + stuIds.get(stunum));

                    }





                    System.out.println("(1)Add Student   (2)Remove Student  (3)Update Student Info  (4)Current Students   (5)Quit");
                    System.out.println("Please select number or hit (5) to quit.");
                    status = scan.nextInt();
                    break;
                case 2:
                    //test.removeStudent();


                    System.out.println("Enter student last name.");
                    Scanner scan4 = new Scanner(System.in);
                    String test100 = scan4.nextLine();
                    System.out.println("Input is: " + test100);

                    for(int z = 0; z<stuLastNames.size(); z++){
                        System.out.println(stuLastNames.get(z));
                        if(test100.equals(stuLastNames.get(z))){
                            stuPhoneNums.remove(z);
                            stuGpa.remove(z);
                            stuSsn.remove(z);
                            stuEmails.remove(z);
                            stuIds.remove(z);
                            System.out.println(stuFullNames.get(z) + " has been removed.");
                            stuFullNames.remove(z);
                            stuLastNames.remove(z);
                            stuNames.remove(z);
                            stunum--;

                        }
                    }






                    System.out.println("(1)Add Student   (2)Remove Student  (3)Update Student Info  (4)Current Students   (5)Quit");
                    System.out.println("Please select number or hit (5) to quit.");
                    status = scan.nextInt();
                    break;
                case 3:
                    //test.updateStuInfo();


                    System.out.println("Enter student ID number:");
                    Scanner scan5 = new Scanner(System.in);
                    int test9000 = scan5.nextInt();
                    for(int b = 0; b<stuIds.size(); b++){
                        if(test9000 == stuIds.get(b)){
                            System.out.println("(1)First Name: " + stuNames.get(b));
                            System.out.println("(2)Last Name: " + stuLastNames.get(b));
                            System.out.println("(3)Student Social: " + stuSsn.get(b));
                            System.out.println("(4)Telephone number: " + stuPhoneNums.get(b));
                            System.out.println("(5)Email Address: " + stuEmails.get(b));
                            //System.out.println("(6)Student Id: " + stuIds.get(b));
                            System.out.println("Select attribute by number to change(1-5).");
                            Scanner scan8 = new Scanner(System.in);
                            int test00 = scan8.nextInt();
                            int sel[] = {1,2,3,4,5,6};
                            switch(test00){//for(int dee =1; dee<7; dee++){
                                case 1://if(test00 == sel[dee]){
                                    System.out.println("Enter updated first name: ");
                                    Scanner ttest = new Scanner(System.in);
                                    String dtest = ttest.nextLine();
                                    stuNames.set(b, dtest);
                                    stuFullNames.set(b, stuNames.get(b) + " " + stuLastNames.get(b));
                                    System.out.println("First name updated.");
                                    break;
                                //}
                                case 2:{//if(test00 == sel[dee]){
                                    System.out.println("Enter updated last name: ");
                                    Scanner ttest0 = new Scanner(System.in);
                                    dtest = ttest0.nextLine();
                                    stuLastNames.set(b, dtest);
                                    stuFullNames.set(b, stuNames.get(b) + " " + stuLastNames.get(b));
                                    System.out.println("Last name updated.");
                                    break;
                                }

                                case 3:{
                                    System.out.println("Enter updated ssn: ");
                                    Scanner ttest0 = new Scanner(System.in);
                                    int ltest = ttest0.nextInt();
                                    stuSsn.set(b, ltest);
                                    System.out.println("SSN updated.");
                                    break;
                                }
                                case 4:{
                                    System.out.println("Enter updated telephone number: ");
                                    Scanner ttest0 = new Scanner(System.in);
                                    long ltest = ttest0.nextInt();
                                    stuPhoneNums.set(b, ltest);
                                    System.out.println("SSN updated.");
                                    break;
                                }
                                case 5:{
                                    System.out.println("Enter updated email address: ");
                                    Scanner ttest0 = new Scanner(System.in);
                                    String ltest = ttest0.nextLine();
                                    stuEmails.set(b, ltest);
                                    System.out.println("Email address updated.");
                                    break;
                                }
                            }
                        }
                    }





                    System.out.println("(1)Add Student   (2)Remove Student  (3)Update Student Info  (4)Current Students   (5)Quit");
                    System.out.println("Please select number or hit (5) to quit.");
                    status = scan.nextInt();
                    break;
                case 4:
                    //test.listStudents();


                    System.out.println("The current students enrolled are:");
                    //Collections.sort(stuFullNames);  // Sort cars
                    //for (String i : stuFullNames) {
                    for (int x = 0; x < stuFullNames.size(); x++) {
                        System.out.println("First Name: " + stuNames.get(x));
                        System.out.println("Last Name: " + stuLastNames.get(x));
                        System.out.println("Phone Number: " + stuPhoneNums.get(x));
                        System.out.println("Grade Point Average: " + stuGpa.get(x));
                        System.out.println("Social Security Number: " + stuSsn.get(x));
                        System.out.println("Email Address: " + stuEmails.get(x));
                        System.out.println("Student Id: " + stuIds.get(x));
                        System.out.println("****************************************");
                    }







                    System.out.println("\n");
                    System.out.println("(1)Add Student   (2)Remove Student  (3)Update Student Info  (4)Current Students   (5)Quit");
                    System.out.println("Please select number or hit (5) to quit.");
                    status = scan.nextInt();
                    break;
                case 5:
                    System.out.println("Goodbye.");
                    System.exit(0);
                    break;

                default:

            }
        }/*else{
                System.out.println("Goodbye.");
                quit();
            }*/
    }

    /*public static void quit() {
        System.exit(0);

    }*/
    public  void addStudent(){

        Student newStu = new Student();
        stunum++;
        if(stunum>10){

            System.out.println("Maximum number of students reached./n Please remove a student.");
        }else {
            Scanner scans = new Scanner(System.in);
            System.out.println("Enter student first name:");
            stuNames.add(scans.nextLine());

            stuIndex.add(index);
            index++;


            System.out.println("Enter student last name:");
            stuLastNames.add(scans.nextLine());
            String entry = stuNames.get(stunum) + " " + stuLastNames.get(stunum);
            stuFullNames.add(entry);
            //System.out.println(stuFullNames.get(stunum));


            System.out.println("Enter student telephone number:");
            stuPhoneNums.add(scans.nextLong());


            System.out.println("Enter student Gpa");
            stuGpa.add(scans.nextDouble());


            System.out.println("Enter student social security number:");
            stuSsn.add(scans.nextInt());



            System.out.println("Enter student Email Address:");
            Scanner scan2 = new Scanner(System.in);
            stuEmails.add(scan2.nextLine());


            stuIds.add(createId());
            for(int i=0; i>stuIds.size(); i++){
                if (stuIds.get(stunum) == stuIds.get(i))  {
                    stuIds.set(stunum, createId());

                }
            }
            System.out.println(stuNames.get(stunum) + "" + stuLastNames.get(stunum) + "ID number is: " + stuIds.get(stunum));

        }
    }
    public int createId(){
        int min = 11111;
        int max = 99999;
        int id = 0;
        id = (int)(Math.random()*(max-min+1)+min);
        return id;
    }
    public void listStudents() {
        System.out.println("The current students enrolled are:");
        //Collections.sort(stuFullNames);  // Sort cars
        //for (String i : stuFullNames) {
        for (int x = 0; x < stuFullNames.size(); x++) {
            System.out.println("First Name: " + stuNames.get(x));
            System.out.println("Last Name: " + stuLastNames.get(x));
            System.out.println("Phone Number: " + stuPhoneNums.get(x));
            System.out.println("Grade Point Average: " + stuGpa.get(x));
            System.out.println("Social Security Number: " + stuSsn.get(x));
            System.out.println("Email Address: " + stuEmails.get(x));
            System.out.println("Student Id: " + stuIds.get(x));
            System.out.println("****************************************");
        }

    }
    //}

    public void formatStuList(){
        for(int i = 0; i<10; i++){

        }
    }
    public void removeStudent(){
        System.out.println("Enter student last name.");
        Scanner scan4 = new Scanner(System.in);
        String test100 = scan4.nextLine();
        System.out.println("Input is: " + test100);

        for(int z = 0; z<stuLastNames.size(); z++){
            System.out.println(stuLastNames.get(z));
            if(test100.equals(stuLastNames.get(z))){
                stuPhoneNums.remove(z);
                stuGpa.remove(z);
                stuSsn.remove(z);
                stuEmails.remove(z);
                stuIds.remove(z);
                System.out.println(stuFullNames.get(z) + " has been removed.");
                stuFullNames.remove(z);
                stuLastNames.remove(z);
                stuNames.remove(z);
                stunum--;

            }
        }

    }
    public void updateStuInfo() {
        System.out.println("Enter student ID number:");
        Scanner scan5 = new Scanner(System.in);
        int test9000 = scan5.nextInt();
        for(int b = 0; b<stuIds.size(); b++){
            if(test9000 == stuIds.get(b)){
                System.out.println("(1)First Name: " + stuNames.get(b));
                System.out.println("(2)Last Name: " + stuLastNames.get(b));
                System.out.println("(3)Student Social: " + stuSsn.get(b));
                System.out.println("(4)Telephone number: " + stuPhoneNums.get(b));
                System.out.println("(5)Email Address: " + stuEmails.get(b));
                //System.out.println("(6)Student Id: " + stuIds.get(b));
                System.out.println("Select attribute by number to change(1-5).");
                Scanner scan8 = new Scanner(System.in);
                int test00 = scan8.nextInt();
                int sel[] = {1,2,3,4,5,6};
                switch(test00){//for(int dee =1; dee<7; dee++){
                    case 1://if(test00 == sel[dee]){
                        System.out.println("Enter updated first name: ");
                        Scanner ttest = new Scanner(System.in);
                        String dtest = ttest.nextLine();
                        stuNames.set(b, dtest);
                        stuFullNames.set(b, stuNames.get(b) + " " + stuLastNames.get(b));
                        System.out.println("First name updated.");
                        break;
                    //}
                    case 2:{//if(test00 == sel[dee]){
                        System.out.println("Enter updated last name: ");
                        Scanner ttest0 = new Scanner(System.in);
                        dtest = ttest0.nextLine();
                        stuLastNames.set(b, dtest);
                        stuFullNames.set(b, stuNames.get(b) + " " + stuLastNames.get(b));
                        System.out.println("Last name updated.");
                        break;
                    }

                    case 3:{
                        System.out.println("Enter updated ssn: ");
                        Scanner ttest0 = new Scanner(System.in);
                        int ltest = ttest0.nextInt();
                        stuSsn.set(b, ltest);
                        System.out.println("SSN updated.");
                        break;
                    }
                    case 4:{
                        System.out.println("Enter updated telephone number: ");
                        Scanner ttest0 = new Scanner(System.in);
                        long ltest = ttest0.nextInt();
                        stuPhoneNums.set(b, ltest);
                        System.out.println("SSN updated.");
                        break;
                    }
                    case 5:{
                        System.out.println("Enter updated email address: ");
                        Scanner ttest0 = new Scanner(System.in);
                        String ltest = ttest0.nextLine();
                        stuEmails.set(b, ltest);
                        System.out.println("Email address updated.");
                        break;
                    }
                }
            }
        }
    }

}

