package org.rohiniinfotech;

public class HDFC implements RBI{
    @Override
    public void withdraw() {
        System.out.println("withdraw amount from HDFC bank");
    }

    @Override
    public void deposit() {
        System.out.println("deposit amount from HDFC bank");
    }

    @Override
    public void internetbanking() {
        System.out.println("internetbanking amount from HDFC bank");
    }

    @Override
    public void loan() {
        System.out.println("loan amount from HDFC bank");

    }

}
