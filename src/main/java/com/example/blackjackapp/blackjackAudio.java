package com.example.blackjackapp;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class blackjackAudio {

    public static boolean isGameMuted = false;

    public static void muteAudio() {
        isGameMuted = !isGameMuted;
        System.out.println("Audio Muted = " + isGameMuted);
    }

    public static void playCardFlip() {
        if (!isGameMuted) {
            try {
                File file = new File("flipcard.wav");
                if (!file.exists()) {
                    System.out.println("File does not exist: " + file.getAbsolutePath());
                }
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
                if (audioInputStream == null) {
                    throw new IllegalArgumentException("Audio file could not be played");
                }
                Clip clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                clip.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void playWin() {
        if (!isGameMuted) {
            try {
                File file = new File("win.wav");
                if (!file.exists()) {
                    System.out.println("File does not exist: " + file.getAbsolutePath());
                }
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
                if (audioInputStream == null) {
                    throw new IllegalArgumentException("Audio file could not be played");
                }
                Clip clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                clip.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void playLose() {
        if (!isGameMuted) {
            try {
                File file = new File("lose.wav");
                if (!file.exists()) {
                    System.out.println("File does not exist: " + file.getAbsolutePath());
                }
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
                if (audioInputStream == null) {
                    throw new IllegalArgumentException("Audio file could not be played");
                }
                Clip clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                clip.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
