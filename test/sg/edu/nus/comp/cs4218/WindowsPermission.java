package sg.edu.nus.comp.cs4218;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclEntryPermission;
import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.AclEntry.Builder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * The WindowsPermission utility class provides some convenience methods for
 * changing the permissions of files and directories on the Windows operating
 * system.
 * 
 * <p>
 * As the setReadable and setExecutable Java methods do not work on Windows, it
 * complicates testing on Windows. However, Windows does actually provide the
 * relevant permissions, but this is provided though access control lists
 * instead of POSIX-style permissions.
 * </p>
 * 
 * <p>
 * This class thus provides methods to add or remove the relevant permissions
 * from the ACL easily.
 * </p>
 */
public final class WindowsPermission {

	/**
	 * Private constructor for this utility class
	 */
	private WindowsPermission() {
		// Don't need to have constructor for this utility class
	}

	/**
	 * Sets or removes the specified permission on the file or directory
	 * provided.
	 * 
	 * @param path
	 *            The path to the file or directory.
	 * @param aclPermission
	 *            The permission to add or remove
	 * @param setAttr
	 *            True to add the permission, false to remove
	 * @throws IOException
	 *             If I/O exception occurs, e.g. if path does not exist or not
	 *             enough permissions to set/remove the permission.
	 */
	public static void setPermission(Path path,
			AclEntryPermission aclPermission, boolean setAttr)
			throws IOException {
		// Inspired by
		// http://stackoverflow.com/questions/664432/how-do-i-programmatically-change-file-permissions

		AclFileAttributeView aclAttr = Files.getFileAttributeView(path,
				AclFileAttributeView.class);
		List<AclEntry> newAclAttr = new ArrayList<AclEntry>();

		for (AclEntry aclEntry : aclAttr.getAcl()) {
			Builder modifiedAclEntry = AclEntry.newBuilder(aclEntry);
			Set<AclEntryPermission> modifiedPerms = aclEntry.permissions();
			if (setAttr) {
				modifiedPerms.add(aclPermission);
			} else {
				modifiedPerms.remove(aclPermission);
			}
			if (!modifiedPerms.isEmpty()) { // Not sure why, but sometimes the
											// permissions set is empty
				modifiedAclEntry.setPermissions(modifiedPerms);
			}
			newAclAttr.add(modifiedAclEntry.build());
		}

		aclAttr.setAcl(newAclAttr);
	}

	/**
	 * Sets or removes READ_DATA permission on the file or directory provided.
	 * If a directory is specified, this method sets or removes the ability to
	 * list the contents of the directory.
	 * 
	 * @param path
	 *            The path to the file or directory.
	 * @param readable
	 *            True if to make the path readable, false to remove the
	 *            permission to read it.
	 * @throws IOException
	 *             If I/O exception occurs, e.g. if path does not exist or not
	 *             enough permissions to set/remove the permission.
	 */
	public static void setReadable(Path path, boolean readable)
			throws IOException {
		setPermission(path, AclEntryPermission.READ_DATA, readable);
	}

	/**
	 * Sets or removes WRITE_DATA permission on the file or directory provided.
	 * If a directory is specified, this method sets or removes the ability to
	 * add a file to the directory.
	 * 
	 * @param path
	 *            The path to the file or directory.
	 * @param readable
	 *            True if to make the path writable, false to remove the
	 *            permission to write.
	 * @throws IOException
	 *             If I/O exception occurs, e.g. if path does not exist or not
	 *             enough permissions to set/remove the permission.
	 */
	public static void setWritable(Path path, boolean writable)
			throws IOException {
		setPermission(path, AclEntryPermission.WRITE_DATA, writable);
	}

	/**
	 * Sets or removes EXECUTE permission on the file or directory provided. If
	 * a directory is specified, this method sets or removes the ability to
	 * <code>cd</code> into the directory.
	 * 
	 * @param path
	 *            The path to the file or directory.
	 * @param readable
	 *            True if to make the path executable, false to remove the
	 *            permission to execute.
	 * @throws IOException
	 *             If I/O exception occurs, e.g. if path does not exist or not
	 *             enough permissions to set/remove the permission.
	 */
	public static void setExecutable(Path path, boolean executable)
			throws IOException {
		setPermission(path, AclEntryPermission.EXECUTE, executable);
	}

