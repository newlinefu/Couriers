package dto;

import entities.Branch;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PathDto {

    private Long pathId;

    private Branch branchOne;

    private Branch branchTwo;

    private int range;
}
