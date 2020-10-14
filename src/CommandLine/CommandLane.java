package CommandLine;

import java.util.Scanner;

public class CommandLane {
	public String readString () {
		Scanner sc = new Scanner(System.in);
		String cadena= sc.next();
		sc.close();
		return cadena;
	}
	public int readInt() {
		Scanner sc = new Scanner(System.in);
		int entero= sc.nextInt();
		sc.close();
		return entero;
	}
	
	public double readDouble() {
	//Angel que tal??
		Scanner sc = new Scanner(System.in);
		double decimal= sc.nextDouble();
		sc.close();
		return decimal;
	}
}

