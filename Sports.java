
import java.util.Scanner;

class Sports {
    int[][] badmintonCourtNewsac = new int[3][10];
    int[][] badmintonCourtOldsac = new int[2][10];
    int[][] tenniscourt = new int[6][10];
    int [][] gymoldsac=new int [20][20];
    int [][] gymnewsac=new int [10][10];
    Scanner sc = new Scanner(System.in);

    Sports() {}

    int menu() {
        System.out.println("MENU:");
        System.out.println("1. BADMINTON COURT(NEW SAC)");
        System.out.println("2. BADMINTON COURT(OLD SAC)");
        
        System.out.println("3. TENNIS COURT ");
        System.out.println("4. GYM OLD SAC");
        System.out.println("5. GYM NEW SAC");
        System.out.println("ENTER THE OPTION: ");
        int option = sc.nextInt();
        return option;
    }

    void games() {
        int n = menu();
        if (n == 1)
            badmintonCourtNewsac();
        else if(n==2)
        badmintonCourtOldsac();
        else if(n==3)
        tenniscourt();
        else if (n==4)
        gymoldsac();
        else if (n==5)
        gymnewsac();
    }
    
    void badmintonCourtNewsac(){
        System.out.println("BADMINTON COURT OPTIONS \n 1.SLOT BOOKING \n 2.ENQUIRY ");
        int option = sc.nextInt();
        if(option ==1) 
        badmintonCourtNewsacslotbooking();
        else if (option ==2)
        badmintonCourtNewsacEnquiry();
        else
        System.out.println("Wrong Option selection ");
        return;
        
    }
    void badmintonCourtNewsacEnquiry()
    {
        System.out.println("WELCOME TO ENQUIRY ");
        System.out.println("ENTER THE ROLL NUMBER = ");
        int roll_number =sc.nextInt();
        int time_slots=0;int court_number=0;
        int flag=0;
        for (int i=0;i<10;i++){
            for(int j=0;j<3;j++){
                if(badmintonCourtNewsac[j][i]==roll_number){
                int c1=i/2;flag=1;
                if (i % 2 == 0) {
                System.out.print("TIME SLOT:=" + (5 + c1) + ".00--" + (5 + c1) + ".30\t\t");
                
            } else {
                System.out.print("TIME SLOT:=" + (5 + c1) + ".30--" + (6 + c1) + ".00\t\t");
                
            }
                                }
            }
        
        
        }
        if(flag==0)System.out.println("NO SLOTS BOOKED ");
        System.out.println("PRESS Y FOR MORE ENTRIES");
    System.out.println("PRESS X FOR RETURN TO MENU");
    System.out.println("PRESS H FOR HOME");
    String c=sc.next();
    if(c.equals("Y"))
    badmintonCourtNewsacEnquiry();
    else if (c.equals("X"))
    badmintonCourtNewsac();
    else if(c.equals("H"))
    games();
    else
    System.out.println("THANK YOU FOR USING THE SYSTEM ");
    
        
    }

