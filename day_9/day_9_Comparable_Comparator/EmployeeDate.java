//Sort Employee objects by joining date using Comparator.
//Use Comparator to sort employees based on LocalDate or Date.

package day_9_Comparable_Comparator;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmployeeDate {
    String name;
    LocalDate joiningDate;

    EmployeeDate(String name, LocalDate joiningDate) {
        this.name = name; this.joiningDate = joiningDate;
    }

    public String toString() {
        return name + " - " + joiningDate;
    }

    public static void main(String[] args) {
        List<EmployeeDate> list = Arrays.asList(
            new EmployeeDate("Asha", LocalDate.of(2020, 5, 15)),
            new EmployeeDate("Ravi", LocalDate.of(2019, 8, 10)),
            new EmployeeDate("Kiran", LocalDate.of(2021, 1, 5))
        );

        list.sort(Comparator.comparing(e -> e.joiningDate));

        System.out.println("Sorted by Joining Date:");
        list.forEach(System.out::println);
    }
}

//Sorted by Joining Date:
//Ravi - 2019-08-10
//Asha - 2020-05-15
//Kiran - 2021-01-05