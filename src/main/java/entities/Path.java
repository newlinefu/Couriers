package entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "MESSAGE")
@Data
public class Path {

    @Id
    @Column(name = "PATH_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pathId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FK_BRANCH_ONE")
    private Branch branchOne;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FK_BRANCH_TWO")
    private Branch branchTwo;

    @Column(name = "RANGE")
    private int range;

    public Long getPathId() {
        return pathId;
    }

    public Branch getBranchOne() {
        return branchOne;
    }

    public Branch getBranchTwo() {
        return branchTwo;
    }

    public int getRange() {
        return range;
    }
}
