import java.lang.*;
import java.io.*;

import GameObject.*;

public class Game {
	private Map _map;
	BufferedReader br;

	public void save() {
	
	}

	public void load() {
		
	}

	public void play() {

	}

	public static void main() {
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Welcome\nSelect an option");
			System.out.println("1. Create new character");
			System.out.println("2. Load previous character");
			String opt = br.readline();
		} catch (IOExcepton e) {
			e.printStackTrace();
		} finally {
			System.exit(0);
		}
	}	
}
