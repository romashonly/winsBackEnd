package wins.backendwins.model.DTO;

import lombok.Builder;

@Builder
public class PromocodeDTO {

    private String promocode;
    private TrickDTO trick;
    private String boardshop;
    private int startDate;
    private int endDate;

    public PromocodeDTO() {
        this.promocode = "000000";
        this.trick = new TrickDTO();
        this.boardshop = "XerTebyaZnaet";
        this.startDate = 11111111;
        this.endDate = 22222222;
    }

    public PromocodeDTO(String promocode, TrickDTO trick, String boardshop, int startDate, int endDate) {
        this.promocode = promocode;
        this.trick = trick;
        this.boardshop = boardshop;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getPromocode() {
        return promocode;
    }

    public TrickDTO getTrick() {
        return trick;
    }

    public String getBoardshop() {
        return boardshop;
    }

    public int getStartDate() {
        return startDate;
    }

    public int getEndDate() {
        return endDate;
    }
}
