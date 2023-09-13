package bai_tap_hoc_lai.ss08_clean_code;

public class CleanCode {
    public int sum(int num1,int num2,int num3){
        int sum=num1+num2+num3;
        return sum;}

    private void employeeDetails(String name, String age, String awards, String ctc, String experience) {
        // Do something
    }

    public boolean is_leap_year(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public int getDayOfMonth(int month, int year) {
        switch (month) {
            case 1:
                return 31;
            case 3:
                return 31;
            case 5:
                return 31;
            case 7:
                return 31;
            case 8:
                return 31;
            case 10:
                return 31;
            case 12:
                return 31;
            case 4:
                return 30;
            case 6:
                return 30;
            case 9:
                return 30;
            case 11:
                return 30;
            case 2:
                return is_leap_year(year) ? 29 : 28;
            default:
                return -1;
        }
    }

    public static class Test {
        public static void main(String[] args) {

        }
    }
}
