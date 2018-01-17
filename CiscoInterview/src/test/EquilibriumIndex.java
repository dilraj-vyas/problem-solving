package test;

public class EquilibriumIndex {
	int equilibrium(int arr[], int n) {
		int sum = 0; // initialize sum of whole array
		int leftsum = 0; // initialize leftsum

		/* Find sum of the whole array */
		for (int i = 0; i < n; ++i)
			sum += arr[i];

		for (int i = 0; i < n; ++i) {
			sum -= arr[i]; // sum is now right sum for index i

			if (leftsum == sum)
				return i;

			leftsum += arr[i];
		}

		/* If no equilibrium index found, then return 0 */
		return -1;
	}

	public static void main(String[] args) {
		EquilibriumIndex equi = new EquilibriumIndex();
		int arr[] = { 1,2,3,3};
		int arr_size = arr.length;
		System.out.println(equi.equilibrium(arr, arr_size));
	}

}
