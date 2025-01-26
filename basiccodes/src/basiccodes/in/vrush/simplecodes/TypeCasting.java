package basiccodes.in.vrush.simplecodes;

class TypeCasting {
    static void printData(float a, float b){
        System.out.println(a + ":" + b);
    }

    static void stringData(){
        String name = "ABC";
        Object obj = name;

        System.out.println((obj));
    }
    
    static void AssignmentOp(){
    	int i = 10;
    	System.out.println(i *= 10.2F);
//    	System.out.println(i = i * 10.2F);
    }
    
    static void unaryOp() {
    	int a = 5;
    	int b = 3;
//    	int result = b++ + b++ * a++;
//    	System.out.println(result);
//    	int result1 = b++ * b++;
//    	System.out.println(result1);
    	int result1 = a++ + ++b + (++a * b++);
    	System.out.println(result1);
    }
    
    static void shiftOp() {
//    	int result = 10 >> 1 || 4;
//    	System.out.println(result);
    	
    }
    
    static void ternaryOp() {
    	String msg = (10 > 7) ? "10 is greater" : "7 is greater";
    	System.out.println(msg);
    	String msg1 = (10 > 7) ? (10 > 8) ? true : false : (7 > 8) ? true : false;
    	System.out.println(msg1);
    	
    }
    
    public static void main(String[] args) {        
        printData((float)10.10, (float)10.20);
        stringData();
        AssignmentOp();
        unaryOp();
        shiftOp();
        ternaryOp();
    }    
}