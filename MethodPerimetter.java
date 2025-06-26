public class MethodPerimetter {
    //static method
    static void myStaticMethod(int a,double b){
        System.out.println(a + " : " + b);
    }
    //public method
    public void myPublicMethod(String fname , String lname){
        String fullname = fname +" " + lname;
        System.out.println(fullname);
    }
    //main method
    public static void main(String[] args){
        myStaticMethod(20,5.7);
        //call public method
        MethodPerimetter myObj = new MethodPerimetter();
        myObj.myPublicMethod("zainav","parveen");
    }
}
