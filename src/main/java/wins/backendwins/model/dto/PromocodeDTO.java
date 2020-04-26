package wins.backendwins.model.dto;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Builder
public class PromocodeDTO {

    private String promocode;

    private String trickName;
    private String boardshop;
    private int startDate;
    private int endDate;

    public PromocodeDTO() {
        this.promocode = "000000";
        this.trickName = "";
        this.boardshop = "XerTebyaZnaet";
        this.startDate = 11111111;
        this.endDate = 22222222;
    }

    public PromocodeDTO(String promocode, String trickName, String boardshop, int startDate, int endDate) {
        this.promocode = promocode;
        this.trickName = trickName;
        this.boardshop = boardshop;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
