package dto;

import entities.Branch;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CourierDto {

    private Long courierId;

    private Branch location;
}
