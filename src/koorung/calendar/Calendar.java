package koorung.calendar;

public class Calendar {

    public boolean isLeapYear(int year){

        if(year%4 == 0 && (year%100 != 0 || year%400 ==0 )){
            return true;
        } else {
            return false;   
        }
    }

    public int getMaxDaysOfMonth(int year, int month) {
        if(isLeapYear(year)){
            return Constants.LEAP_MAX_DAYS[month -1];
        } else {
            return Constants.MAX_DAYS[month -1];
        }
    }
    public void printCalendar(int year, int month){

        int maxDay = getMaxDaysOfMonth(year, month);

        switch(month){
            case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :

            System.out.printf("   <<%4d년 %3d월>>\n",year,month);
            System.out.println(" 일 월 화 수 목 금 토");
            System.out.println("--------------------");

            for(int i = 1 ; i <= maxDay ; i++){
                System.out.printf("%3d",i);
                if ( i%7 == 0 ){
                    System.out.println();
                }
            }
            
            // System.out.println("             1  2  3");
            // System.out.println(" 4  5  6  7  8  9 10");
            // System.out.println("11 12 13 14 15 16 17");
            // System.out.println("18 19 20 21 22 23 24");
            // System.out.println("25 26 27 28 29 30 31");
            break;

            case 4 : case 6 : case 9 : case 11 : 

            System.out.printf("   <<%4d년 %3d월>>\n",year,month);
            System.out.println(" 일 월 화 수 목 금 토");
            System.out.println("--------------------");
            for(int i = 1 ; i <= maxDay ; i++){
                System.out.printf("%3d",i);
                if ( i%7 == 0 ){
                    System.out.println();
                }
            }
            // System.out.println("       1  2  3  4  5");
            // System.out.println(" 6  7  8  9 10 11 12");
            // System.out.println("13 14 15 16 17 18 19");
            // System.out.println("20 21 22 23 24 25 26");
            // System.out.println("27 28 29 30         ");
            break;
            default : 

            System.out.printf("   <<%4d년 %3d월>>\n",year,month);
            System.out.println(" 일 월 화 수 목 금 토");
            System.out.println("--------------------");
            for(int i = 1 ; i <= maxDay ; i++){
                System.out.printf("%3d",i);
                if ( i%7 == 0 ){
                    System.out.println();
                }
            }
            // System.out.println("             1  2  3");
            // System.out.println(" 4  5  6  7  8  9 10");
            // System.out.println("11 12 13 14 15 16 17");
            // System.out.println("18 19 20 21 22 23 24");
            // System.out.println("25 26 27 28         ");
            
        }
    }
}
