package com.xlc.iterator;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        //创建学院
        ArrayList<Collage> collageArrayList = new ArrayList<>();

        ComputerCollage computerCollage = new ComputerCollage();
        InfoCollage infoCollage = new InfoCollage();

        collageArrayList.add(computerCollage);
       // collageArrayList.add(infoCollage);

        OutPutImpl outPut = new OutPutImpl(collageArrayList);
        outPut.printCollage();


    }
}
