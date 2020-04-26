package wins.backendwins.model.dto;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Builder
public class TotalStatsDTO {

    @Id
    private String id;

    private double technicality;
    private double stability;
    private double percentageTricksLearned;
}
