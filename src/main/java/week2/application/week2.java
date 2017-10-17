package week2.application;

import week2.services.randomService;

public class week2 {
    public static  void  main(String[] args){
        long begin = System.nanoTime();
        randomService.generateRandomArrary();
        long end = System.nanoTime();
        System.out.print("耗时" + (end - begin) + "纳秒");
    }
}
