package hashCode;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class hashCode {
	private static final String PATH = "C://Users/gabriell.thurnher/Desktop/Stage/Jour 4/hashCode/";
	private static final char PAINT = '#';
	private static final char BLANK = '.';
	private static int nbcoup = 0;
	public static void main(String[] args) {
		
		char[][] tab = ReadInput(PATH + "logo.in");
		
		char[][] tabTest = new char[14][80];
		
		for(int i = 0; i < tabTest.length; i++) {
			for (int j = 0; j < 80; j++) {
				tabTest[i][j] = BLANK;
			}
		}
		

//		paintSquare(2,65,1,tabTest);
//		paintLine(1,1,4,1,tabTest);
//		eraseCell(2,2,tab);

		
// 		draws G (max 15) here 14
		paintLine(0,8,0,12,tabTest);
		paintLine(1,4,1,15,tabTest);
		paintLine(2,2,2,5,tabTest);
		paintLine(2,14,2,15,tabTest);
		paintSquare(4,2,1,tabTest);
		paintSquare(5,1,1,tabTest);
		eraseCell(5,3,tabTest);
		paintLine(7,1,7,3,tabTest);
		paintLine(8,2,8,5,tabTest);
		paintLine(9,4,9,16,tabTest);
		paintLine(8,14,8,17,tabTest);
		paintLine(5,10,5,15,tabTest);
		paintSquare(6,17,1,tabTest);
		paintLine(5,19,6,19,tabTest);
// 		draws o (max 10) here 9	
		paintLine(4,24,4,30,tabTest);
		paintLine(5,22,5,25,tabTest);
		paintLine(5,29,5,32,tabTest);
		paintSquare(7,22,1,tabTest);
		paintSquare(8,24,0,tabTest);
		paintLine(9,22,9,31,tabTest);
		paintLine(8,30,8,32,tabTest);
		paintLine(7,31,7,33,tabTest);
		paintLine(6,30,6,33,tabTest);
// 		draws o (max 10) here 9	
		paintLine(4,38,4,44,tabTest);
		paintLine(5,36,5,39,tabTest);
		paintLine(5,43,5,46,tabTest);
		paintSquare(7,46,1,tabTest);
		paintSquare(8,44,0,tabTest);
		paintLine(9,37,9,46,tabTest);
		paintLine(8,36,8,38,tabTest);
		paintLine(7,35,7,37,tabTest);
		paintLine(6,35,6,38,tabTest);
// 		draws g (max 15) here 12
		paintLine(4,52,4,61,tabTest);
		paintLine(5,51,5,54,tabTest);
		paintLine(5,57,5,61,tabTest);
		paintSquare(7,60,1,tabTest);
		paintSquare(10,60,1,tabTest);
		paintSquare(7,51,1,tabTest);
		eraseCell(7,52,tabTest);
		paintLine(9,51,9,58,tabTest);
		paintSquare(11,58,0,tabTest);
		paintLine(11,50,11,52,tabTest);
		paintLine(12,51,12,59,tabTest);
		paintLine(13,54,13,56,tabTest);
//		draws l (max 9) here 3		
		paintLine(1,64,9,64,tabTest);
		paintLine(1,65,9,65,tabTest);
		paintLine(1,66,9,66,tabTest);		
// 		draws e (max 9) here 9
		paintLine(4,71,4,76,tabTest);
		paintLine(5,69,5,72,tabTest);
		paintLine(5,75,5,78,tabTest);
		paintLine(6,68,6,70,tabTest);
		paintLine(6,74,6,79,tabTest);
		paintLine(7,68,7,74,tabTest);
		paintLine(8,68,8,71,tabTest);
		paintSquare(8,77,0,tabTest);
		paintLine(9,70,9,78,tabTest);
//		prints everything and compares the arrays
		printTab(tab);
		System.out.println();
		printTab(tabTest);
		System.out.println();
		
		if (compare(tab, tabTest)==true) {
			System.out.println("Vrai");
		}
		else  {
			System.out.println("Faux");
		}
		
		
//		for(int i = 0; i < tab.length; i++) {
//		for (int j = 0; j < 80; j++) {
//			System.out.print(tab[i][j]);
//		}
//		System.out.println();
//		}
//	
//		System.out.println();		
//		for(int i = 0; i < tabTest.length; i++) {
//			for (int j = 0; j < 80; j++) {
//				System.out.print(tabTest[i][j]);
//			}
//			System.out.println();
//		}
		
		
	}

	//reads doc logo.in
    private static char[][] ReadInput(String fileName)
    {     
          char[][] res=null;
         
          try
          {     
                 InputStream ips=new FileInputStream(fileName);
                 InputStreamReader ipsr=new InputStreamReader(ips);
                 BufferedReader br=new BufferedReader(ipsr);
                 String ligne;
                 ligne=br.readLine();
                 if(ligne != null)
                 {
                        String[] xy = ligne.split(" ");
                        int nbLigne = Integer.parseInt(xy[0]);
                        int nbColonne = Integer.parseInt(xy[1]);
                        res = new char[nbLigne][nbColonne];
                       
                        int m = 0;
                        while ((ligne=br.readLine())!=null){
                               for(int i=0 ; i<nbColonne ; i++)
                               {
                                     res[m][i] = ligne.charAt(i);
                               }
                               m++;
                        }
                 }

                 br.close();
          }            
          catch (Exception e){
                 System.out.println(e.toString());
          }
         
          return res;
    }
    
    //prints a 2D array
    private static void printTab(char[][] tabs) {
    	for (int i =0; i<tabs.length;i++) {
    		System.out.println(tabs[i]);
    	}
    	System.out.println("nbcoup=" + nbcoup);
    }
    
    //compares two char arrays
    private static boolean compare(char[][] tab, char[][]tab2) {
    	for (int i=0; i<tab.length;i++) {
    		for (int j=0; j<tab[0].length;j++) {
    			if (tab[i][j]!=tab2[i][j]) {
    				System.out.println("Erreur à:" + i + "|"+ j);
    				return false;
    			}
    		}
    	}
    	
    	return true;
//    	if (Arrays.equals(tab, tab2)) {
//    		System.out.println("Les deux tableaux sont identiques.");
//    	}
//    	else {
//    		System.out.println("Faux");
//    	}
    	
    }
    
    //paints a square
    public static char[][] paintSquare(int R, int C, int S, char[][] tab) {
    	nbcoup++;
    	//char[][] square = null;
    	
    	if (S == 0) {
    		tab[R][C] = PAINT;
    	}
    	else {
    	R = R - S;
    	C = C - S;
    	S = (2 * S) + 1;
    	
    	//square = new char[S][S];
    	
		for(int i = R; i < (R+S); i++) {
			for (int j = C; j < (C+S); j++) {
				tab[i][j] = PAINT;
				}
			}
    	}
    	return tab;
    	//return square;
    }
    
    
    public static char[][] paintLine(int R1, int C1, int R2, int C2, char[][] tab) {
    	nbcoup++;
    	
    	/*
    	if (R1==R2) {
    		for(int i=C1; i <= C2; i++) {
    			tab[R1][i] = PAINT;
    		}
    	} 
    	else if(C1==C2) {
    		for(int i=R1; i<=R2; i++) {
    			tab[i][C1] = PAINT;
    		}
    	}
    	*/
    	
    	if(tab.length<1) return null;
    	
    	R1 = Math.max(0,R1);
    	R1 = Math.min(tab.length,R1);
    	C1 = Math.max(0, C1);
    	C1 = Math.min(tab[0].length, C1);
    	
    	
    	
    	for(int i=R1 ; i<=R2 ; i++) {
    		for(int j=C1 ; j<=C2 ; j++) {
    			tab[i][j] = PAINT;
    		}
    	}
    	
    	return tab;
    }
    
    public static char[][] eraseCell(int R, int C, char[][] tab) {
    	nbcoup++;
    	
    	tab[R][C] = BLANK; 	
    	return tab;
    }

}
