package org.rohiniinfotech;

public class SBI implements RBI {

    @Override
    public void withdraw() {
    System.out.println("withdraw amount from SBI bank");
    }

    @Override
    public void deposit() {
        System.out.println("deposit amount from SBI bank");
    }

    @Override
    public void internetbanking() {
        System.out.println("internetbanking amount from SBI bank");
    }

    @Override
    public void loan() {
        System.out.println("loan amount from SBI bank");
    }
}
