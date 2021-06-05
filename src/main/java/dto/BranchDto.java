package dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BranchDto {

    private Long branchId;

    private String name;
}
