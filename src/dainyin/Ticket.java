package dainyin;

public class Ticket {
    private String movieName;
    private String showTime;
    private String room;
    private String seatNo;

    public Ticket() {
    }

    public Ticket(String movieName, String showTime, String room, String seatNo) {
        this.movieName = movieName;
        this.showTime = showTime;
        this.room = room;
        this.seatNo = seatNo;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }
}
