package datastructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baek_1920_Search {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int datasize = Integer.parseInt(br.readLine());
		int[] dataarr = new int[datasize];
		String dataline = br.readLine();
		String[] stringarr = dataline.split(" ");
		for(int i=0; i<datasize; i++) {
			dataarr[i] = Integer.parseInt(stringarr[i]);
		}
			Arrays.sort(dataarr);
			int searchSize = Integer.parseInt(br.readLine());
			String searchline = br.readLine();
			String[] searchValueArr = searchline.split(" ");
			for(String searchValue:searchValueArr) {
				System.out.println(search(dataarr, Integer.parseInt(searchValue)));
			}
		}
		public static int search(int[] arr,int searchValue) {
			
		int searchIndex =0;
		int startIndex = 0;
		int endIndex = arr.length-1;
		int mediumIndex = 0;
		while(startIndex<=endIndex) {
			mediumIndex = (startIndex+endIndex)/2;
			System.out.println(startIndex+","+mediumIndex+","+endIndex);
			if(arr[mediumIndex]== searchValue) {
				searchIndex = 1;
				break;
			}else if(arr[mediumIndex]>searchValue) {
				endIndex = mediumIndex -1;
			}else {
				startIndex = mediumIndex +1;
			}
		}
		
		return searchIndex;
	}

	}


