package sg.edu.nus.comp.cs4218;

/**
 * The OSCheck utility class implements some helper methods for determining the
 * Operating System that the user is currently executing.
 */
public final class OSCheck {

	private OSCheck() {
		// Don't need to have constructor for this utility class
	}

	/**
	 * Checks if the current OS is Windows
	 * 
	 * @return true if the OS is Windows, false otherwise
	 */
	public static boolean isWindows() {
		if (System.getProperty("os.name").startsWith("Windows")) {
			return true;
		}
		return false;
	}

	/**
	 * Checks if the current OS is Mac OS X
	 * 
	 * @return true if the OS is Mac OS X, false otherwise
	 */
	public static boolean isMac() {
		if (System.getProperty("os.name").startsWith("Mac OS X")) {
			return true;
		}
		return false;
	}

	/**
	 * Checks if the current OS is Linux
	 * 
	 * @return true if the OS is Linux, false otherwise
	 */
	public static boolean isLinux() {
		if (System.getProperty("os.name").startsWith("Linux")) {
			return true;
		}
		return false;
	}

}
