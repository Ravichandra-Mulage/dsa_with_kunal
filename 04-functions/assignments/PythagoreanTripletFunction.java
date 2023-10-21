package assignments;

class PythagoreanTripletFunction{
    static boolean pythaTriplet(int ar[], int n){
        for (int i = 0; i < n; i++) {
            int x = ar[i] * ar[i];
            for (int j = i +1; j < n; j++) {
                int y = ar[j]*ar[j];
                for (int k = j + 1; k < n; k++) {
                    int z = ar[k]*ar[k];
                        if( x == y + z || y == x + z || z == x + y){
                            return true;
                        }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int ar[] = { 3, 1, 4, 6, 5 };
        int ar_size = ar.length;
        if((pythaTriplet(ar,ar_size)) == true){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}