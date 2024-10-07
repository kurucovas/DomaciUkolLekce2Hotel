import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {public static void main (String [] args) {
    Guests guestA = new Guests("Adela Malikova",LocalDate.of(1993,3,13));
    Guests guestB = new Guests("Jan Dvoracek",LocalDate.of(1995, 5, 5));
    Rooms room1 = new Rooms(1, 1, true, true, 1000);
    Rooms room2 = new Rooms(2, 1, true, true, 1000);
    Rooms room3 = new Rooms (3, 3, false, true, 2400);
    System.out.println(guestA.getNameAndSurname() +
    (" ")+("(")+(guestA.getBirthdate() + (")")));
    System.out.println(guestB.getNameAndSurname() + (" ") + ("(") + (guestB.getBirthdate()+(")")) );
    System.out.println(("Room number:") + room1.getRoomNumber() + (",") + ("number of beds:") + room1.getNumberOfBeds() + (",")  + ("with balcony:")+ room1.isHasBalcony()
            +(",") + ("with sea view:") + room1.isHasSeaView()+ (",") +room1.getRoomPriceFor1Night() + (" CZK/night"));
    System.out.println(("Room number:") + room2.getRoomNumber() + (",") + ("number of beds:") + room2.getNumberOfBeds() + (",")  + ("with balcony:")+ room2.isHasBalcony()
            +(",") + ("with sea view:") + room2.isHasSeaView()+ (",") +room2.getRoomPriceFor1Night() + (" CZK/night"));
    System.out.println(("Room number:") + room3.getRoomNumber() + (",") + ("number of beds:") + room3.getNumberOfBeds() + (",")  + ("with balcony:")+ room3.isHasBalcony()
            +(",") + ("with sea view:") + room3.isHasSeaView()+ (",") +room3.getRoomPriceFor1Night() + (" CZK/night"));
    Booking reservation1 = new Booking("Adela Novakova", 1, LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26));
    Booking reservation2 = new Booking("Jan Dvoracek", 3, LocalDate.of(2021, 9, 1), LocalDate.of(2021,9, 14));
    Booking reservation3 = new Booking("Adela Novakova", 3, LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14));
    List <Booking> reservationList = new ArrayList<>();
    reservationList.add(reservation1);
    reservationList.add(reservation2);
    reservationList.add(reservation3);
    //cycle1___:
    for (Booking allReservation : reservationList){System.out.println(allReservation.getStart0fReservation());}










    


}
}
