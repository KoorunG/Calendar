package koorung.calendar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calendar {
    public static void main(String[] args) throws IOException {
        System.out.println("일 월 화 수 목 금 토");
        System.out.println("--------------------");
        System.out.println(" 1  2  3  4  5  6  7");
        System.out.println(" 8  9 10 11 12 13 14");
        System.out.println("15 16 17 18 19 20 21");
        System.out.println("22 23 24 25 26 27 28");

        //숫자를 입력 받아 해당하는 달의 최대 일 수를 출력하는 프로그램
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("반복할 횟수를 입력하세요 : ");
        int count = Integer.parseInt(br.readLine());
        String result;
        
        for(int i = 0 ; i < count ; i++){

            System.out.print("달을 입력하세요 : ");
            int month = Integer.parseInt(br.readLine());
        
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
        System.out.println(month+"월의 최대 일 수는 : "+result+"일 입니다.");
            }
        }
        System.out.println("출력 완료");
        br.close();
        
    }
    
}
