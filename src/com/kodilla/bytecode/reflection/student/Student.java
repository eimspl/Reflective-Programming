package com.kodilla.bytecode.reflection.student;

import java.security.SecureRandom;

public class Student {
    private String indexNumber = generateRandomStringWithTenCharacters();

    public String getIndexNumber() {
        return indexNumber;
    }

    private static String generateRandomStringWithTenCharacters() {
        final SecureRandom random = new SecureRandom();
        final char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz01234567890".toCharArray();
        StringBuilder randomTenCharacters = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            int charIndex = random.nextInt(chars.length);
            randomTenCharacters.append(chars[charIndex]);
        }

        return randomTenCharacters.toString();
    }


}
