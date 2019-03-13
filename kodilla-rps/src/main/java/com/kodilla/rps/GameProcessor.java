package com.kodilla.rps;

import java.util.Scanner;

public class GameProcessor {
    private Game game;
    private final Player player1;
    private final Player player2;

    public GameProcessor(Game game, Player player1, Player player2) {
        this.game = game;
        this.player1 = player1;
        this.player2 = player2;
    }

    public void runGame() {
        boolean endGame = false;

        while(!endGame){
            Messages.showAskTOMakeMove();
            int humanMove = player1.getMove();
            int botMove =  player2.getMove();
            game.showHumanMove(humanMove);
            game.showBotMove(botMove);
            int winner =  game.whoWin(humanMove, botMove);
                if(winner == 1){
                    player1.addPoint();
                }else{
                    if(winner == 2)
                    player2.addPoint();
                }
            player1.showPoints();
            player2.showPoints();
                if(player1.getPoints() == game.getQuantityOfRound() || player2.getPoints() == game.getQuantityOfRound()){
                    Messages.showEndingMessage();
                    player1.showFinalScore();
                    player2.showFinalScore();
                    int restartOrEnd = game.endingGame();
                        if(restartOrEnd == 0){
                            endGame = true;
                        }else{
                            player2.removingPoints();
                            player1.removingPoints();
                            Messages.showQuestionAboutQuantityOfRoundsInNewGame();
                            Scanner scanner = new Scanner(System.in);
                            int newQuantity = scanner.nextInt();
                            game = new Game(newQuantity);
                        }
                }
        }
    }
}
