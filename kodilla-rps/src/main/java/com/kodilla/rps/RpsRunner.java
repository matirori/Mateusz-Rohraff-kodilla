package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Messages.showWelcomeMessage();
        Messages.showQuestionAboutPlayerName();
        String playerName = scanner.nextLine();
        Human human = new Human(playerName);
        Computer computer = new Computer("BOT");
        Messages.showQuestionAboutQuantityOfRounds();
        int quantityOfRounds = scanner.nextInt();
        Game game = new Game(quantityOfRounds);
        Messages.showInformationAboutControl();
        GameProcessor gameProcessor = new GameProcessor(game, human, computer);
        gameProcessor.runGame();
    }
}
