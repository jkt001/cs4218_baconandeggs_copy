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

public final class WindowsPermission {
	
	private WindowsPermission(){
		// Don't need to have constructor for this utility class
	}
	
	public static void setPermission(Path path, AclEntryPermission aclPermission, boolean setAttr) throws IOException {
		// Inspired by http://stackoverflow.com/questions/664432/how-do-i-programmatically-change-file-permissions
		
		AclFileAttributeView aclAttr = Files.getFileAttributeView(path, AclFileAttributeView.class);
		List<AclEntry> newAclAttr = new ArrayList<AclEntry>();		
		
	    for(AclEntry aclEntry : aclAttr.getAcl()){
	    	Builder modifiedAclEntry = AclEntry.newBuilder(aclEntry);
	    	Set<AclEntryPermission> modifiedPerms = aclEntry.permissions();
	    	if (setAttr) {
	    		modifiedPerms.add(aclPermission);
	    	}else{
	    		modifiedPerms.remove(aclPermission);
	    	}
	    	modifiedAclEntry.setPermissions(modifiedPerms);
	    	newAclAttr.add(modifiedAclEntry.build());
	    }
	    
	    aclAttr.setAcl(newAclAttr);
	}
	
	public static void setReadable(Path path, boolean readable) throws IOException {
		setPermission(path, AclEntryPermission.READ_DATA, readable);
	}
	
	public static void setWritable(Path path, boolean writable) throws IOException {
		setPermission(path, AclEntryPermission.WRITE_DATA, writable);
	}
	
	public static void setExecutable(Path path, boolean executable) throws IOException {
		setPermission(path, AclEntryPermission.EXECUTE, executable);
	}
	
	public static void setReadable(File file, boolean readable) throws IOException {
		setReadable(file.toPath(), readable);
	}
	
	public static void setWritable(File file, boolean writable) throws IOException {
		setWritable(file.toPath(), writable);
	}
	
	public static void setExecutable(File file, boolean executable) throws IOException {
		setExecutable(file.toPath(), executable);
	}
	
	public static void setReadable(String str, boolean readable) throws IOException {
		setReadable(FileSystems.getDefault().getPath(str), readable);
	}
	
	public static void setWritable(String str, boolean writable) throws IOException {
		setWritable(FileSystems.getDefault().getPath(str), writable);
	}
	
	public static void setExecutable(String str, boolean executable) throws IOException {
		setExecutable(FileSystems.getDefault().getPath(str), executable);
	}


}
