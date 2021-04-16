package entities;

import java.util.UUID;

public class Courier {

    private UUID courierId;
    private Branch location;

    public Courier(Branch location) {
        this.location = location;

        this.courierId = UUID.randomUUID();
    }

    public UUID getCourierId() {
        return courierId;
    }

    public Branch getLocation() {
        return location;
    }

    public void setLocation(Branch location) {
        this.location = location;
    }
}
