package com.xlc.principle.inversion.improve;

public class DependecyInversion {

    public static void main(String[] args) {
//        Person person = new Person();
//        person.receive(new Email());
//        person.receive(new WeiXin());

//        ChangHong changHong = new ChangHong();
//        OpenAndClose openAndClose = new OpenAndClose(changHong);
//        openAndClose.open();
/*
          ChangHong changHong = new ChangHong();
          OpenAndClose openAndClose = new OpenAndClose();
          openAndClose.setTv(changHong);
          openAndClose.open();

*/

    }

/*
    interface IReceiver {
        public String getInfo();
    }

    class Email implements IReceiver {
        public String getInfo() {
            return "电子邮件消息:hello world";
        }
    }

    class WeiXin implements IReceiver {
        @Override
        public String getInfo() {
            return "微信消息:hello world";
        }
    }


    class Person {

        public void receive(IReceiver receiver) {
            System.out.println(receiver.getInfo());
        }


    }
}*/

/*// 方式一: 通过接口传递实现依赖
       interface IOpenAndClose {
            public void open(ITV tv);
        }

        interface ITV {
            public void play();
        }

        class ChangHong implements ITV {
            @Override
            public void play() {
                System.out.println("长虹电视");
            }
        }

        class OpenAndClose implements IOpenAndClose {
            @Override
            public void open(ITV tv) {
                tv.play();
            }
        }*/


/*
// 方式二：通过构造方式传递依赖
interface IOpenAndClose{
    public void open();
}

interface ITV{
    public void play();
}

class OpenAndClose implements IOpenAndClose{

    public ITV tv;

    public OpenAndClose(ITV tv) {
        this.tv = tv;
    }

    @Override
    public void open() {
        this.tv.play();
    }
}
*/

// 方式三:

interface IOpenAndClose{
    public void open();
    public void setTv(ITV tv);
}

interface ITV{
    public void play();
}

class OpenAndClose implements IOpenAndClose{

    private ITV tv;

    @Override
    public void open() {
        this.tv =tv;
    }

    @Override
    public void setTv(ITV tv) {
        this.tv =tv;
    }
}

class ChangHong implements ITV{

    @Override
    public void play() {
        System.out.println("长虹电视,打开");
    }
}


}


