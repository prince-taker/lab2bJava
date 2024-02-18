import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

/**
 * Represents a calendar spanning the years 1910 to 2025, inclusive.
 * It stores and provides access to individual dates within this range.
 * @author Prince Lesapo
 * @version 1.0
 */


class Calendar
{
    public final List<Integer> years;
    public final String[] months;
    public final List<Integer>days;
    public Map<Integer, Date> dates;

    /**
     * Creates a calendar object with years range from 1910 to 2025, months, and days.
     * All dates are added to the `dates` map with a unique date number as the key.
     */
    Calendar()
    {
        Date date;
        int dateNumber;

        dates =     new HashMap<>();
        months =    new String[]{"January", "February", "March", "April", "May", "June", "July", "August",
                                "September", "October", "November", "December"};
        days =      new ArrayList<>();

        dateNumber = 1;

        // Populates the years.
        years = new ArrayList<>();
        for(int i = 1910; i <= 2025; i++)
        {
            years.add(i);
        }

        // Populates the days.
        for(int k = 1; k <= 30; k++)
        {
            days.add(k);
        }

        for(Integer year: years)
        {
            for(int j = 0; j < 12; j++)
            {
                String currentMonth = months[j];

                Iterator<Integer>it;
                it = days.iterator();

                while(it.hasNext())
                {
                    int day;
                    day = it.next();

                    date = new Date(year, day, currentMonth);
                    dates.put(dateNumber, date);
                    dateNumber++;
                }
            }
        }
    }

    /**
     * Prints all dates in the calendar with their corresponding date number.
     */
    public void printCalendar()
    {
        Set<Integer>currentCalendarDate;
        currentCalendarDate = dates.keySet();

        for(Integer dateNumber: currentCalendarDate)
        {
            System.out.printf("%d: %s\n", dateNumber, dates.get(dateNumber).getDate());
        }
    }
}
