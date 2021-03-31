package com.tictactoe.bridgelabz;

import java.util.Scanner;

/**
 * print welcome message
 * 
 * @Description- create a empty tic tac toe toe board
 */

public class TicTacToeGame {
	public static void main(String[] args) {
		System.out.println("Welcome to the tic toe game");
		Scanner scanner = new Scanner(System.in);

		char[][] gameBoard = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };

		System.out.println(gameBoard[0][0] + "|" + gameBoard[0][1] + "|" + gameBoard[0][2]);
		System.out.println("-+-+-");
		System.out.println(gameBoard[1][0] + "|" + gameBoard[1][1] + "|" + gameBoard[1][2]);
		System.out.println("-+-+-");
		System.out.println(gameBoard[2][0] + "|" + gameBoard[2][1] + "|" + gameBoard[2][2]);

	}

}
