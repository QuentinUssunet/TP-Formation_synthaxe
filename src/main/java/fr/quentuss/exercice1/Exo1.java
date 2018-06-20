package fr.quentuss.exercice1;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Exo1 implements Runnable {

	public static void main(String[] args) {

		new Exo1(args).run();
		//
		// int num = sc.nextInt();
		//
		// if(num%2 == 0) {
		// type = "pair";
		// } else {
		// type = "impair";
		// }

	}

	private Scanner sc = new Scanner(System.in);
	private final String username;
	private static final Logger LOGGER = LoggerFactory.getLogger(Exo1.class);

	public Exo1(final String[] args) {
		if (args.length > 0) {
			this.username = args[0];
		} else {
			this.username = null;
			LOGGER.error("Impossible d'executer l'application, veuillez démarrer le programme avec un argument");
			this.usage();
			System.exit(1);
		}
	}

	private void usage() {
		LOGGER.info("Usage : exo1 <username>");
		LOGGER.info("\t- username : Votre pseudo.");
	}

	@Override
	public void run() {
		LOGGER.info("Bienvenu {} !", this.username);
		boolean quit = false;
		while (!quit) {
			int num = 0;
			LOGGER.info("Veillez entrer un nombre entier");
			try {
				num = sc.nextInt();
			} catch (InputMismatchException e) {
				if (sc.next().equals("exit")) {
					LOGGER.info("A bientot");
					quit = true;
				} else {
					// e.printStackTrace(); devient LOGGER
					LOGGER.warn("Saisie incorrecte");
				}
				continue;
			}
			if (num > 0) {
				LOGGER.info("Votre nombre est un entier positif");
			} else if (num < 0) {
				LOGGER.info("Votre nombre est un entier négatif");
			} else {
				LOGGER.info("Votre nombre est nul et est pair");
			}
			if (num%2==0) {
				LOGGER.info("pair");
			} else {
				LOGGER.info("impair");
			}

		}

	}

}
