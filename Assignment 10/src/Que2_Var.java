//Scenario 1-var cannot be used in an instance and global variable declaration
//as we Cannot make a static reference to the non-static field x
/*class Demo3 {
  
    // instance variable
    var x = 50;
    public static void main(String[] args)
    {
        System.out.println(x);
    }
}
*/
/* Scenario 2-var cannot be used as a Generic type.
 * as it cannot be resolved into perticular type
 * class Demo4 {
    public static void main(String[] args)
    {
          // Generic list using var
        var<var> al = new ArrayList<>();
            
          // add elements
        al.add(10);
        al.add(20);
        al.add(30);
        
        // print the list
        System.out.println(al);
    }
}
 * 
 */
//Scenario 3-var cannot be used without explicit initialization.
/*as Cannot use 'var' on variable without initializer
	Duplicate local variable variable
	Cannot infer type for local variable initialized to 'null'
 * class Demo6 {
    public static void main(String[] args)
    {
  
        // declaration without
        // initialization
        var variable;
          
          // This is also not valid
        var variable = null;
    }
}
 */
/*Scenario 4- var cannot be used with Lambda Expression
 * var cannot be used since they require explicit target type
 * interface myInt {
    
    int add(int a, int b);
}
class Demo7 {
    public static void main(String[] args)
    {
        
          // var cannot be used since they
          // require explicit target type
        var obj = (a, b) -> (a + b);
  
          // calling add method
        System.out.println(obj.add(2, 3));
    }
}
 */
/*Scenario 5-var cannot be used for method parameters and return type
 * class Demo8 {
  
    // method1 using var
    // as a return type
    var method1() { return ("Inside Method1"); }
  
    // method2 using var for a
    // parameter
    void method2(var a) { System.out.println(a); }
  
    public static void main(String[] args)
    {
  
        // create an instance
        Demo1 obj = new Demo1();
  
        // call method1
        var res = obj.method1();
  
        // call method2
        obj.method2();
    }
}
 */
public class Que2_Var {
	public static void main(String[] args)
    {
		
    }
}
    
