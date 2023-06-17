class Multi extends Thread{
    public void run(){
        System.out.println("Name of running thread 1: " + Thread.currentThread().getName());
        System.out.println("Priority of running thread 1: " + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(1);
        Thread.currentThread().setName("Thread1");
        System.out.println("Changed name of running thread 1: " + Thread.currentThread().getName());
        System.out.println("Changed priority of running thread 1: " + Thread.currentThread().getPriority());
        System.out.println("Id of thread 1: " + Thread.currentThread().getId());
        for(int i=1;i<=5;i++)
        {
            System.out.println("Thread 1 is running ");
            
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
        
    }
}

class Multi2 implements Runnable{
    public void run(){
        System.out.println("Name of running thread 2: " + Thread.currentThread().getName());
        System.out.println("Priority of running thread 2: " + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        Thread.currentThread().setName("Thread2");
        System.out.println("Changed name of running thread 2: " + Thread.currentThread().getName());
        System.out.println("Changed priority of running thread 2: " + Thread.currentThread().getPriority());
        System.out.println("id of thread 2: " + Thread.currentThread().getId());
        for(int i=1;i<=5;i++)
        {
            System.out.println("Thread 2 is running ");
            
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}



public class Main
{
 public static void main(String[] args) {
 Multi t1=new Multi();
 t1.start();
 try{
   t1.join();
 }catch(Exception e)
 {
   System.out.println(e);
 }


Thread t2=new Thread(new Multi2());
t2.start();
try{
   t2.join();
}catch(Exception e)
{
   System.out.println(e);
}
try{
    Thread.yield();
}catch(Exception ex){}

System.out.println("End of main method");
 }
}