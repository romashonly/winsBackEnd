package wins.backendwins.model.DTO;

import lombok.Builder;

@Builder
public class TrickDTO {

    private String name;
    private double difficults;
    private int stabuluty;
    private int tries;

    public TrickDTO() {
        this.name = "Ollie";
        this.difficults = 0;
        this.stabuluty = 0;
        this.tries = 0;
    }

    public TrickDTO(String name, double difficults, int stabuluty, int tries) {
        this.name = name;
        this.difficults = difficults;
        this.stabuluty = stabuluty;
        this.tries = tries;
    }

    public String getName() {
        return name;
    }

    public double getDifficults() {
        return difficults;
    }

    public int getStabuluty() {
        return stabuluty;
    }

    public int getTries() {
        return tries;
    }
}