	/**
	 * Sets or removes READ_DATA permission on the file or directory provided.
	 * If a directory is specified, this method sets or removes the ability to
	 * list the contents of the directory.
	 * 
	 * @param path
	 *            The path to the file or directory.
	 * @param readable
	 *            True if to make the path readable, false to remove the
	 *            permission to read it.
	 * @throws IOException
	 *             If I/O exception occurs, e.g. if path does not exist or not
	 *             enough permissions to set/remove the permission.
	 */
	public static void setReadable(File file, boolean readable)
			throws IOException {
		setReadable(file.toPath(), readable);
	}

	/**
	 * Sets or removes WRITE_DATA permission on the file or directory provided.
	 * If a directory is specified, this method sets or removes the ability to
	 * add a file to the directory.
	 * 
	 * @param path
	 *            The path to the file or directory.
	 * @param readable
	 *            True if to make the path writable, false to remove the
	 *            permission to write.
	 * @throws IOException
	 *             If I/O exception occurs, e.g. if path does not exist or not
	 *             enough permissions to set/remove the permission.
	 */
	public static void setWritable(File file, boolean writable)
			throws IOException {
		setWritable(file.toPath(), writable);
	}

	/**
	 * Sets or removes EXECUTE permission on the file or directory provided. If
	 * a directory is specified, this method sets or removes the ability to
	 * <code>cd</code> into the directory.
	 * 
	 * @param path
	 *            The path to the file or directory.
	 * @param readable
	 *            True if to make the path executable, false to remove the
	 *            permission to execute.
	 * @throws IOException
	 *             If I/O exception occurs, e.g. if path does not exist or not
	 *             enough permissions to set/remove the permission.
	 */
	public static void setExecutable(File file, boolean executable)
			throws IOException {
		setExecutable(file.toPath(), executable);
	}

	/**
	 * Sets or removes READ_DATA permission on the file or directory provided.
	 * If a directory is specified, this method sets or removes the ability to
	 * list the contents of the directory.
	 * 
	 * @param path
	 *            The path to the file or directory.
	 * @param readable
	 *            True if to make the path readable, false to remove the
	 *            permission to read it.
	 * @throws IOException
	 *             If I/O exception occurs, e.g. if path does not exist or not
	 *             enough permissions to set/remove the permission.
	 */
	public static void setReadable(String str, boolean readable)
			throws IOException {
		setReadable(FileSystems.getDefault().getPath(str), readable);
	}

	/**
	 * Sets or removes WRITE_DATA permission on the file or directory provided.
	 * If a directory is specified, this method sets or removes the ability to
	 * add a file to the directory.
	 * 
	 * @param path
	 *            The path to the file or directory.
	 * @param readable
	 *            True if to make the path writable, false to remove the
	 *            permission to write.
	 * @throws IOException
	 *             If I/O exception occurs, e.g. if path does not exist or not
	 *             enough permissions to set/remove the permission.
	 */
	public static void setWritable(String str, boolean writable)
			throws IOException {
		setWritable(FileSystems.getDefault().getPath(str), writable);
	}

	/**
	 * Sets or removes EXECUTE permission on the file or directory provided. If
	 * a directory is specified, this method sets or removes the ability to
	 * <code>cd</code> into the directory.
	 * 
	 * @param path
	 *            The path to the file or directory.
	 * @param readable
	 *            True if to make the path executable, false to remove the
	 *            permission to execute.
	 * @throws IOException
	 *             If I/O exception occurs, e.g. if path does not exist or not
	 *             enough permissions to set/remove the permission.
	 */
	public static void setExecutable(String str, boolean executable)
			throws IOException {
		setExecutable(FileSystems.getDefault().getPath(str), executable);
	}

}
