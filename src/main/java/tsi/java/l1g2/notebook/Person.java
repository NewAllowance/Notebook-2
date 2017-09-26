package tsi.java.l1g2.notebook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person extends Record {
    private String firstName;
    private String lastName;
    private String email;
    private List<String> phones = new ArrayList<>();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void addPhones(String... phones) {
        Collections.addAll(this.phones, phones);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    @Override
    public String toString() {
        return "Person{" +
                "id=" + getId() +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phones=" + phones +
                '}';
    }


    @Override
    public boolean contains(String str) {

        String strLower = str.toLowerCase();
        String firstNameLower = firstName.toLowerCase();
        String lastNameLower = lastName.toLowerCase();
        String emailLower = email.toLowerCase();


        if (lastName.contains(strLower)) {
            return true;
        } else if (firstNameLower.contains(strLower)) {
            return true;
        } else if (emailLower.contains(strLower)) {
            return true;
        } else if (lastNameLower.contains(strLower)) {
            return true;
        } else {
            for (String p : phones) {  //p = stroka
              if (p.toLowerCase().contains(strLower)) {
                  return true;
              }
            }
        }

        return false;
    }
}
