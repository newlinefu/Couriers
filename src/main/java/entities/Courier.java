package entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "COURIER")
@Data
public class Courier {

    @Id
    @Column(name = "COURIER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courierId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_country")
    private Branch location;

    public Long getCourierId() {
        return courierId;
    }

    public Branch getLocation() {
        return location;
    }

    public void setLocation(Branch location) {
        this.location = location;
    }
}
