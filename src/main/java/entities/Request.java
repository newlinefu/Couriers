package entities;

import javax.persistence.*;
import java.sql.Date;

public class Request {

    @Id
    @Column(name = "REQUEST_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long requestId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "STARTED_BRANCH")
    private Branch startedBranch;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TARGET_BRANCH")
    private Branch targetBranch;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FK_MESSAGE")
    private Message message;

    @Column(name = "URGENCY")
    private int urgency;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FK_COURIER")
    private Courier courier;

    @Column(name = "START_TIME")
    private Date startTime;

    @Column(name = "END_TIME")
    private Date endTime;

    public Long getRequestId() {
        return requestId;
    }

    public Branch getStartedBranch() {
        return startedBranch;
    }

    public void setStartedBranch(Branch startedBranch) {
        this.startedBranch = startedBranch;
    }

    public Branch getTargetBranch() {
        return targetBranch;
    }

    public void setTargetBranch(Branch targetBranch) {
        this.targetBranch = targetBranch;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public int getUrgency() {
        return urgency;
    }

    public void setUrgency(int urgency) {
        this.urgency = urgency;
    }

    public Courier getCourier() {
        return courier;
    }

    public void setCourier(Courier courier) {
        this.courier = courier;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public int getActualLeadTime() {
        if (startTime == null || endTime == null) {
            return 0;
        }
        return (int)((endTime.getTime() - startTime.getTime()) / 1000 / 60);
    }
}
