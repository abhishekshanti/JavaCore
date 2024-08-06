package AbstractClass;

abstract public class A {

    //abstract method
    abstract public void method1();

    //concrete method
    public void method2(){
        System.out.println("Concrete method");
    }

}

//Abstract Class
//-> multiple inheritance is not possible here
//-> cannot instantiate an object
//-> it can contain concrete, abstract or mixture of both i.e abstraction from 0-100%
//->
