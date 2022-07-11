package ro.fasttrackit.ex1;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import ro.fasttrackit.ex2.Person;
import ro.fasttrackit.ex2.PersonService;

import java.util.List;
import java.util.Map;

public class PersonsTestPersonsByAge {

    @Test

    public void testSinglePersonWithCerteinAge() {
        Map<String, Integer> grouping = PersonService.groupByAge(
                List.of(new Person("Andre", "Pop", 24, "Cluj"))
        );

        Assertions.assertEquals(Map.of("Andre", 24), grouping);
    }

    @Test
    public void testMultiplePersonswithDifferentAge() {
        Map<String, Integer> grouping = PersonService.groupByAge(
                List.of(new Person("Andre", "Pop", 24, "Cluj"),
                        new Person("Marius", "Popescu", 29, "Bucuresti"))
        );

        Assertions.assertEquals(Map.of("Andre", 24,"Marius",29), grouping);


    }
@Test
    public void testMultiplePersonsWithSameAge() {
        Map<String, Integer> grouping = PersonService.groupByAge(
                List.of(new Person("Andre", "Pop", 24, "Cluj"),
                        new Person("Marius", "Popescu", 24, "Bucuresti"))
        );

        Assertions.assertEquals(Map.of("Andre", 24,"Marius",24), grouping);

    }
}
