package sg.edu.nus.comp.cs4218;

public final class OSCheck {
	
	private OSCheck(){
		// Don't need to have constructor for this utility class
	}
	
	public static boolean isWindows(){
		if (System.getProperty("os.name").startsWith("Windows")) {
			return true;
		}
		return false;
	}
	
	public static boolean isMac(){
		if (System.getProperty("os.name").startsWith("Mac OS X")) {
			return true;
		}
		return false;
	}
	
	public static boolean isLinux(){
		if (System.getProperty("os.name").startsWith("Linux")) {
			return true;
		}
		return false;
	}
}
