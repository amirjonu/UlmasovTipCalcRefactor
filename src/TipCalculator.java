public class TipCalculator {
    private int numPeople;
    private int tipPercentage;
    private double totalBillBeforeTip;

    public TipCalculator(int numOfPeople, int tipPercentage){
        numPeople= numOfPeople;
        this.tipPercentage=tipPercentage;
        totalBillBeforeTip= 0.0;
    }

    public double getTotalBillBeforeTip(){
        return totalBillBeforeTip;

    }

    public int getTipPercentage(){
        return tipPercentage;
    }

    public void addMeal(double cost){
        totalBillBeforeTip += cost;
    }

    public double tipAmount(){
        return (totalBillBeforeTip*((double)tipPercentage/100));
    }

    public double totalBill(){
        return totalBillBeforeTip+tipAmount();
    }
    public double perPersonCostBeforeTip(){
        return totalBillBeforeTip/numPeople;
    }

    public double perPersonTipAmount(){
        return tipAmount()/numPeople;
    }
    public double perPersonTotalCost(){
        return totalBill()/numPeople;
    }

}
