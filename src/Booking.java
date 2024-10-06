import java.time.LocalDate;
//vytvorenie triedy a jej atributov:
public class Booking {
    private Guests guests;
    private Rooms rooms;
    private LocalDate start0fReservation;
    private LocalDate endOfReservation;
    private boolean isWorkingStay;
    private boolean isRecreationalStay;

    //vytvorenie metod:
    public LocalDate getStart0fReservation() {
        return start0fReservation;
    }

    public LocalDate getEndOfReservation() {
        return endOfReservation;
    }

    public void setEndOfReservation(LocalDate endOfReservation) {
        this.endOfReservation = endOfReservation;
    }

    public boolean isWorkingStay() {
        return isWorkingStay;
    }

    public void setWorkingStay(boolean workingStay) {
        isWorkingStay = workingStay;
    }

    public boolean isRecreationalStay() {
        return isRecreationalStay;
    }

    public void setRecreationalStay(boolean recreationalStay) {
        isRecreationalStay = recreationalStay;
    }

    public void setStart0fReservation(LocalDate start0fReservation) {
        this.start0fReservation = start0fReservation;

    }

    //vytvorenie konstruktoru_:
    public Booking (String nameAndSurname, int roomNumber, LocalDate start0fReservation, LocalDate endOfReservation

    ){
        this.start0fReservation = start0fReservation;
        this.endOfReservation = endOfReservation;





    }










}
