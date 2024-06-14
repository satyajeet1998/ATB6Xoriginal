package EX250524_Exception;

public class lab01excep {
    public static void main(String[] args) {
        try {
            String sh=args[0];//oth position give different value
            int x=Integer.parseInt(sh);
            int a=10/x;//arithmaticexception
            System.out.println(x);//arayindexboundexception
            System.out.println(a);
        } catch (NumberFormatException e) {
            System.out.println("satya");
        }
    }   }
//take and what is the out put(use the edit option in 3 dot)
    //5
//no input-arrayindexboundexception
//-5
//satya-numberformatException
//3.5-numberformatException
//%#&^&-numberformatException
//Exception is an unexpected event which disruped the normal flow of the program it comes in the time of execution or run time
//if u dont handle then control pass to jvm n jvm will terminate the program so in order to maintain the normal flow we handle the exception by try n catch block
//try block is nothing but it contain the code which is the cause of exception and catch is nothing but it contains the code and handle the exception which tis provided by try block.
//in exception parent class is throwable n throwable is inherited from object
//exception vs error-exception occur due to program and error occurs cause of lack of system resource.(out of memory,assertion error)
//exception can be handled br progammer and error can handled
//two types of exception -checked and unchecked exception.
//compiletime exception--->ClassNotfoundException,NotSuchMethodException,InterruptedException,RemoteException/IOException---->
//Runtimeexception--->ArithmaticException,classcastException,nullpointerException,indexoutofboundException(arrayindexoutofboundexception,stringindexoutofboundexception),illegalargumentexception,numberformatexception
//unchecked exception is nothing but when we execute the programm n in runtime we found a exception called unchecked.n compiler ignore it.
//checked exception when we compile the code or the code which is checked by compiler in compile time and exception will come in run time called checked exception.