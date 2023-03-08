package com.mycompany.rockpapaerscissors;

import javax.swing.JOptionPane;

public class RockPapaerScissors {

    public static String user() {
        String userChoice = JOptionPane.showInputDialog(null, """
                                          Select your choice using the corresponding number:
                                          1 - Rock
                                          2 - Paper
                                          3 - Scissors
                                          4 - End Game""",
                "Select your choice", JOptionPane.QUESTION_MESSAGE);

        switch (userChoice) {
            case "1":
                userChoice = "Rock";
                break;
            case "2":
                userChoice = "Paper";
                break;
            case "3":
                userChoice = "Scissors";
                break;
            default:
                userChoice = "End";
        }

        return userChoice;
    }

    public static String comp() {
        String choices[] = new String[3];
        choices[0] = "Rock";
        choices[1] = "Paper";
        choices[2] = "Scissors";

        int randomNum = (int) Math.floor(Math.random() * choices.length);

        return choices[randomNum];
    }

    public static void game() {
        int userScore = 0;
        int compScore = 0;

        while (cont() != 1) {
            String user = user();
             String comp = comp();

            //User rock
            if (user == "Rock" && comp == "Scissors") {
                userScore++;
                JOptionPane.showMessageDialog(null, "User score:" + userScore + "\nComputer score:" + compScore + "\nUSER WINS THIS ROUND!!!",
                        "Rock Paper Scissors", JOptionPane.INFORMATION_MESSAGE);
            } else if (user == "Rock" && comp == "Rock") {
                JOptionPane.showMessageDialog(null, "IT's A TIE", "Rock Paper Scissors", JOptionPane.INFORMATION_MESSAGE);
            } else if (user == "Rock" && comp == "Paper") {
                compScore++;
                JOptionPane.showMessageDialog(null, "User score:" + userScore + "\nComputer score:" + compScore + "\nCOMPUTER WINS THIS ROUND!!!",
                        "Rock Paper Scissors", JOptionPane.INFORMATION_MESSAGE);
            }

            //User Paper
            if (user == "Paper" && comp == "Rock") {
                userScore++;
                JOptionPane.showMessageDialog(null, "User score:" + userScore + "\nComputer score:" + compScore + "\nUSER WINS THIS ROUND!!!",
                        "Rock Paper Scissors", JOptionPane.INFORMATION_MESSAGE);
            } else if (user == "Paper" && comp == "Paper") {
                JOptionPane.showMessageDialog(null, "IT's A TIE", "Rock Paper Scissors", JOptionPane.INFORMATION_MESSAGE);
            } else if (user == "Paper" && comp == "Scissors") {
                compScore++;
                JOptionPane.showMessageDialog(null, "User score:" + userScore + "\nComputer score:" + compScore + "\nCOMPUTER WINS THIS ROUND!!!",
                        "Rock Paper Scissors", JOptionPane.INFORMATION_MESSAGE);
            }

            //User Scissors
            if (user == "Scissors" && comp == "Paper") {
                userScore++;
                JOptionPane.showMessageDialog(null, "User score:" + userScore + "\nComputer score:" + compScore + "\nUSER WINS THIS ROUND!!!",
                        "Rock Paper Scissors", JOptionPane.INFORMATION_MESSAGE);
            } else if (user == "Scissors" && comp == "Scissors") {
                JOptionPane.showMessageDialog(null, "IT's A TIE", "Rock Paper Scissors", JOptionPane.INFORMATION_MESSAGE);
            } else if (user == "Scissors" && comp == "Scissors") {
                compScore++;
                JOptionPane.showMessageDialog(null, "User score:" + userScore + "\nComputer score:" + compScore + "\nCOMPUTER WINS THIS ROUND!!!",
                        "Rock Paper Scissors", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public static int cont() {
        int cont = JOptionPane.showConfirmDialog(null, "Continue game?", "Continue", 1);
        return cont;
    }

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, """
                                      This is a simple game of rock, papaer, scissors.
                                      Select your choice and maybe the odds be in your favor!!!""",
                "Rock Papaer Scissors", JOptionPane.INFORMATION_MESSAGE);

        game();

        JOptionPane.showMessageDialog(null, "Thanks for playing my game!!!", "Game Ended", JOptionPane.INFORMATION_MESSAGE);

    }
}
