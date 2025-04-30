package shoppingstore.models;

import java.util.ArrayList;
import java.util.Collections;

public class Card {

    private double balance;
    private final double limit;
    private final ArrayList<Buy> buyList;

    public Card(double limit) {
        this.limit = limit;
        this.balance = limit;
        this.buyList = new ArrayList<>();
    }

    public boolean processBuy(Buy buy) {
        if (this.balance >= buy.getValue()) {
            this.balance -= buy.getValue();
            this.buyList.add(buy);
            return true;
        } else {
            return false;
        }

    }

    public double getBalance() {
        return balance;
    }


    public double getLimit() {
        return limit;
    }

    public ArrayList<Buy> getBuyList() {
        Collections.sort(buyList);
        return new ArrayList<>(buyList);
    }


}