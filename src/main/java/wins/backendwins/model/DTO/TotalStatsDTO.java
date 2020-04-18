package wins.backendwins.model.DTO;

import lombok.Builder;

@Builder
public class TotalStatsDTO {

    private double technicality;
    private double stability;
    private double percentageеTricksLearned;

    public TotalStatsDTO() {
        this.technicality = 0;
        this.stability = 0;
        this.percentageеTricksLearned = 0;
    }

    public TotalStatsDTO(double technicality, double stability, double percentageеTricksLearned) {
        this.technicality = technicality;
        this.stability = stability;
        this.percentageеTricksLearned = percentageеTricksLearned;
    }

    public double getTechnicality() {
        return technicality;
    }

    public double getStability() {
        return stability;
    }

    public double getPercentageеTricksLearned() {
        return percentageеTricksLearned;
    }
}
