//vytvorenie triedy a jej atributov__:
public class Rooms {
    private int roomNumber;
    private int numberOfBeds;
    private boolean hasBalcony;
    private boolean hasSeaView;
    private int roomPriceFor1Night;

    //vytvorenie konstruktoru:
    public Rooms (int roomNumber, int numberOfBeds, boolean hasBalcony, boolean hasSeaView, int roomPriceFor1Night
    )
    {this.roomNumber = roomNumber;
    this.numberOfBeds = numberOfBeds;
    this.hasBalcony = hasBalcony;
    this.hasSeaView = hasSeaView;
    this.roomPriceFor1Night = roomPriceFor1Night;
    }
    //vytvorenie metod:
    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isHasBalcony() {
        return hasBalcony;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    public boolean isHasSeaView() {
        return hasSeaView;
    }

    public void setHasSeaView(boolean hasSeaView) {
        this.hasSeaView = hasSeaView;
    }

    public int getRoomPriceFor1Night() {
        return roomPriceFor1Night;
    }

    public void setRoomPriceFor1Night(int roomPriceFor1Night) {
        this.roomPriceFor1Night = roomPriceFor1Night;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;

    }

}
