package ra;

public class MyThread extends Thread{


    public MyThread(String name) {
        super(name);
    }

    public void run(){
        //Cong viec ma thread thuc hien
        int cnt = (int)(Math.random()*10);
        System.out.println("Xin chao cac ban lop Java-"+cnt);
    }
}
