package org.itstep;

public class Model {
    private int value;
    private double doubleValue;
    private String StringValue;
    private int minBarrier=0;
    private int maxBarrier=100;
    private int computersNumber;
    private int trys=1;


    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public void setMinBarrier(int minBarrier ){this.minBarrier=minBarrier;}
    public void setMaxBarrier(int maxBarrier ){this.maxBarrier=maxBarrier;}
    public int getMinBarrier(){return minBarrier;}
    public int getMaxBarrier(){return maxBarrier;}
    public void incrementTrys(){this.trys++;}
    public int getTrys(){return trys;}
    public void rand(int min,int max){
        this.computersNumber= min +  (int)(Math.random()*((max-min)+1));
    }
   public int getComputersNumber(){ return computersNumber;}


}
