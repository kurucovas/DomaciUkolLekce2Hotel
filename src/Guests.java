import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;

//vytvorenie triedy a jej atributov:
public class Guests {
    private String nameAndSurname;
    private LocalDate birthdate;
    private Booking booking;

    //vytvorenie konstruktoru:
    public Guests(String nameAndSurname, LocalDate birthdate) {
        this.nameAndSurname = nameAndSurname;
        this.birthdate = birthdate;

        //vytvorenie pristupovych metod__:

    }

    public String getNameAndSurname() {
        return nameAndSurname;
    }

    public void setNameAndSurname(String nameAndSurname) {
        this.nameAndSurname = nameAndSurname;

    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }
}



