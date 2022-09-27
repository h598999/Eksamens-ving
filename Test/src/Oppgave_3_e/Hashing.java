package Oppgave_3_e;

import java.util.HashSet;
import java.util.Random;

public class Hashing {
	
	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		Integer[] tab = new Integer[999999];
		int tall = 0;
		Random random = new Random();
		
		for (int i = 0; i<999999; i++) {
			tall = (tall+45713)%1000000;			
			tab[i] = tall;
			set.add(tall);
		}
		
		java.util.Arrays.sort(tab);
		Integer ran;
	
		int[] randomtab = new int[9999];
		
		for (int j = 0; j<9999; j++) {
			ran = random.nextInt(1000000);
			System.out.println(ran);
			randomtab[j] = ran;
		}
		
		Long tidFørSet = System.currentTimeMillis();
		for (int o = 0; o<9999; o++) {
			set.contains(randomtab[o]);
		}
		Long tidEtterSet = System.currentTimeMillis();
		Long totalTidSet = tidEtterSet-tidFørSet;
		
		System.out.println(totalTidSet);
		
		Long tidFørTab = System.currentTimeMillis();
		for (int p = 0; p<9999; p++) {
			
			java.util.Arrays.binarySearch(tab, randomtab[p]);
		}
		Long tidEtterTab = System.currentTimeMillis();
		Long totalTidTab = tidEtterTab-tidFørTab;
		
		System.out.println(totalTidTab);
		
	}

}
