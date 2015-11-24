public class Anag {
	public void anag(String s1, String s2)	{
		if(s1.length() == 0)	{
			System.out.println(s2);
		}
		for(int i = 0; i < s1.length(); i++)	{
			System.out.println("first Substring: \t"+s1.substring(0, i)+ "Second one: \t" + s1.substring(i+1, s1.length())+"\t S1 chart at \t"+s1.charAt(i) +"\t S2 \t"+s2);
			anag(s1.substring(0, i) + s1.substring(i+1, s1.length()), s1.charAt(i) + s2);
			//anag(tie,t+"")
		}
	}

	public static void main(String[] args)	{
		Anag ana = new Anag();
		ana.anag("tie", "");
	}
}