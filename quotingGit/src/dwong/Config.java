package dwong;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Config {
	static Properties prop;
	private static String appRoot = "";
	
	public Config() {
		prop = new Properties();
		loadConfig();
	}

	public static String get(String s) {
		String pro = prop.getProperty(s);
		if(pro.substring(0,1).equals("~")){
			pro = appRoot + pro.substring(1);
			//System.out.println("property: " + pro);
		}
		return pro;
	}

	private void loadConfig() {
		//File f = new File("/home/paul/workspace/dwong5/src/file/dwongConfig");
		
		File f = new File("/home/paul/git/quotingGit/quotingGit/src/file/dwongConfig");
		
		/*
		JFileChooser fc = new JFileChooser(f);
		fc.showOpenDialog(null);
		f = fc.getSelectedFile();
		if (f == null) {
			System.exit(0);
		}
		*/
		try {
			prop.load(new FileInputStream(f));
			appRoot = prop.getProperty("appRoot");
			
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Archivo de configuracion no encontrado /n" );
			System.out.println("Config Error, Configuration file not found");
			System.exit(0);
		}
	}


}
