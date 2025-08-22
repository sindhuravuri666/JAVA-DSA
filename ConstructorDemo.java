public class ConstructorDemo {
        int a;
        static int b = 10;

    ConstructorDemo(){
        int a = 9;
        int b = 10;
        System.out.println("this is from constructor class");
    }
    int summ(int x,int z){
        return x+z;

    }
    public static void main(String[] args) {
        ConstructorDemo d = new ConstructorDemo();
        int var = d.summ(1,2);
        System.out.println(var);
    
    }

        



    }

