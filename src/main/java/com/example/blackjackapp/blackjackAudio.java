package com.example.blackjackapp;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.io.InputStream;
import java.util.Objects;

public class blackjackAudio {
    public static void playCardFlip() {
        try {
            File file = new File("src/main/java/com/example/blackjackapp/flipcard.wav");
            if (!file.exists()) {
                System.out.println("File does not exist: " + file.getAbsolutePath());
            } else {
                System.out.println(file + " found");
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

    public static void playWin() {
        try {
            File file = new File("src/main/java/com/example/blackjackapp/win.wav");
            if (!file.exists()) {
                System.out.println("File does not exist: " + file.getAbsolutePath());
            } else {
                System.out.println(file + " found");
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

    public static void playLose() {
        try {
            File file = new File("src/main/java/com/example/blackjackapp/lose.wav");
            if (!file.exists()) {
                System.out.println("File does not exist: " + file.getAbsolutePath());
            } else {
                System.out.println(file + " found");
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
