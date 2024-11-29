package game;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Game {

	public void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

	public void play() {
		int player = 0;
		Board board = new Board();

		board.print();
		sleep(1000);

		board.reset();
		board.setField(1, 3, "⬛"); board.setField(1, 4, "⬛"); board.setField(1, 5, "⬛");
		board.setField(2, 2, "⬛"); board.setField(2, 5, "⬛");
		board.setField(3, 6, "⬛");
		board.setField(4, 5, "⬛");
		board.setField(5, 4, "⬛");
		board.setField(6, 3, "⬛");
		board.setField(7, 2, "⬛"); board.setField(7, 3, "⬛"); board.setField(7, 4, "⬛"); board.setField(7, 5, "⬛");

		board.print();
		sleep(1000);

		board.reset();
		board.setField(1, 4, "⬛");
		board.setField(2, 3, "⬛");
		board.setField(3, 4, "⬛");
		board.setField(4, 4, "⬛");
		board.setField(5, 4, "⬛");
		board.setField(6, 4, "⬛");
		board.setField(7, 2, "⬛"); board.setField(7, 3, "⬛"); board.setField(7, 4, "⬛"); board.setField(7, 5, "⬛");

		board.print();
		sleep(1000);

		board.reset();

		boolean playing = true;
		while(playing) {
			try {
				Random r = new Random();
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				int newCar = r.nextInt(8);
				board.setField(0, newCar, "🚙");
				board.setField(7, player, "🚗");
				
				board.print();

				//input
				String key = br.readLine();

				if(key.equals("q")) {
					playing = false;
					break;
				} else if(key.equals("a") && player > 0) {
					board.setField(7, player, "⬜");
					player -= 1;
				} else if(key.equals("d") && player < 7) {
					board.setField(7, player, "⬜");
					player += 1;
				}
				if(board.getField(7, player).equals("🚙") || board.getField(6, player).equals("🚙")) {
					playing = false;
					System.out.println("Perdiste!");

					board.moveDown();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


	public static void main(String[] args) {
		Game game = new Game();
		game.play();
	}
}
