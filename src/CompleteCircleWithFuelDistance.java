
public class CompleteCircleWithFuelDistance {
	static class PetrolPump {
		private int petrol;
		private int distance;

		public PetrolPump(int a, int b) {
			this.petrol = a;
			this.distance = b;

		}
	}

	/*public static void main(String[] args) {
		PetrolPump arr[] = { new PetrolPump(4, 6), new PetrolPump(6, 5), new PetrolPump(7, 3),
				new PetrolPump(4, 5) };

		System.out.println(FuelCircleDetect(arr));
	}*/

	public static int FuelCircleDetect(PetrolPump p[]) {

		int start = 0;
		int end = p.length - 1;
		int n = p.length;
		int cur_pet = 0;
		int finalStart = start;
		while (start != end) {
			cur_pet = cur_pet + (p[start].petrol - p[start].distance);
			if (cur_pet < 0) {
				cur_pet = 0;
				end = start;
				start = (start + 1) % n;
				finalStart = start;
				if (start == 0) {
					return -1;
				}
			} else {
				start = (start + 1) % n;
			}
		}

		return finalStart + 1;
	}

}
