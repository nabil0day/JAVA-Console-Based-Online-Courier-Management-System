public class Clear {
	
	public static void cls(){
		try {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		} catch (Exception e) {

		}
	}
}