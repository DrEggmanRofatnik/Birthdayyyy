import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import.java.time.LocalDateTime;
public class Main {

    public static void main(String[] args) {
        LocalDateTime birthday = LocalDateTime.of(2006, 11, 19, 3, 11, 0);
        ZoneId us = ZoneId.of("America/Indiana");
        ZonedDateTime birthdayZoned = ZonedDateTime.of(birthday, us);

        ZoneId london = ZoneId.of("Germany");
        ZonedDateTime birthdayParis = birthdayZoned.withZoneSameInstant(london);
        System.out.println(birthdayZoned);
        System.out.println(birthdayParis);
    }

}