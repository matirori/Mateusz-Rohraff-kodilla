package com.kodilla.rps;

public class Messages {
    private static final String WELCOME_MESSAGE = "Witaj graczu!";
    private static final String QUESTION_ABOUT_PLAYER_NAME = "Jak masz na imię?";
    private static final String QUESTION_ABOUT_QUANTITY_OF_ROUNDS = "Do ilu wygranych rund chcesz zagrać?";
    private static final String INFORMATION_ABOUT_CONTROL = "Klawisz 1 - zagranie KAMIEŃ" + "\n" + "Klawisz 2 - zagranie PAPIER" + "\n" + "Klawisz 3 - zagranie NOŻYCE" + "\n" + "Klawisz x - zakończenie gry" + "\n" + "Klawisz n - rozpoczęcie nowej gry";
    private static final String STARTING_GAME = "Zaczynamy grę!";
    private static final String ASK_TO_MAKE_MOVE = "Proszę wykonaj swój ruch";
    private static final String ENDING_GAME_MESSAGE = "Gra dobiegła końca. Ostateczny wynik ";
    private static final String QUESTION_ABOUT_NEW_GAME = "Chcesz zagrąć jeszcze raz, czy kończymy grę? (N/X)";
    private static final String MAKING_SURE_TO_END_GAME = "Czy napewno zakończyć grę? (TAK/NIE)" ;
    private static final String MAKING_SURE_TO_START_NEW_GAME = "Czy napewno rozpocząć nową grę? (TAK/NIE)";
    private static final String QUESTION_ABOUT_QUANTITY_OF_ROUNDS_IN_NEW_GAME = "Do ilu rund chcesz zagrać w tej rozgrywce?";

    public static void showWelcomeMessage() {
        System.out.println(WELCOME_MESSAGE);
    }

    public static void showQuestionAboutPlayerName() {
        System.out.println (QUESTION_ABOUT_PLAYER_NAME);
    }

    public static void showQuestionAboutQuantityOfRounds() {
        System.out.println (QUESTION_ABOUT_QUANTITY_OF_ROUNDS);
    }

    public static void showInformationAboutControl() { System.out.println (INFORMATION_ABOUT_CONTROL);}

    public static void showStartingGameMessage() {
        System.out.println (STARTING_GAME);
    }

    public static void showAskTOMakeMove() {System.out.println(ASK_TO_MAKE_MOVE);}

    public static void showEndingMessage() {System.out.println(ENDING_GAME_MESSAGE);}

    public static void showQuestionAboutNewGame() {System.out.println(QUESTION_ABOUT_NEW_GAME);}

    public static void makeSureToEndGame() {System.out.println(MAKING_SURE_TO_END_GAME);}

    public static void makeSureToStartNewGamne() {System.out.println(MAKING_SURE_TO_START_NEW_GAME);}
    public static void showQuestionAboutQuantityOfRoundsInNewGame() {System.out.println(QUESTION_ABOUT_QUANTITY_OF_ROUNDS_IN_NEW_GAME);}
}
