package com.example.blackjackapp;



import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class BlackjackController {

    @FXML
    private Label dealerDeck;

    @FXML
    private Label playerDeck;

    @FXML
    private Label playerCardTotal;

    @FXML
    private Label winLabel;

    @FXML
    private Label totalWins;

    @FXML
    private Label totalLosses;

    //Initialize the hands
    private static final List<String> dealersHand = new ArrayList<>();
    private static final List<String> playersHand = new ArrayList<>();

    public boolean isPlayerStanding = false;
    public boolean isDealerStanding = false;
    public boolean isGameOver = false;
    public String dealersVisibleHand = "";
    public int winCounter = 0;
    public int lossCounter = 0;

    //Deal the hands
    public static void dealHand() {
        dealersHand.clear();
        playersHand.clear();
        dealersHand.add(cardPicker.pickRandomCard());
        dealersHand.add(cardPicker.pickRandomCard());
        playersHand.add(cardPicker.pickRandomCard());
        playersHand.add(cardPicker.pickRandomCard());
        blackjackAudio.playCardFlip();
    }

    //Refresh the card display and player total display
    public void refreshDecks() {
        StringBuilder dealerDeckContent = new StringBuilder();
        StringBuilder dealerDeckContentVisible = new StringBuilder();
        StringBuilder playerDeckContent = new StringBuilder();

        if (!dealersHand.isEmpty()) {
            dealerDeckContent.append("🂿");
            for (int i = 1; i < dealersHand.size(); i++) {
                String card = cardUnicode.getCardUnicode(dealersHand.get(i));
                System.out.println(dealersHand.get(i));
                dealerDeckContent.append(card);
            }
            for (int i = 0; i < dealersHand.size(); i++) {
                String card = cardUnicode.getCardUnicode((dealersHand.get(i)));
                dealerDeckContentVisible.append(card);
            }
        }
        dealerDeck.setText(dealerDeckContent.toString());
        dealersVisibleHand = dealerDeckContentVisible.toString();

        for (int i = 0; i < playersHand.size(); i++) {
            String card = cardUnicode.getCardUnicode(playersHand.get(i));
            System.out.println(playersHand.get(i));
            playerDeckContent.append(card);
        }
        int handValue = getPlayerHandValue();
        playerCardTotal.setText("Total: " + handValue);
        playerDeck.setText(playerDeckContent.toString());
        checkIfGameShouldEnd();
    }

    //Get the value of the player's hand
    public static int getPlayerHandValue() {
        int handValue = 0;
        for (int i = 0; i < playersHand.size(); i++) {
            int card = cardValue.getCardValue(playersHand.get(i));
            handValue += card;
        }
        return handValue;
    }

    //Get the value of the dealer's hand
    public static int getDealerHandValue() {
        int handValue = 0;
        for (int i = 0; i < dealersHand.size(); i++) {
            int card = cardValue.getCardValue(dealersHand.get(i));
            handValue += card;
        }
        return handValue;
    }

    //Check winning conditions
    public void endGame() {
        //1 = Win, 2 = Lose
        isGameOver = true;
        revealDealersCard();
        if (getPlayerHandValue() > 21) {
            winLabel.setText("YOU LOSE!");
            blackjackAudio.playLose();
            lossCounter++;
            return;
        }
        if (getDealerHandValue() > 21) {
            winLabel.setText("YOU WIN!");
            blackjackAudio.playWin();
            winCounter++;
            return;
        }
        if (getPlayerHandValue() == getDealerHandValue()) {
            winLabel.setText("TIE!");
            blackjackAudio.playWin();
            return;
        }
        if (getPlayerHandValue() > getDealerHandValue()) {
            winLabel.setText("YOU WIN!");
            blackjackAudio.playWin();
            winCounter++;
            return;
        }
        if (getPlayerHandValue() < getDealerHandValue()) {
            winLabel.setText("YOU LOSE!");
            blackjackAudio.playLose();
            lossCounter++;
            return;
        }
    }

    //Add a card to the players deck
    public void playerHit() {
        playersHand.add(cardPicker.pickRandomCard());
        blackjackAudio.playCardFlip();
        refreshDecks();
    }

    //Add a card to the dealer's deck
    public void dealerHit() {
        dealersHand.add(cardPicker.pickRandomCard());
        blackjackAudio.playCardFlip();
        refreshDecks();
    }

    public void dealerAssessSituation() {
        if (getDealerHandValue() < 17) {
            dealerHit();
            isDealerStanding = false;
        } else {
            isDealerStanding = true;
        }
    }

    @FXML
    protected void hit() {
        if (!isGameOver) {
            playerHit();
            isPlayerStanding = false;
            dealerAssessSituation();
            checkIfGameShouldEnd();
        }
    }

    @FXML
    protected void stand() {
        if (!isGameOver) {
            isPlayerStanding = true;
            dealerAssessSituation();
            checkIfGameShouldEnd();
        }
    }

    public void checkIfGameShouldEnd() {
        if (isDealerStanding) {
            if (isPlayerStanding) {
                endGame();
            }
        }
        if (getDealerHandValue() > 21) {
            endGame();
        }
        if (getPlayerHandValue() > 21) {
            endGame();
        }
    }

    public void revealDealersCard() {
        if (isGameOver) {
            dealerDeck.setText(dealersVisibleHand);
            blackjackAudio.playCardFlip();
        }
    }

    public void initialize(){
        dealHand();
        refreshDecks();
        totalWins.setText("Wins: " + winCounter);
    }

    @FXML
    protected void restart() {
        isPlayerStanding = false;
        isDealerStanding = false;
        isGameOver = false;
        dealersVisibleHand = "";
        winLabel.setText("");
        initialize();
    }

}