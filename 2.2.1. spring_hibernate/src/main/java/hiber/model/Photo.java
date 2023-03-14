package hiber.model;

import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
@Table(name = "photos")
public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "description")
    private String desc;
    //private User user;


    public Long getId() {return id;}
    @Nullable
    public String getDesc() {return desc;}
    public void setDesc(String desc) {this.desc = desc;}

    public Photo(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "id=" + id +
                ", desc='" + desc + '\'' +
                '}';
    }

    public Photo() {}
}
