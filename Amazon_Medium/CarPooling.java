//  Problme statement: 


package DSA_Library.Amazon_Medium;

public class CarPooling {
    // method for car Pooling 
    public static Boolean carPooling(int trips[][], int capicity) {
        int m[] = new int[1001];
        for (int a[] : trips) {
            m[a[1]] += a[0];
            m[a[2]] -= a[0]; 
        }

        for (int i = 0; i < 1001 && capicity >= 0; i++) {
            capicity -= m[i];
        }
        return capicity >= 0;
    }

    public static void main(String[] args) {
        int trips[][] = {{2,1,5},{3,3,7}};
        System.out.println(carPooling(trips, 5));
    }
}