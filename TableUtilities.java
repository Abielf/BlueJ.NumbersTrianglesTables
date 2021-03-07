 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
                int counter = tableSize;
        int i=1;
        int multiplyby=1;
        
        String total="";
        while(counter>0){
            while(i<=tableSize){
                if((multiplyby*i)<10){total=total.concat("  ");
            }else if((multiplyby*i)<100){total=total.concat(" ");}
            total=total.concat((multiplyby*i)+" |");
            i++;
        }
        total=total.concat("\n");
            counter--;
            multiplyby++;
            i=1;
        }
        return total;
    }
}
