package tsi.java.l1g2.notebook;

import asg.cliche.Command;

import java.util.ArrayList;
import java.util.List;

public class Notebook {
    private final List<Record> records = new ArrayList<>();

    @Command
    public void createPerson(String firstName, String lastName, String email, String... phones) {
        Person r = new Person();
        r.setFirstName(firstName);
        r.setLastName(lastName);
        r.addPhones(phones);
        r.setEmail(email);
        records.add(r);
    }

    @Command
    public void createNote(String text) {
        Note n = new Note();
        n.setText(text);
        records.add(n);
    }

    @Command
    public void createReminder(String time, String text) {
        Reminder t = new Reminder();
        t.setText(text);
        t.setTime(time);
        records.add(t);
    }

    @Command
    public void createAlarm(String alarm, String text) {
        Alarm g = new Alarm();
        g.setText(text);
        g.setAlarm(alarm);
        records.add(g);
    }


    @Command
    public void remove(int id) {
        for (int i = 0; i < records.size(); i++) {
            Record r = records.get(i);
            if (r.getId() == id) {
                records.remove(i);
                break;
            }
        }
    }

    @Command
    public List<Record> list() {
        return records;
    }

}

