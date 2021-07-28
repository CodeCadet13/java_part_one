class MyClass {
     int x;

     MyClass(int i){
         x = i;
     }
}

class ParmConsDemo {
    public static void main(String[] args) {
        MyClass t1 = new MyClass(10);
        MyClass t2 = new MyClass(88);

        System.out.println(t1.x + " " + t2.x); // assign the object's value to the value of x
        // the value of x is from the parameter of the constructor of the class MyClass
        // the constructor has int i as the parameter, which is also initialized to the instance variable x
    }
}