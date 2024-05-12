package models;

public class Pack {
    private Long id;
    private boolean backPack;
    private boolean handLuggageTen;
    private boolean handLuggageSixteen;
    private boolean holdLuggage;
    private boolean changeWithCharge;
    private boolean fullRefund;
    private boolean bedSeat;

    public Pack(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isBackPack() {
        return backPack;
    }

    public void setBackPack(boolean backPack) {
        this.backPack = backPack;
    }

    public boolean isHandLuggageTen() {
        return handLuggageTen;
    }

    public void setHandLuggageTen(boolean handLuggageTen) {
        this.handLuggageTen = handLuggageTen;
    }

    public boolean isHandLuggageSixteen() {
        return handLuggageSixteen;
    }

    public void setHandLuggageSixteen(boolean handLuggageSixteen) {
        this.handLuggageSixteen = handLuggageSixteen;
    }

    public boolean isHoldLuggage() {
        return holdLuggage;
    }

    public void setHoldLuggage(boolean holdLuggage) {
        this.holdLuggage = holdLuggage;
    }

    public boolean isChangeWithCharge() {
        return changeWithCharge;
    }

    public void setChangeWithCharge(boolean changeWithCharge) {
        this.changeWithCharge = changeWithCharge;
    }

    public boolean isFullRefund() {
        return fullRefund;
    }

    public void setFullRefund(boolean fullRefund) {
        this.fullRefund = fullRefund;
    }

    public boolean isBedSeat() {
        return bedSeat;
    }

    public void setBedSeat(boolean bedSeat) {
        this.bedSeat = bedSeat;
    }
}
