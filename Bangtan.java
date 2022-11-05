Public class Bangtan {
public static void main (String[] args) {
    for (int r = 1; r <= 4; r++){
        for (int t = 1; t <= r * 2 - 1; t++){
            System.out.print("*");
        }
            for (int y = 9; y >= 2 * r; y--){
                System.out.print(" ");
        }
           for (int u = 7; u >= 2 * r; u--){
               System.out.print(" ");
           }
           for (int j = 1; j <= r * 2 - 1; j++){
               System.out.print("*");
           }
           System.out.println();
    }
    System.out.println("*******  *******");
           for (int z = 1; z <= 4; z++){
               for (int x = 7;x >= 2 * z - 1; x--){
               System.out.print("*");
           }
              for (int k = 1; k <= 2 * z - 1; k++){
                  System.out.print(" ");
              }
              for (int h = 1; h <= 2 * z - 1 ; h++){
                  System.out.print(" ");
              }
              for ( int s = 7; s >= z * 2 - 1 ; s--){
               System.out.print("*");
           }
    System.out.println();
    }
}
}
