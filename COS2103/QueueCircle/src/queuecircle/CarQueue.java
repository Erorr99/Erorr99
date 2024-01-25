package queuecircle;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class CarQueue {

    int id;
    Car car;
    LocalDateTime createAt;

    CarQueue() {
    }

    CarQueue(int i, Car c) {
        id = i;
        car = c;
        createAt=LocalDateTime.now();

    }
    CarQueue(int i, Car c, LocalDateTime d) {
        id = i;
        car = c;
        createAt=d;

    }

    String dt() {
        String fmt = createAt.format(DateTimeFormatter.ofPattern("HH:mm d/M/y"));
        return fmt;
    }

}
