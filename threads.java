class A extends Thread
{
     public void run()
          {
             for(int i=1;i<5;i++)
              {
	if(i==2) yield();
 	System.out.println("A:" +i);
              }
              System.out.println("Exit from A");
          }
}
