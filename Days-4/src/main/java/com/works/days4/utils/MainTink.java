package com.works.days4.utils;

public class MainTink {
    public static void main(String[] args) {

        String cipherText = TinkEncDec.encrypt("12345");
        System.out.println(cipherText);

        String plainText  = TinkEncDec.decrypt(cipherText);
        System.out.println(plainText);

    }
}
