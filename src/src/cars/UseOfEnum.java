package src.cars;

public enum UseOfEnum {
    January, February, March, April, May, June, July, August, September, October, November, December;


    public static void main(String[] args) {

        UseOfEnum monthOfYear = UseOfEnum.April;
        System.out.println(monthOfYear);

         if (monthOfYear==April){
             System.out.println("This is:"+monthOfYear);
         }else{
             System.out.println("This is not:"+monthOfYear);
         }
    }


    }