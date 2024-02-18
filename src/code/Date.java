/**
 * Stores the dates, that will be used by the calendar.
 * @author Prince Lesapo
 * @version 1.0
 */
class Date {
    private final int year;
    private final int day;
    private final String month;

    /**
     * Creates a new Date object with the specified year, day, and month.
     *
     * @param year the year of the date (e.g., 2024)
     * @param day the day of the month of the date (e.g., 15)
     * @param month the month of the date as a string (e.g., "April")
     */
    Date(final int year,
         final int day,
         final String month)
    {
        this.year = year;
        this.day = day;
        this.month = month;
    }

    /**
     * Returns the full date string in the format "Month Day, Year".
     * @return the full date string (e.g., "April 15, 2024")
     */
    public String getDate()
    {
        return month + " " + day + ", " + year;
    }

    /**
     * Returns the year of the date.
     * @return the year of the date (e.g., 2024)
     */
    public int getYear() {
        return year;
    }

    /**
     * Returns the day of the month of the date.
     * @return the day of the month of the date (e.g., 15)
     */
    public int getDay() {
        return day;
    }

    /**
     * Returns the month of the date as a string.
     * @return the month of the date as a string (e.g., "April")
     */
    public String getMonth() {
        return month;
    }
}
