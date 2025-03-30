public class PracticeProblem {

	public static void main(String args[]) {
	}
	
	public static void selectionSortName(String[] names, int[] ages) {
		for(int i = 0; i < names.length - 1; i++) {
			int smallestIndex = i;
			for(int j = i + 1; j < names.length; j++) {
				
				
				if(names[j].toLowerCase().compareTo(names[smallestIndex].toLowerCase()) < 0) {
					smallestIndex = j;
				}
			}
			
			String tempName = names[i];
			int tempAge = ages[i];
			names[i] = names[smallestIndex];
			ages[i] = ages[smallestIndex];

			names[smallestIndex] = tempName;
			ages[smallestIndex] = tempAge;
		}
	}

	public static void selectionSortAge(String[] names, int[] ages) {
		for(int i = 0; i < ages.length - 1; i++) {
			int smallestIndex = i;
			for(int j = i + 1; j < ages.length; j++) {
				
				
				if(ages[j] < ages[smallestIndex]) {
					smallestIndex = j;
				}
			}
			
			String tempName = names[i];
			int tempAge = ages[i];
			names[i] = names[smallestIndex];
			ages[i] = ages[smallestIndex];

			names[smallestIndex] = tempName;
			ages[smallestIndex] = tempAge;
		}
	}
}
