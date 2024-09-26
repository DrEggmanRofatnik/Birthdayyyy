import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import.java.time.LocalDateTime;
public class Main {

    public static void main(String[] args) {

        LocalDateTime birthday = LocalDateTime.of(2006, 11, 19);
        ZoneId us = ZoneId.of("America/New_York");
        ZonedDateTime birthdayZoned = ZonedDateTime.of(birthday, us);

        ZoneId london = ZoneId.of("Europe/London");
        ZonedDateTime birthdayGermany = birthdayZoned.withZoneSameInstant(london);
        System.out.println(birthdayZoned);
        System.out.print(birthdayGermany);
    }
}
    }
}
