import java.util.*;
import java.time.*;

class Event {
    String name;
    LocalDate date;

    Event(String name, LocalDate date) {
        this.name = name;
        this.date = date;
    }
}

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Event> events = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String dateStr = sc.next();
            LocalDate date = LocalDate.parse(dateStr);
            events.add(new Event(name, date));
        }

        // Read month
        int month = sc.nextInt();

        List<Event> sortedEvents =
                events.stream()
                      .sorted(Comparator.comparing(e -> e.date))
                      .toList();

        sortedEvents.stream()
                    .map(e -> e.name)
                    .forEach(name -> System.out.print(name + " "));
        System.out.println();

        Event earliest =
                events.stream()
                      .min(Comparator.comparing(e -> e.date))
                      .get();
        System.out.println(earliest.name);

        Event latest =
                events.stream()
                      .max(Comparator.comparing(e -> e.date))
                      .get();
        System.out.println(latest.name);

        sortedEvents.stream()
                    .filter(e -> e.date.getMonthValue() == month)
                    .map(e -> e.name)
                    .forEach(name -> System.out.print(name + " "));

        sc.close();
    }
}

