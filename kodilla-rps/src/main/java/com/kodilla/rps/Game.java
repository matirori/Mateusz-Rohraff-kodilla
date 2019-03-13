package com.kodilla.rps;

import java.util.Scanner;

public class Game {

    private final int quantityOfRound;

    public Game(int quantityOfRound) {
        this.quantityOfRound = quantityOfRound;
    }

    public int getQuantityOfRound() {
        return quantityOfRound;
    }

    public int whoWin(int player1Move, int player2Move) {
        if (player1Move == player2Move) {
            System.out.println("Remis, nikt nie zdobywa punktu");
            return 0;
        } else {
            if (player1Move == 1 && player2Move == 3 || player1Move == 2 && player2Move == 1 || player1Move == 3 && player2Move == 2) {
                System.out.println("Gratulację wygrałeś rundę");
                return 1;
            } else {
                System.out.println("Niestety przegrałeś rundę");
                return 2;
            }
        }
    }

    public void showHumanMove(int player1Move) {
        if (player1Move == 1) {
            System.out.println("Wybrałeś Kamień");
        } else {
            if (player1Move == 2) {
                System.out.println("Wybrałeś Papier");
            } else {
                System.out.println("Wybrałeś Nożyce");
            }
        }
    }

    public void showBotMove(int player2Move) {
        if (player2Move == 1) {
            System.out.println("Twój przeciwnik wybrał Kamień");
        } else {
            if (player2Move == 2) {
                System.out.println("Twój przeciwnik wybrał Papier");
            } else {
                System.out.println("Twój przeciwnik wybrał Nożyce");
            }
        }
    }

    public int endingGame() {
        Scanner scanner = new Scanner(System.in);
        Messages.showQuestionAboutNewGame();
        for (int n = 0; n < 1; n++) {
            String decision = scanner.nextLine();
            if (decision.equals("X")) {
                Messages.makeSureToEndGame();
                for (int i = 0; i < 1; i++) {
                    String sure = scanner.nextLine();
                    if (sure.equals("TAK")) {
                        return 0;
                    } else {
                        if (sure.equals("NIE")) {
                            return 1;
                        } else {
                            System.out.println("Blędnie wprowadzone dane. Napisz 'TAK' jeśli chcesz zakońćzyć grę albo 'NIE' jeśli chcesz zacząć od nowa");
                            i--;
                        }
                    }
                }
            } else {
                if (decision.equals("N")) {
                    Messages.makeSureToStartNewGamne();
                    for (int i = 0; i < 1; i++) {
                        String sure1 = scanner.nextLine();
                        if (sure1.equals("TAK")) {
                            return 1;
                        } else {
                            if (sure1.equals("NIE")) {
                                return 0;
                            } else {
                                System.out.println("Blędnie wprowadzone dane. Napisz 'TAK' jeśli chcesz zagrać nową grę albo 'NIE' jeśli chcesz zakończyć grę");
                                i--;
                            }
                        }
                    }

                }else{
                    System.out.println("Błędnie wporwadzone dane. Wpisz 'X' lub 'N'");
                    n--;
                }
            }
        }
        return -1;
    }
}
