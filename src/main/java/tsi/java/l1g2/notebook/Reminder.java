package tsi.java.l1g2.notebook;

public class Reminder extends Note {

     private String time;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Time{" +
                "id=" + getId() +
                "time='" + time + '\'' +
                "text='" + getText() + '\'' +
                '}';
    }
}
