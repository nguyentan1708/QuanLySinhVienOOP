package github.nguyentan1708;

import java.util.regex.*;

public class CheckValid {
	public static boolean isValidNumberPhone(String s) {
		Pattern p = Pattern.compile("^\\d{10}$");
        Matcher m = p.matcher(s);
        return (m.matches());
	}
	public static boolean isValidIDStudent(String s) {
		Pattern p = Pattern.compile("^\\d{8}$");
        Matcher m = p.matcher(s);
        return (m.matches());
	}
}
