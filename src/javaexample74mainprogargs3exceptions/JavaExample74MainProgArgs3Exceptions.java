
package javaexample74mainprogargs3exceptions;


public class JavaExample74MainProgArgs3Exceptions {

    
    public static void main(String[] args) {
       try{
        System.out.println(args[6]);
       }catch(Exception e)
       {
           System.out.println(e.toString()+'\n'+e.getMessage());
       }
        
        
        
        
    }
    
}
