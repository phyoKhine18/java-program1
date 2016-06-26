
import java.security.SecureRandom;
public class mega {
	public static void main(String[] args) {
		int n1, n2, n3, n4, n5;
		int n;
		SecureRandom generator = new SecureRandom();
		n1 = generator.nextInt(75) + 1;
		n2 = generator.nextInt(75) + 1;
		n3 = generator.nextInt(75) + 1;
		n4 = generator.nextInt(75) + 1;
		n5 = generator.nextInt(75) + 1;
		n = generator.nextInt(15) +1;
 System.out.println(n1 + "\n" + n2 +"\n" + n3 + "\n"+ n4 +"\n"+ n5 + "\n"+ n + "\n");
 
 		int nn, mm, uu;
 		nn = generator.nextInt(10) ;
 		mm = generator.nextInt(10) ;
 		uu = generator.nextInt(10) ;
 		System.out.println(nn + "\n" + mm + "\n" + uu); 
	}
}