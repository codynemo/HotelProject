package src.hotel;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public abstract class Files_Handling {

	public static void DirectoryIntialization() throws IOException {
		String mydocpath = getdocpath();
		File f1 = new File(mydocpath + "\\Hotel System");
		if (!f1.exists()) {
			f1.mkdir();
		}
		f1 = new File(mydocpath + "\\Hotel System\\Rooms.txt");
		if (!f1.exists()) {
			f1.createNewFile();
		}
		f1 = new File(mydocpath + "\\Hotel System\\Employees.txt");
		if (!f1.exists()) {
			f1.createNewFile();
		}
		f1 = new File(mydocpath + "\\Hotel System\\Guests.txt");
		if (!f1.exists()) {
			f1.createNewFile();
		}
	}

	public static String getdocpath() {
		String myDocuments = null;
		try {
			Process p = Runtime
					.getRuntime()
					.exec("reg query \"HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\Shell Folders\" /v personal");
			p.waitFor();

			InputStream in = p.getInputStream();
			byte[] b = new byte[in.available()];
			in.read(b);
			in.close();

			myDocuments = new String(b);
			myDocuments = myDocuments.split("\\s\\s+")[4];

		} catch (Throwable t) {
			t.printStackTrace();
		}
		return myDocuments;
	}
}
