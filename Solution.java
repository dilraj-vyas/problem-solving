package com.remote.base.wallet.exception;

import com.remote.base.wallet.DigitalWallet;
import com.remote.base.wallet.DigitalWalletTransaction;

import java.util.*;

class TransactionException extends Exception {


    private String errorCode;
    private String errorMsg;


    public TransactionException(String errorMsg, String errorCode) {
        super(errorMsg);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }
}

class DigitalWallet {

    private String walletId;
    private String userName;
    private String userAccessCode;

    private int walletBalance;

    public DigitalWallet(String walletId, String userName) {
        this.walletId = walletId;
        this.userName = userName;
    }

    public DigitalWallet(String walletId, String userName, String userAccessCode) {
        this.walletId = walletId;
        this.userName = userName;
        this.userAccessCode = userAccessCode;
    }

    public String getWalletId() {
        return walletId;
    }

    public String getUsername() {
        return userName;
    }

    public String getUserAccessCode() {
        return userAccessCode;
    }

    public int getWalletBalance() {
        return walletBalance;
    }

    public void setWalletBalance(int walletBalance) {
        this.walletBalance = walletBalance;
    }

    @Override
    public String toString() {
        return "DigitalWallet{" +
                "walletId='" + walletId + '\'' +
                ", userName='" + userName + '\'' +
                ", userAccessCode='" + userAccessCode + '\'' +
                ", walletBalance=" + walletBalance +
                '}';
    }
}

public class Solution {

    public static void main(String[] args) {
        try {
            DigitalWallet digitalWallet = new DigitalWallet("1", "Ankita", "ssssssssssssssssfff");

            DIGITAL_WALLET_TRANSACTION.addMoney(digitalWallet, 123);
            System.out.println(DigitalWalletTransaction.digitalWalletMap);
            DIGITAL_WALLET_TRANSACTION.payMoney(digitalWallet, -20);
            System.out.println(DigitalWalletTransaction.digitalWalletMap);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
