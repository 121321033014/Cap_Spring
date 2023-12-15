package org.rohiniinfotech;

public class Canada implements RBI{

    @Override
    public void withdraw() {
        System.out.println("withdraw amount from Canada bank");
    }

    @Override
    public void deposit() {
        System.out.println("deposit amount from Canada bank");
    }

    @Override
    public void internetbanking() {
        System.out.println("internetbanking amount from Canada bank");
    }

    @Override
    public void loan() {
        System.out.println("loan amount from Canada bank");
    }
    public void goldloan(){
        System.out.println("goldloan amount from Canada bank");
    }
}
