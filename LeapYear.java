package ClassProblem;

public class LeapYear {
    String checkLeapYear(int year) {

        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            return "leap Year";
        } else {
            return "Not Leap Year";
        }
    }

    public static void main(String[] args) {
        LeapYear leapYearObj = new LeapYear();
        System.out.println(leapYearObj.checkLeapYear(2000));

    }
}
