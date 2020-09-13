package com.xlc.prototype.deepclone;





import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.*;

public class DeepProtoType implements Serializable,Cloneable {

    private String name;
    private DeepCloneableTarget deepCloneableTarget;

    public DeepProtoType() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeepCloneableTarget getDeepCloneableTarget() {
        return deepCloneableTarget;
    }

    public void setDeepCloneableTarget(DeepCloneableTarget deepCloneableTarget) {
        this.deepCloneableTarget = deepCloneableTarget;
    }

    //第一种方式: 使用clone深拷贝
    @Override
    protected Object clone() throws CloneNotSupportedException {

       Object deep = null;
       deep = super.clone();

       DeepProtoType deepProtoType = (DeepProtoType)deep;
       deepProtoType.deepCloneableTarget = (DeepCloneableTarget)deepCloneableTarget.clone();
        return deep;
    }


    //第二种方式: 通过对象的序列化实现
    public Object deepClone(){
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        ByteArrayOutputStream bos =null;
        ObjectOutputStream oos = null;
        DeepProtoType deepProtoType = null;
        try {

            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            deepProtoType = (DeepProtoType) ois.readObject();

            return deepProtoType;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            try {
                bis.close();
                ois.close();
                bos.close();
                oos.close();
            }catch (Exception e2){
                System.out.println(e2.getMessage());
            }
        }



    }
}
