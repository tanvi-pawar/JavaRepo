import java.util.regex.*;
class RegexExample{
	public static void main(String[] args) {
		String str = "Java is PL \nJAVA is HLL \nIt Support Wora JAva";33
		
		Pattern pattern =Pattern.compile("^Java",Pattern.MULTILINE|Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(str);
		System.out.println(str);

		while(matcher.find()){
			System.out.println(matcher.group()+":"+matcher.start()+":"+matcher.end());
		}
	}
}