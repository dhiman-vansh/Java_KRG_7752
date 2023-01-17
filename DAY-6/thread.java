class table{
    void tables(int a) throws InterruptedException {
    synchronized (this){
    {
        for (int i = 0; i <10; i++) {
            System.out.println((i+1)*a);
            // wait(100);
            // Thread.sleep(500);
            Thread.yield();
        }
       }   }
}}
class mythread extends Thread{
    table t;
    int a;
    mythread(table t,int a)
    {
        this.t=t;
        this.a=a;
    }
    @Override
    public void run() {
        try {
            t.tables(a);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}


public class thread {
   
    public static void main(String[] args) {
        table t=new table();
        mythread t1=new mythread(t, 5);
        mythread t2=new mythread(t, 100);
        t1.start();
        t2.start();
    }
}