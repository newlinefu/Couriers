package dto;

import entities.Branch;
import entities.Courier;
import entities.Message;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestDto {
    private Long requestId;

    private Branch startedBranch;

    private Branch targetBranch;

    private Message message;

    private int urgency;

    private Courier courier;

    private Date startTime;

    private Date endTime;
}
