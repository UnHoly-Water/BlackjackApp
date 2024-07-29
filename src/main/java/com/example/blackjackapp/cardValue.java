package com.example.blackjackapp;

import java.util.HashMap;
import java.util.Map;

public class cardValue {
    private static final Map<String, Integer> cardValueMap = new HashMap<>();

    static {
        // Spades
        cardValueMap.put("AS", 1);  // Ace of Spades
        cardValueMap.put("2S", 2);  // 2 of Spades
        cardValueMap.put("3S", 3);  // 3 of Spades
        cardValueMap.put("4S", 4);  // 4 of Spades
        cardValueMap.put("5S", 5);  // 5 of Spades
        cardValueMap.put("6S", 6);  // 6 of Spades
        cardValueMap.put("7S", 7);  // 7 of Spades
        cardValueMap.put("8S", 8);  // 8 of Spades
        cardValueMap.put("9S", 9);  // 9 of Spades
        cardValueMap.put("10S", 10); // 10 of Spades
        cardValueMap.put("JS", 11); // Jack of Spades
        cardValueMap.put("QS", 11); // Queen of Spades
        cardValueMap.put("KS", 11); // King of Spades

        // Hearts
        cardValueMap.put("AH", 1);  // Ace of Hearts
        cardValueMap.put("2H", 2);  // 2 of Hearts
        cardValueMap.put("3H", 3);  // 3 of Hearts
        cardValueMap.put("4H", 4);  // 4 of Hearts
        cardValueMap.put("5H", 5);  // 5 of Hearts
        cardValueMap.put("6H", 6);  // 6 of Hearts
        cardValueMap.put("7H", 7);  // 7 of Hearts
        cardValueMap.put("8H", 8);  // 8 of Hearts
        cardValueMap.put("9H", 9);  // 9 of Hearts
        cardValueMap.put("10H", 10); // 10 of Hearts
        cardValueMap.put("JH", 11); // Jack of Hearts
        cardValueMap.put("QH", 11); // Queen of Hearts
        cardValueMap.put("KH", 11); // King of Hearts

        // Diamonds
        cardValueMap.put("AD", 1);  // Ace of Diamonds
        cardValueMap.put("2D", 2);  // 2 of Diamonds
        cardValueMap.put("3D", 3);  // 3 of Diamonds
        cardValueMap.put("4D", 4);  // 4 of Diamonds
        cardValueMap.put("5D", 5);  // 5 of Diamonds
        cardValueMap.put("6D", 6);  // 6 of Diamonds
        cardValueMap.put("7D", 7);  // 7 of Diamonds
        cardValueMap.put("8D", 8);  // 8 of Diamonds
        cardValueMap.put("9D", 9);  // 9 of Diamonds
        cardValueMap.put("10D", 10); // 10 of Diamonds
        cardValueMap.put("JD", 11); // Jack of Diamonds
        cardValueMap.put("QD", 11); // Queen of Diamonds
        cardValueMap.put("KD", 11); // King of Diamonds

        // Clubs
        cardValueMap.put("AC", 1);  // Ace of Clubs
        cardValueMap.put("2C", 2);  // 2 of Clubs
        cardValueMap.put("3C", 3);  // 3 of Clubs
        cardValueMap.put("4C", 4);  // 4 of Clubs
        cardValueMap.put("5C", 5);  // 5 of Clubs
        cardValueMap.put("6C", 6);  // 6 of Clubs
        cardValueMap.put("7C", 7);  // 7 of Clubs
        cardValueMap.put("8C", 8);  // 8 of Clubs
        cardValueMap.put("9C", 9);  // 9 of Clubs
        cardValueMap.put("10C", 10); // 10 of Clubs
        cardValueMap.put("JC", 11); // Jack of Clubs
        cardValueMap.put("QC", 11); // Queen of Clubs
        cardValueMap.put("KC", 11); // King of Clubs
    }

    public static int getCardValue(String card) {
        return cardValueMap.getOrDefault(card, -1); // Return -1 for unknown cards
    }
}