    void badmintonCourtNewsacslotbooking() {
        System.out.println("BADMINTON COURT SLOTS");
        System.out.println("TIME                COURTS ");
        int c1 = 0, c2 = 0;
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + 1 + ". " + (5 + c1) + ".00--" + (5 + c1) + ".30\t\t");
                c1++;
            } else {
                System.out.print(i + 1 + ". " + (5 + c2) + ".30--" + (6 + c2) + ".00\t\t");
                c2++;
            }
            for (int j = 0; j < 3; j++) {
                if (badmintonCourtNewsac[j][i] == 0)
                    System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
        System.out.println("Enter Time slot:");
        int timeSlot = sc.nextInt();
        System.out.println("Enter court number:");
        int courtNumber = sc.nextInt();
        System.out.println("Enter roll number:");
        int rollNumber = sc.nextInt();

        if (timeSlot < 1 || timeSlot > 10 || courtNumber < 1 || courtNumber > 3) {
            System.out.println("Invalid time slot or court number.");
        } else if (badmintonCourtNewsac[courtNumber - 1][timeSlot - 1] != 0) {
            System.out.println("Court already booked for this time slot.");
        } else {
            badmintonCourtOldsac[courtNumber - 1][timeSlot - 1] = rollNumber;
            System.out.println("Booking complete.");
            
        }
        System.out.println("PRESS Y FOR MORE ENTRIES");
    System.out.println("PRESS X FOR RETURN TO MENU");
    System.out.println("PRESS H FOR HOME");
    String c=sc.next();
    if(c.equals("Y"))
    badmintonCourtNewsacslotbooking();
    else if (c.equals("X"))
    badmintonCourtNewsac();
    else if(c.equals("H"))
    games();
    else
    System.out.println("THANK YOU FOR USING THE SYSTEM ");
    }
    void badmintonCourtOldsac(){
        System.out.println("BADMINTON COURT OPTIONS \n 1.SLOT BOOKING \n 2.ENQUIRY ");
        int option = sc.nextInt();
        if(option ==1) 
        badmintonCourtOldsacslotbooking();
        else if (option ==2)
        badmintonCourtOldsacEnquiry();
        else
        System.out.println("Wrong Option selection ");
        return;
        
    }
    void badmintonCourtOldsacEnquiry()
    {
        System.out.println("WELCOME TO ENQUIRY ");
        System.out.println("ENTER THE ROLL NUMBER = ");
        int roll_number =sc.nextInt();
        int time_slots=0;int court_number=0;
        int flag=0;
        for (int i=0;i<10;i++){
            for(int j=0;j<2;j++){
                if(badmintonCourtNewsac[j][i]==roll_number){
                int c1=i/2;flag=1;
                if (i % 2 == 0) {
                System.out.print("TIME SLOT:=" + (5 + c1) + ".00--" + (5 + c1) + ".30\t\t");
                
            } else {
                System.out.print("TIME SLOT:=" + (5 + c1) + ".30--" + (6 + c1) + ".00\t\t");
                
            }
                                }
            }
        
        
        }
        if(flag==0)System.out.println("NO SLOTS BOOKED ");
        System.out.println("PRESS Y FOR MORE ENTRIES");
    System.out.println("PRESS X FOR RETURN TO MENU");
    System.out.println("PRESS H FOR HOME");
    String c=sc.next();
    if(c.equals("Y"))
    badmintonCourtOldsacEnquiry();
    else if (c.equals("X"))
    badmintonCourtOldsac();
    else if(c.equals("H"))
    games();
    else
    System.out.println("THANK YOU FOR USING THE SYSTEM ");
        
    }

    void badmintonCourtOldsacslotbooking() {
        System.out.println("BADMINTON COURT SLOTS");
        System.out.println("TIME                COURTS ");
        int c1 = 0, c2 = 0;
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + 1 + ". " + (5 + c1) + ".00--" + (5 + c1) + ".30\t\t");
                c1++;
            } else {
                System.out.print(i + 1 + ". " + (5 + c2) + ".30--" + (6 + c2) + ".00\t\t");
                c2++;
            }
            for (int j = 0; j < 2; j++) {
                if (badmintonCourtOldsac[j][i] == 0)
                    System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
        System.out.println("Enter Time slot:");
        int timeSlot = sc.nextInt();
        System.out.println("Enter court number:");
        int courtNumber = sc.nextInt();
        System.out.println("Enter roll number:");
        int rollNumber = sc.nextInt();

        if (timeSlot < 1 || timeSlot > 10 || courtNumber < 1 || courtNumber > 3) {
            System.out.println("Invalid time slot or court number.");
        } else if (badmintonCourtOldsac[courtNumber - 1][timeSlot - 1] != 0) {
            System.out.println("Court already booked for this time slot.");
        } else {
            badmintonCourtOldsac[courtNumber - 1][timeSlot - 1] = rollNumber;
            System.out.println("Booking complete.");
            
        }
        System.out.println("PRESS Y FOR MORE ENTRIES");
    System.out.println("PRESS X FOR RETURN TO MENU");
    System.out.println("PRESS H FOR HOME");
    String c=sc.next();
    if(c.equals("Y"))
    badmintonCourtOldsacslotbooking();
    else if (c.equals("X"))
    badmintonCourtOldsac();
    else if(c.equals("H"))
    games();
    else
    System.out.println("THANK YOU FOR USING THE SYSTEM ");    }
    void tenniscourt(){
        System.out.println("TENNIS COURT OPTIONS \n 1.SLOT BOOKING \n 2.ENQUIRY ");
        int option = sc.nextInt();
        if(option ==1) 
        tenniscourtslotbooking();
        else if (option ==2)
        tenniscourtEnquiry();
        else
        System.out.println("Wrong Option selection ");
        return;
        
    }
    void tenniscourtEnquiry()
    {
        System.out.println("WELCOME TO ENQUIRY ");
        System.out.println("ENTER THE ROLL NUMBER = ");
        int roll_number =sc.nextInt();
        int time_slots=0;int court_number=0;
        int flag=0;
        for (int i=0;i<10;i++){
            for(int j=0;j<6;j++){
                if(tenniscourt[j][i]==roll_number){
                int c1=i/2;flag=1;
                if (i % 2 == 0) {
                System.out.print("TIME SLOT:=" + (5 + c1) + ".00--" + (5 + c1) + ".30\t\t");
                
            } else {
                System.out.print("TIME SLOT:=" + (5 + c1) + ".30--" + (6 + c1) + ".00\t\t");
                
            }
                                }
            }
        
        
        }
        if(flag==0)System.out.println("NO SLOTS BOOKED ");
        System.out.println("PRESS Y FOR MORE ENTRIES");
    System.out.println("PRESS X FOR RETURN TO MENU");
    System.out.println("PRESS H FOR HOME");
    String c=sc.next();
    if(c.equals("Y"))
    tenniscourtEnquiry();
    else if (c.equals("X"))
    tenniscourt();
    else if(c.equals("H"))
    games();
    else
    System.out.println("THANK YOU FOR USING THE SYSTEM ");
        
    }

    void tenniscourtslotbooking() {
        System.out.println("TENNIS COURT SLOTS");
        System.out.println("TIME                COURTS ");
        int c1 = 0, c2 = 0;
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + 1 + ". " + (5 + c1) + ".00--" + (5 + c1) + ".30\t\t");
                c1++;
            } else {
                System.out.print(i + 1 + ". " + (5 + c2) + ".30--" + (6 + c2) + ".00\t\t");
                c2++;
            }
            for (int j = 0; j < 6; j++) {
                if (tenniscourt[j][i] == 0)
                    System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
        System.out.println("Enter Time slot:");
        int timeSlot = sc.nextInt();
        System.out.println("Enter court number:");
        int courtNumber = sc.nextInt();
        System.out.println("Enter roll number:");
        int rollNumber = sc.nextInt();

        if (timeSlot < 1 || timeSlot > 10 || courtNumber < 1 || courtNumber > 6) {
            System.out.println("Invalid time slot or court number.");
        } else if (tenniscourt[courtNumber - 1][timeSlot - 1] != 0) {
            System.out.println("Court already booked for this time slot.");
        } else {
            tenniscourt[courtNumber - 1][timeSlot - 1] = rollNumber;
            System.out.println("Booking complete.");
            
        }
        System.out.println("PRESS Y FOR MORE ENTRIES");
    System.out.println("PRESS X FOR RETURN TO MENU");
    System.out.println("PRESS H FOR HOME");
    String c=sc.next();
    if(c.equals("Y"))
    tenniscourtslotbooking();
    else if (c.equals("X"))
    tenniscourt();
    else if(c.equals("H"))
    games();
    else
    System.out.println("THANK YOU FOR USING THE SYSTEM ");
    }
    void gymoldsac() {
        System.out.println("GYM OLDSAC OPTIONS \n 1.SLOT BOOKING \n 2.ENQUIRY ");
        int option = sc.nextInt();
        if (option == 1)
            gymoldsacslotbooking();
        else if (option == 2)
            gymoldsacEnquiry();
        else
            System.out.println("Wrong Option selection ");
    }

     void gymoldsacslotbooking() {
        System.out.println("GYM OLD SAC SLOTS");
        System.out.println("TIME                COURTS ");

        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". " + (i + 1) + ".00--" + (i + 2) + ".00\t\t");

            for (int j = 0; j < 20; j++) {
                if (gymoldsac[j][i] == 0)
                    System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
        System.out.println("Enter Time slot:");
        int timeSlot = sc.nextInt();
        System.out.println("Enter court number:");
        int courtNumber = sc.nextInt();
        System.out.println("Enter roll number:");
        int rollNumber = sc.nextInt();

        if (timeSlot < 1 || timeSlot > 10 || courtNumber < 1 || courtNumber > 20) {
            System.out.println("Invalid time slot or court number.");
        } else if (gymoldsac[courtNumber - 1][timeSlot - 1] != 0) {
            System.out.println("Court already booked for this time slot.");
        } else {
            gymoldsac[courtNumber - 1][timeSlot - 1] = rollNumber;
            System.out.println("Booking complete.");
        }

      System.out.println("PRESS Y FOR MORE ENTRIES");
    System.out.println("PRESS X FOR RETURN TO MENU");
    System.out.println("PRESS H FOR HOME");
    String c=sc.next();
    if(c.equals("Y"))
    gymoldsacslotbooking();
    else if (c.equals("X"))
    gymoldsac();
    else if(c.equals("H"))
    games();
    else
    System.out.println("THANK YOU FOR USING THE SYSTEM ");
    }

     void gymoldsacEnquiry() {
        System.out.println("WELCOME TO ENQUIRY ");
        System.out.println("ENTER THE ROLL NUMBER = ");
        int roll_number = sc.nextInt();
        int time_slots = 0;
        int court_number = 0;
        boolean booked = false;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                if (gymoldsac[j][i] == roll_number) {
                    System.out.println("TIME SLOTS= " + (i + 1) + ".00--" + (i + 2) + ".00");
                    booked = true;
                }
            }
        }

        if (!booked)
            System.out.println("NO SLOTS BOOKED ");

        System.out.println("WANT TO Enquire MORE (Y/N)? ");
        String decision = sc.next();
        if (decision.equalsIgnoreCase("Y")) {
            gymoldsacEnquiry();
        }System.out.println("PRESS Y FOR MORE ENTRIES");
    System.out.println("PRESS X FOR RETURN TO MENU");
    System.out.println("PRESS H FOR HOME");
    String c=sc.next();
    if(c.equals("Y"))
    gymoldsacEnquiry();
    else if (c.equals("X"))
    gymoldsac();
    else if(c.equals("H"))
    games();
    else
    System.out.println("THANK YOU FOR USING THE SYSTEM ");
    }
    void gymnewsac() {
        System.out.println("GYM NEWSAC OPTIONS \n 1.SLOT BOOKING \n 2.ENQUIRY ");
        int option = sc.nextInt();
        if (option == 1)
            gymnewsacslotbooking();
        else if (option == 2)
            gymnewsacEnquiry();
        else
            System.out.println("Wrong Option selection ");
    }

     void gymnewsacslotbooking() {
        System.out.println("GYM NEW SAC SLOTS");
        System.out.println("TIME                COURTS ");

        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". " + (i + 1) + ".00--" + (i + 2) + ".00\t\t");

            for (int j = 0; j < 10; j++) {
                if (gymnewsac[j][i] == 0)
                    System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
        System.out.println("Enter Time slot:");
        int timeSlot = sc.nextInt();
        System.out.println("Enter court number:");
        int courtNumber = sc.nextInt();
        System.out.println("Enter roll number:");
        int rollNumber = sc.nextInt();

        if (timeSlot < 1 || timeSlot > 10 || courtNumber < 1 || courtNumber > 10) {
            System.out.println("Invalid time slot or court number.");
        } else if (gymnewsac[courtNumber - 1][timeSlot - 1] != 0) {
            System.out.println("Court already booked for this time slot.");
        } else {
            gymnewsac[courtNumber - 1][timeSlot - 1] = rollNumber;
            System.out.println("Booking complete.");
        }

        System.out.println("PRESS Y FOR MORE ENTRIES");
    System.out.println("PRESS X FOR RETURN TO MENU");
    System.out.println("PRESS H FOR HOME");
    String c=sc.next();
    if(c.equals("Y"))
    gymnewsacslotbooking();
    else if (c.equals("X"))
    gymnewsac();
    else if(c.equals("H"))
    games();
    else
    System.out.println("THANK YOU FOR USING THE SYSTEM ");
    }

     void gymnewsacEnquiry() {
        System.out.println("WELCOME TO ENQUIRY ");
        System.out.println("ENTER THE ROLL NUMBER = ");
        int roll_number = sc.nextInt();
        int time_slots = 0;
        int court_number = 0;
        boolean booked = false;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (gymnewsac[j][i] == roll_number) {
                    System.out.println("TIME SLOTS= " + (i + 1) + ".00--" + (i + 2) + ".00");
                    booked = true;
                }
            }
        }

        if (!booked)
            System.out.println("NO SLOTS BOOKED ");

        System.out.println("PRESS Y FOR MORE ENTRIES");
    System.out.println("PRESS X FOR RETURN TO MENU");
    System.out.println("PRESS H FOR HOME");
    String c=sc.next();
    if(c.equals("Y"))
    gymnewsacEnquiry();
    else if (c.equals("X"))
    gymnewsac();
    else if(c.equals("H"))
    games();
    else
    System.out.println("THANK YOU FOR USING THE SYSTEM ");
    }
}
    

