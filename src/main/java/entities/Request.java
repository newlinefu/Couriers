package entities;

import java.sql.Date;
import java.util.UUID;

public class Request {

    private UUID requestId;
    private Branch startedBranch;
    private Branch targetBranch;
    private Message message;
    private int urgency;
    private Courier courier;
    private Date startTime;
    private Date endTime;

    public Request(Branch startedBranch, Branch targetBranch, Message message, int urgency, Courier courier, Date startTime, Date endTime) {
        this.startedBranch = startedBranch;
        this.targetBranch = targetBranch;
        this.message = message;
        this.urgency = urgency;
        this.courier = courier;
        this.startTime = startTime;
        this.endTime = endTime;

        requestId = UUID.randomUUID();
    }

    public UUID getRequestId() {
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
