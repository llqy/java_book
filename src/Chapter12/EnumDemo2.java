package Chapter12;

//listing 2
//Use the built-in enumeration methods. 

//An enumeration of apple varieties. 
enum Apple22 {
	Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

class EnumDemo2 {
	public static void main(String args[]) {
		Apple22 ap;

		System.out.println("Here are all Apple constants");

		// use values()
		Apple22 allapples[] = Apple22.values();
		for (Apple22 a : allapples)
			System.out.println(a);

		System.out.println();

		// use valueOf()
		ap = Apple22.valueOf("Winesap");
		System.out.println("ap contains " + ap);

	}
}