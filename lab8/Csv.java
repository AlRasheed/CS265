import java.io.*;
import java.util.*;

public class Csv {
	public Csv(String file, String sep) {
		fieldsep = sep;
		input = new BufferedReader(new FileReader(input));
	}
	public String getline() {
		String c="";
		line = input.readLine();
		if(line==null)
			return line;

		field = split(line, fieldsep);
		return line;
	}
	public String getfield(int n) {
		if (n < 0 || n >= nfield)
			return "";
		else
			return (String)field.get(n);
	}
	public int getnfield() {
		return field.size();
	}

	private BufferedReader input ;
	private String line;
	private ArrayList field = null;
	private int nfield;
	private String fieldsep;
	private static ArrayList split(String line, String sep){
		String fld="";
		ArrayList list = new ArrayList();
		int i, j;

		if (line.length() == 0)
			return list;
		i = 0;

		do {
			if (i < line.length() && line.charAt(i) == '"'){
				StringBuffer field = new StringBuffer();
				j = advquoted(line, ++i, sep, field);
				list.add(field.toString());
			}
			else{
				j = line.indexOf(sep, i);
				if (j==-1) {
					j=line.length();
				}
				list.add(line.substring(i,j));
			}
			i=j+sep.length();
		} while (j < line.length());

		return list;
	}
	private static int advquoted(String s, int i, String sep, StringBuffer field){
		int j;

		for (j = i; j < s.length(); j++) {
			if (s.charAt(j) == '"' && s.charAt(++j) != '"') {
				int k = s.indexOf(sep, j);
				if (k == -1)
					k = s.length();
				field.append(s.substring(j,k));
				j=k;
				break;
			}
			field.append(s.charAt(j));
		}
		return j;
	}


	public static void main(String arg[]) {//throws IOException {
		if(arg.length < 1) {
			System.out.print("Please provide a filename as an argument.\n");
			System.exit(0);
		}
			
		String file = arg[0];
		String line="";

		Csv csvfile = new Csv(file,",");

		while((line = csvfile.getline()) != null) {
			System.out.print("line = `" + line + "'\n");
			for(int i = 0; i<csvfile.getnfield(); i++)
				System.out.print("field[" + i + "] = `" + csvfile.getfield(i) + "'\n");
		}
	}
}
