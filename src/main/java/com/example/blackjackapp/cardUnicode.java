package com.example.blackjackapp;

import java.util.HashMap;
import java.util.Map;

public class cardUnicode {

    private static final Map<String, String> cardUnicodeMap = new HashMap<>();

    static {
        // Initialize the map with card initials and their Unicode representations
        cardUnicodeMap.put("AS", "🂡"); // Ace of Spades
        cardUnicodeMap.put("2S", "🂢"); // 2 of Spades
        cardUnicodeMap.put("3S", "🂣"); // 3 of Spades
        cardUnicodeMap.put("4S", "🂤"); // 4 of Spades
        cardUnicodeMap.put("5S", "🂥"); // 5 of Spades
        cardUnicodeMap.put("6S", "🂦"); // 6 of Spades
        cardUnicodeMap.put("7S", "🂧"); // 7 of Spades
        cardUnicodeMap.put("8S", "🂨"); // 8 of Spades
        cardUnicodeMap.put("9S", "🂩"); // 9 of Spades
        cardUnicodeMap.put("10S", "🂪"); // 10 of Spades
        cardUnicodeMap.put("JS", "🂫"); // Jack of Spades
        cardUnicodeMap.put("QS", "🂭"); // Queen of Spades
        cardUnicodeMap.put("KS", "🂮"); // King of Spades

        cardUnicodeMap.put("AH", "🂱"); // Ace of Hearts
        cardUnicodeMap.put("2H", "🂲"); // 2 of Hearts
        cardUnicodeMap.put("3H", "🂳"); // 3 of Hearts
        cardUnicodeMap.put("4H", "🂴"); // 4 of Hearts
        cardUnicodeMap.put("5H", "🂵"); // 5 of Hearts
        cardUnicodeMap.put("6H", "🂶"); // 6 of Hearts
        cardUnicodeMap.put("7H", "🂷"); // 7 of Hearts
        cardUnicodeMap.put("8H", "🂸"); // 8 of Hearts
        cardUnicodeMap.put("9H", "🂹"); // 9 of Hearts
        cardUnicodeMap.put("10H", "🂺"); // 10 of Hearts
        cardUnicodeMap.put("JH", "🂻"); // Jack of Hearts
        cardUnicodeMap.put("QH", "🂽"); // Queen of Hearts
        cardUnicodeMap.put("KH", "🂾"); // King of Hearts

        cardUnicodeMap.put("AD", "🃁"); // Ace of Diamonds
        cardUnicodeMap.put("2D", "🃂"); // 2 of Diamonds
        cardUnicodeMap.put("3D", "🃃"); // 3 of Diamonds
        cardUnicodeMap.put("4D", "🃄"); // 4 of Diamonds
        cardUnicodeMap.put("5D", "🃅"); // 5 of Diamonds
        cardUnicodeMap.put("6D", "🃆"); // 6 of Diamonds
        cardUnicodeMap.put("7D", "🃇"); // 7 of Diamonds
        cardUnicodeMap.put("8D", "🃈"); // 8 of Diamonds
        cardUnicodeMap.put("9D", "🃉"); // 9 of Diamonds
        cardUnicodeMap.put("10D", "🃊"); // 10 of Diamonds
        cardUnicodeMap.put("JD", "🃋"); // Jack of Diamonds
        cardUnicodeMap.put("QD", "🃍"); // Queen of Diamonds
        cardUnicodeMap.put("KD", "🃎"); // King of Diamonds

        cardUnicodeMap.put("AC", "🃑"); // Ace of Clubs
        cardUnicodeMap.put("2C", "🃒"); // 2 of Clubs
        cardUnicodeMap.put("3C", "🃓"); // 3 of Clubs
        cardUnicodeMap.put("4C", "🃔"); // 4 of Clubs
        cardUnicodeMap.put("5C", "🃕"); // 5 of Clubs
        cardUnicodeMap.put("6C", "🃖"); // 6 of Clubs
        cardUnicodeMap.put("7C", "🃗"); // 7 of Clubs
        cardUnicodeMap.put("8C", "🃘"); // 8 of Clubs
        cardUnicodeMap.put("9C", "🃙"); // 9 of Clubs
        cardUnicodeMap.put("10C", "🃚"); // 10 of Clubs
        cardUnicodeMap.put("JC", "🃛"); // Jack of Clubs
        cardUnicodeMap.put("QC", "🃝"); // Queen of Clubs
        cardUnicodeMap.put("KC", "🃞"); // King of Clubs
    }

    public static String getCardUnicode(String cardInitial) {
        // Return the Unicode representation based on card initials
        return cardUnicodeMap.getOrDefault(cardInitial, "Unknown Card");
    }
}
