public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        int dailyHours = 6;
        // The semester is 17 weeks long
        int numberOfWeeks= 17;
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        double codingPerSemester = dailyHours * 5 * numberOfWeeks;
        System.out.println(codingPerSemester);
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        int weeklyWorkHours = 52;
        double codingPercentage = (codingPerSemester / (weeklyWorkHours * numberOfWeeks)) * 100;
        System.out.println(codingPercentage);
    }
}