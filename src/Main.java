import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
//        boolean[][] schedule = new boolean [8][60];
//        AppointmentBook a = new AppointmentBook(schedule);
//        for(int i = 10; i < 15; i++) schedule[1][i] = true;
//        for(int i = 30; i < 45; i++) schedule[1][i] = true;
//        for(int i = 50; i < 60; i++) schedule[1][i] = true;
//////        a.printPeriod(2);
//        schedule = new boolean[8][60];
//        for(int i = 25; i < 30; i++) schedule[1][i] = true;
//        for(int i = 0; i < 15; i++) schedule[2][i] = true;
//        for(int i = 41; i < 60; i++) schedule[2][i] = true;
//        for(int i = 5; i < 30; i++) schedule[3][i] = true;
////        for(int i = 44; i < 60; i++) schedule[3][i] = true;
////        AppointmentBook b = new AppointmentBook(schedule);
////        int period = 2;
////        while(period < 5){
////            System.out.println("Period: " + period);
////            b.printPeriod(period);
////            period++;
////        }
////        b.printPeriod(4);
//        System.out.println(a.findFreeBlock(2,15));
//        System.out.println(a.findFreeBlock(2,9));
//        System.out.println(a.findFreeBlock(2,20));
//        System.out.println(b.makeAppointment(2,4, 22));
//        b.printPeriod(4);
//        System.out.println(b.makeAppointment(3,4, 3));
//        b.printPeriod(3);
//        System.out.println(b.makeAppointment(2,4, 30));
////        b.printPeriod(3);

    }
    public static int read() throws FileNotFoundException {
        File f = new File ("Schedules.txt");
        Scanner s = new Scanner(f);
        AppointmentBook a = new AppointmentBook()
        int fufilledRequests;
        while(s.hasNextLine()){
            boolean[] timeAvailable = new boolean[60];
            /**
             Set the Boolean array to the period and then traverse the period to see if that request(eigth line)
             can be fufilled, if so, fufilledRequest++ **/
            if ()
        }
    }
}
