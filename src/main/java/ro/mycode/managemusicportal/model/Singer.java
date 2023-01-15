package ro.mycode.managemusicportal.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity(name="Singer")
@Table(name="singer")
public class Singer implements Comparable<Singer>{

    @GeneratedValue ( strategy = GenerationType.AUTO)
    @Id

    private int id;
    private int music_id;
    private String name;
    private String mobile;
    private String email;
    private String username;
    private String password;
    private String address;


    @Override
    public String toString() {
        String text = "Name : " + this.name + "\n";
        text += "Mobile : " + this.mobile + "\n";
        text += "Email : " + this.email + "\n";
        text += "Username : " + this.username + "\n";
        text += "Address : " + this.address + "\n";
        return text;
    }

    @Override
    public boolean equals(Object o) {
        Singer x = (Singer) o;
        return this.music_id == x.getMusic_id();
    }


    @Override
    public int compareTo(Singer o) {
        if (this.id > o.getId()) {
            return 1;
        } else if (this.id < o.getId()) {
            return -1;
        } else {
            return 0;
        }
    }
}
