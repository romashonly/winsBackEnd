package wins.backendwins.model.dto;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Builder
public class TrickDTO {

    @Id
    private String id;

    private String name;
    private double complexity;
    private int stability;
    private int tries;

    public TrickDTO() {
        this.name = "Ollie";
        this.complexity = 0;
        this.stability = 0;
        this.tries = 0;
    }

    public TrickDTO(String id, String name, double complexity, int stability, int tries) {
        this.id = id;
        this.name = name;
        this.complexity = complexity;
        this.stability = stability;
        this.tries = tries;
    }
}
