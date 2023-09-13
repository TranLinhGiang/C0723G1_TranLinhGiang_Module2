package bai_tap_hoc_lai.ss08_clean_code;

public class CleanCode {
    public static void main(String[] args) {
    }
    public int sum(int num1,int num2,int num3){
        int sum=num1+num2+num3;
        return sum;}

    private void employeeDetails(String name, String age, String awards, String ctc, String experience) {
    }
    public boolean is_leap_year(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public int getDayOfMonth(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang co 31 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Thang co 30 ngay");
                break;
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                    System.out.println("La nam nhuan, co 29 ngay");
                }else {
                    System.out.println("La nam khong nhuan, cos 28 ngay");
                }
                return is_leap_year(year) ? 29 : 28;
            default:
                return -1;
        }
        return month;
    }
}
