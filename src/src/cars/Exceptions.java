package src.cars;

public class Exceptions {

    public static void main(String[] args) {

        int a = 50;
        int b = 0;
        int c = 60;
        int d = 70;


        int mul= c*d;
        System.out.println(mul);

        try {
            int div =a/b;
            System.out.println(div);
        } catch (Exception m){
            System.out.println("Exception due to mathematical error");
        }

        length();

    }
        public static void length () {
            String name=null;
            try{
                int p = name.length();
                System.out.println(p);
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());

            }finally {
                name="Munna";
                System.out.println(name);
            }

        }



    }

