
public class SingletonTest {

	public static void main(String[] args) {
		Renban renbanA=Renban.getInstance();
		Renban renbanB=Renban.getInstance();

		System.out.println(renbanA.getNumber());
		System.out.println(renbanB.getNumber());
		System.out.println(renbanB.getNumber());
		System.out.println(renbanA.getNumber());
		System.out.println(renbanB.getNumber());


	}

}

class Renban{
	private static Renban renban=new Renban();
	private int g_SeizouNum;

	private Renban(){
		g_SeizouNum=0;
	}

	public String getNumber() {
		g_SeizouNum++;
		String t_str=String.format("%04d", g_SeizouNum);
		return t_str;
	}

	public static Renban getInstance() {
		return renban;
	}

}
