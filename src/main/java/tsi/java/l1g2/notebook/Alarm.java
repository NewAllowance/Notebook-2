package tsi.java.l1g2.notebook;

public class Alarm extends Note implements Expirable {


    private String alarm;

    public String getAlarm() {
        return alarm;
    }

    public void setAlarm(String alarm) {
        this.alarm = alarm;
    }

    @Override
    public String toString() {
        return "Alarm{" +
                "id=" + getId() +
                "alarm='" + alarm + '\'' +
                "text='" + getText() + '\'' +
                '}';
    }

    @Override
    public boolean contains(String str) {

        String strLower = str.toLowerCase();
        String alarmLower = alarm.toLowerCase();

        if (super.contains(str)) {
            return true;
        } else if (alarmLower.contains(str)){
            return  true;
        }
            return false;
    }

    @Override
    public boolean isExpired() {
        return false;
    }
}
