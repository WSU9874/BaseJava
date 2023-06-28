package Pr4;

public class P16 {
	
	public static void main(String[] args) {
	int il;
	double iD;
	
	il = 10/3;
	iD = 10/3.0;
	
	if (il == iD) System.out.println("equal");
	else System.out.printf("Not equal[%f][%f]\n", (double)il, iD);
	
	if (iD == 3.333333) System.out.println("equal");
	else System.out.printf("Not equals[3.333333][%f]\n", iD);
	
	iD = (int)iD;
	if (il == iD) System.out.println("equal\n");
	else System.out.println("Not equal[%f]");
	
	}
}