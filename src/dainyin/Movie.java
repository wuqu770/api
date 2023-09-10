package dainyin;

public class Movie {
    private String movie;
    private  String director;//导演
    private   String actor;//演员
    private  String movieType;//电影类型
    private  int price;//价格
    private String showTime;//
    private  String room;//放映厅
    private String roomType;

    public Movie() {
    }

    public Movie(String movie, String director, String actor, String movieType, int price, String showTime, String room, String roomType) {
        this.movie = movie;
        this.director = director;
        this.actor = actor;
        this.movieType = movieType;
        this.price = price;
        this.showTime = showTime;
        this.room = room;
        this.roomType = roomType;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getMovieType() {
        return movieType;
    }

    public void setMovieType(String movieType) {
        this.movieType = movieType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movie='" + movie + '\'' +
                ", director='" + director + '\'' +
                ", actor='" + actor + '\'' +
                ", movieType='" + movieType + '\'' +
                ", price=" + price +
                ", showTime='" + showTime + '\'' +
                ", room='" + room + '\'' +
                ", roomType='" + roomType + '\'' +
                '}';
    }
}
