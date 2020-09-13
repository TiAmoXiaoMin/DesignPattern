package com.xlc.prototype.deepclone;

public class Client {
    public static void main(String[] args) throws Exception{
        DeepProtoType d = new DeepProtoType();
        d.setName("张三");
        d.setDeepCloneableTarget(new DeepCloneableTarget("李四","lisi"));

        //1.使用clone克隆
       // DeepProtoType deepProtoType = (DeepProtoType)d.clone();

        //System.out.println(d.getName()+"d.hashcode:"+d.getDeepCloneableTarget().hashCode());
       // System.out.println(deepProtoType.getName()+"deepProtoType.hashcode:"+deepProtoType.getDeepCloneableTarget().hashCode());

        //2.通过对象的序列化实现
        DeepProtoType deepProtoType = (DeepProtoType)d.deepClone();

        System.out.println(d.getName()+"d.hashcode:"+d.getDeepCloneableTarget().hashCode());
        System.out.println(deepProtoType.getName()+"deepProtoType.hashcode:"+deepProtoType.getDeepCloneableTarget().hashCode());
    }
}
