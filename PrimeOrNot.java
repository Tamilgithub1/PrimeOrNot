import java.util.*;
public class wifi{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int c=0;
		for(int i=1;i<=N;i++){
			if(N%i==0)
				c++;
		}
		if(c==2)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
