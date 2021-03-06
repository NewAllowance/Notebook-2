package tsi.java.l1g2.notebook;

public class Reminder extends Note implements Expirable {

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

    @Override
    public boolean contains(String str) {

        String strLower = str.toLowerCase();
        String timeLower = time.toLowerCase();

        if (super.contains(str)) {
            return true;
        } else if (timeLower.contains(str)){
            return  true;
        }

            return false;

    }

    @Override
    public boolean isExpired() {
        return false;
    }
}
