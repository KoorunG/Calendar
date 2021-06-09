package koorung.calendar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calendar {

    public void printSampleCalendar(){
        System.out.println("일 월 화 수 목 금 토");
        System.out.println("--------------------");
        System.out.println(" 1  2  3  4  5  6  7");
        System.out.println(" 8  9 10 11 12 13 14");
        System.out.println("15 16 17 18 19 20 21");
        System.out.println("22 23 24 25 26 27 28");
    }

    public void printCalendar(int month){

        switch(month){
            case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :

            System.out.println("일 월 화 수 목 금 토");
            System.out.println("--------------------");
            System.out.println("             1  2  3");
            System.out.println(" 4  5  6  7  8  9 10");
            System.out.println("11 12 13 14 15 16 17");
            System.out.println("18 19 20 21 22 23 24");
            System.out.println("25 26 27 28 29 30 31");
            break;

            case 4 : case 6 : case 9 : case 11 : 

            System.out.println("일 월 화 수 목 금 토");
            System.out.println("--------------------");
            System.out.println("       1  2  3  4  5");
            System.out.println(" 6  7  8  9 10 11 12");
            System.out.println("13 14 15 16 17 18 19");
            System.out.println("20 21 22 23 24 25 26");
            System.out.println("27 28 29 30         ");
            break;
            default : 

            System.out.println("일 월 화 수 목 금 토");
            System.out.println("--------------------");
            System.out.println("             1  2  3");
            System.out.println(" 4  5  6  7  8  9 10");
            System.out.println("11 12 13 14 15 16 17");
            System.out.println("18 19 20 21 22 23 24");
            System.out.println("25 26 27 28         ");
            
        }
    }
    public static void main(String[] args) throws IOException {
        
        Calendar calendar = new Calendar();
        //숫자를 입력 받아 해당하는 달의 최대 일 수를 출력하는 프로그램
        String PROMPT="cal> ";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result;
        int month = 0;
        
        while (true){                                                       // 무한루프를 걸고

            System.out.println("달을 입력하세요 : ");
            System.out.print(PROMPT);
            month = Integer.parseInt(br.readLine());
            if (month == -1){                                               // month = -1이면 빠져나오는 조건을 걸었다
                break;
            }
        if (month < 1 || month > 12){
            System.out.println("유효하지 않은 달 입니다.");
        } 
        else {
        switch(month){
            case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : result = "31";
            break;
    
            case 4 : case 6 : case 9 : case 11 : result = "30";
            break;

            default : result ="28";
                        }
                        calendar.printCalendar(month);
                        System.out.println();
                        System.out.println(" =============================================== ");
                        System.out.println(month+"월의 최대 일 수는 : "+result+"일 입니다.");
            }
        }
        System.out.println("출력 완료");
        br.close();
        
    }
    
}
