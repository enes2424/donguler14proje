public class PatikaProje {

	public static void main(String[] args) {
		boolean isAsal = true;
		for (int i = 1; i <= 100; i++) {
			if (i < 2) isAsal = false;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) isAsal = false;
			}
			if (isAsal) System.out.print(i + " ");
			else isAsal = true;
		}
	}

}
