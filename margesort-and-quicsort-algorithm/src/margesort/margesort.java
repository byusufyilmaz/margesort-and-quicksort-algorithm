package margesort;

public class margesort {
		 
	    void birlestir(int dizi[], int sol, int orta, int sag)
	    {
	        int n1 = orta - sol + 1;
	        int n2 = sag - orta;
	 
	        // Create temp arrays
	        int SOL[] = new int[n1];
	        int SAG[] = new int[n2];
	        
	        for (int i = 0; i < n1; ++i)
	            SOL[i] = dizi[sol + i];
	        for (int j = 0; j < n2; ++j)
	            SAG[j] = dizi[orta + 1 + j];

	        int i = 0, j = 0;
	 
	        int k = sol;
	        while (i < n1 && j < n2) {
	            if (SOL[i] <= SAG[j]) {
	                dizi[k] = SOL[i];
	                i++;
	            }
	            else {
	                dizi[k] = SAG[j];
	                j++;
	            }
	            k++;
	        }
	        while (i < n1) {
	            dizi[k] = SOL[i];
	            i++;
	            k++;
	        }
	        while (j < n2) {
	            dizi[k] = SAG[j];
	            j++;
	            k++;
	        }
	    }
	    void sirala(int dizi[], int sol, int sag)
	    {
	        if (sol < sag) {
	            int orta = sol + (sag - sol) / 2;

	            sirala(dizi, sol, orta);
	            sirala(dizi, orta + 1, sag);
	            birlestir(dizi, sol, orta, sag);
	        }
	    }
	    static void diziYazdir(int dizi[])
	    {
	        int n = dizi.length;
	        for (int i = 0; i < n; ++i)
	            System.out.print(dizi[i] + " ");
	        System.out.println();
	    }	 
	    public static void main(String args[])
	    {
	        int dizi[] = { 12, 11, 13, 5, 6, 7 };
	 
	        System.out.println("Given array is");
	        diziYazdir(dizi);
	 
	        margesort ob = new margesort();
	        ob.sirala(dizi, 0, dizi.length - 1);
	 
	        System.out.println("\n s�ralanm�� dizi");
	        diziYazdir(dizi);
	    }
	}