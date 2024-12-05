package bookExercises;

import javax.swing.JOptionPane;

public class Ex67 {

	public static void main(String[] args) {

		int lines = 10, column = 3;

		int[] a = new int[lines];

		int[] b = new int[lines];

		int[] c = new int[lines];

		int[][] d = new int[lines][column];

		int swap;

		String userAnswer;

		do {

			for (int i = 0; i < a.length; i++) {

				a[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Array A: " + "\nIndex: " + i));

			}

			for (int i = 0; i < b.length; i++) {

				b[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Array B: " + "\nIndex: " + i));

			}

			for (int i = 0; i < c.length; i++) {

				c[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Array C: " + "\nIndex: " + i));
			}

			for (int i = 0; i < lines; i++) {

				for (int j = 0; j < column; j++) {

					d[i][0] = a[i];
				}
			}

			for (int i = 0; i < lines; i++) {

				for (int j = 0; j < column; j++) {

					d[i][1] = b[i];
				}
			}

			for (int i = 0; i < lines; i++) {

				for (int j = 0; j < column; j++) {

					d[i][2] = c[i];
				}
			}

			// ascending order
			for (int i = 0; i < lines; i++) {

				for (int j = i + 1; j < lines; j++) {

					if (d[i][0] > d[j][0]) {

						swap = d[i][0];

						d[i][0] = d[j][0];

						d[j][0] = swap;

					}

				}

			}

			// descending order
			for (int i = 0; i < lines; i++) {

				for (int j = lines - 1; j > i; j--) {

					if (d[j][1] > d[i][1]) {

						swap = d[i][1];

						d[i][1] = d[j][1];

						d[j][1] = swap;

					}

				}
			}

			// ascending order
			for (int i = 0; i < lines; i++) {

				for (int j = i + 1; j < lines; j++) {

					if (d[i][2] > d[j][2]) {

						swap = d[i][2];

						d[i][2] = d[j][2];

						d[j][2] = swap;

					}

				}

			}

			for (int i = 0; i < lines; i++) {

				for (int j = 0; j < column; j++) {

					System.out.print(d[i][j] + " | ");
				}

				System.out.println();
			}

			userAnswer = JOptionPane.showInputDialog(null, "Do You Want To Continue? (yes/no)");

			userAnswer = userAnswer.trim();

		} while (userAnswer.equalsIgnoreCase("yes"));

		JOptionPane.showMessageDialog(null, "END OF APPLICATION!");

	}

}
