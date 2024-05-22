package datastructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Baek_2164_Queue {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> queue = new LinkedList<>();
		int count = Integer.parseInt(br.readLine());
		for(int i=1;i<=count;i++) {
			queue.offer(i);
		}
		//System.out.println(Arrays.toString(queue.toArray()));
		while(queue.size()>1) {
			queue.poll();
			int data = queue.poll();
			//System.out.println(data);
			queue.add(data);
		}
		System.out.println(queue.peek());
	}

}
