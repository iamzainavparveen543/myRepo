public class ClassOverlodding {
    static void myMethod(int a,int b){
        System.out.println("a + b = " + a +" : "+ b);
    }
    static void myMethod(double x , double y){
        System.out.println("x + y = " + x + " : "+ y);
    }
    public void myMethod( String fname, String lname){
        System.out.println("fullname : " + fname + "  "+ lname);
    }
    public void myMethod(String a , int b  ){
        System.out.println(a + " : " + b);
    }
    //main method
    public static void main(String[] args){
        myMethod(5 , 8);
        myMethod(33.5,20.4);
        ClassOverlodding myObj = new ClassOverlodding();
            myObj . myMethod("zainav" ,"parveen");
            myObj.myMethod("3" ,5);
    }

}
