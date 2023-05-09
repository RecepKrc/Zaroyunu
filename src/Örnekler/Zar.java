package Örnekler;
import java.util.*;

public class Zar {

	public static void main(String[] args) {
	int zar1,zar2,oyuncu1,oyuncu2,b,sayac=0;
	char s='d';
	Scanner al=new Scanner(System.in);
	System.out.println("1. oyuncunun para miktarini girin.");
	oyuncu1=al.nextInt();
	System.out.println("2. oyuncunun para miktarini girin.");
	oyuncu2=al.nextInt();
	
	while (oyuncu1>0 && oyuncu2>0 && s=='d') {
		sayac++;
		System.out.println("Oyunda "+sayac+".inci turdasiniz.");
		zar1=(1+(int)(Math.random()*6));
		zar2=(1+(int)(Math.random()*6));
		System.out.println("1.oyuncunun attigi zar="+zar1);
		System.out.println("2.oyuncunun attigi zar="+zar2);
		if (zar2>zar1) {
			b=zar2-zar1;
			oyuncu1=oyuncu1-b;
			System.out.println("Zarlar arasındaki fark = "+b);
			System.out.println("1.oyuncunun kalan parasi="+oyuncu1);
			
		}
		else if (zar1>zar2) {
			b=zar1-zar2;
			oyuncu2=oyuncu2-b;
			System.out.println("Zarlar arasındaki fark = "+b);
			System.out.println("2.oyuncunun kalan parasi="+oyuncu2);
			
		}
		else {
			System.out.println("Zarlar ayni geldi tekrar atiniz. ");
			
		}
		if (oyuncu1<=0 || oyuncu2<=0) {
			break;
		}
		else {
			System.out.println("Tekrar zar atmak için d'ye basin.");
			s=al.next().charAt(0);
			
		}
	}
	if (oyuncu1<=0)
		System.out.println("2. oyuncu "+sayac+".inci turda kazandi.");
	else 
		System.out.println("1. oyuncu "+sayac+".inci turda kazandi.");
	
	}

}
