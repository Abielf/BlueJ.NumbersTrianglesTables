 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        int counter = numberOfStars;
        String total="";
        while(counter>0){
            total=total.concat("*");
            counter--;
        }
        return total;
    }
    
    public static String getTriangle(int numberOfRows) {
        int counter = numberOfRows;
        int i=0;
        int j=1;
        String total="";
        while(counter>0){
            while(i<j){
            total=total.concat("*");
            i++;
        }
        total=total.concat("\n");
            counter--;
            i=0;
            j++;
        }
        return total;
    }


    public static String getSmallTriangle() {
        return getTriangle(4);
    }

    public static String getLargeTriangle() {
        return getTriangle(9);
    }
}
