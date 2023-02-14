package hms;
public class Room {
    private int roomNo;
    private String location;

    public Room(int roomNo, String location) {
        this.roomNo = roomNo;
        this.location = location;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}