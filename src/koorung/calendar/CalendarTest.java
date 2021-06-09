package koorung.calendar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalendarTest {


    public static void main(String[] args) throws IOException {
        
        Prompt prompt = new Prompt();
        Calendar cal = new Calendar();
        //숫자를 입력 받아 해당하는 달의 최대 일 수를 출력하는 프로그램
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int month = 0;
        int year = 0;
        
        while (true){                                                       // 무한루프를 걸고

            System.out.println("년도를 입력하세요 : ");
            prompt.runPromptYear();
            year = Integer.parseInt(br.readLine());
            if (year == -1 ){
                break;
            }

            System.out.println("달을 입력하세요 : ");
            prompt.runPromptCal();
            month = Integer.parseInt(br.readLine());
            if (month == -1){                                               // month = -1이면 빠져나오는 조건을 걸었다
                break;
            }
        if (month < 1 || month > 12){
            System.out.println("유효하지 않은 달 입니다.");
        } 
        else {
        switch(month){
            case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : cal.getMaxDaysOfMonth(year, month);
            break;
    
            case 4 : case 6 : case 9 : case 11 : cal.getMaxDaysOfMonth(year, month);
            break;

            default : cal.getMaxDaysOfMonth(year, month);
                        }
                        cal.printCalendar(year,month);
                        System.out.println();
                        System.out.println(" =============================================== ");
                        System.out.println(month+"월의 최대 일 수는 : "+cal.getMaxDaysOfMonth(year, month)+"일 입니다.");
            }
        }
        System.out.println("출력 완료");
        br.close();
        
    }
    
}
