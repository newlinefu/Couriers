package entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "BRANCH")
@Data
public class Branch {

    @Id
    @Column(name = "BRANCH_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long branchId;

    @Column(name = "BRANCH_NAME")
    private String name;

    public Long getBranchId() {
        return branchId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
