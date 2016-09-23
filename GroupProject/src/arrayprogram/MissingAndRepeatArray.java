package arrayprogram;

public class MissingAndRepeatArray {

	public static void main(String[] args) {
		int[] natural = new int[10];
		int[] random = new int[10];
		int[] miss = new int[10];
		int[] repeat = new int[10];
		int c = 0, c1 = 0;
		boolean flag = true;

		// create natural number
		for (int i = 0; i < natural.length; i++) {
			natural[i] = i;
		}

		// create random number
		for (int i = 0; i < random.length; i++) {
			random[i] = (int) (Math.random() * 10);
		}

		// print natural and random number
		System.out.println("natural    Random");
		for (int i = 0; i < natural.length; i++) {

			System.out.println(natural[i] + "              " + random[i]);
		}

		// all number replace with 11
		for (int i = 0; i < repeat.length; i++)
			repeat[i] = 11;

		// find repeat number in random array
		for (int i = 0; i < random.length; i++) {
			for (int j = i + 1; j < random.length; j++) {
				if (random[i] == random[j]) {
					flag = true;
					for (int k = 0; k <= i; k++) {
						if (random[i] == repeat[k]) {
							flag = false;
						}
					}
					if (flag) {
						repeat[c1++] = random[i];
					}

				}
			}

		}
		System.out.println("repeat number.");
		for (int i = 0; i < repeat.length; i++) {
			if (repeat[i] != 11)
				System.out.println(repeat[i]);
		}

		// all number replace with 11
		for (int i = 0; i < miss.length; i++)
			miss[i] = 11;

		// find missing number of 0 to 9 in random array
		for (int i = 0; i < natural.length; i++) {
			flag = true;
			for (int j = 0; j < random.length; j++) {
				if (natural[i] == random[j]) {
					flag = false;
				}
			}
			if (flag)
				miss[c++] = natural[i];
		}

		System.out.println("missing number.");
		for (int i = 0; i < miss.length; i++) {
			if (miss[i] != 11)
				System.out.println(miss[i]);
		}
	}
}
