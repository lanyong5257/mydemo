package designmode.prototype;

/**
 * @Author: lanyong_csd
 * @Create: 2020/1/6 14:05
 * @Company: Si-tech
 * @Description:奖状类克隆
 **/
public class ProtoTypeCitation {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation c1=new Citation("张三","获得三等奖学金","在大学");
        c1.display();
        Citation c2 = c1.clone();
        c2.setName("李四");
        c2.display();

    }
}
class Citation implements Cloneable {
    String name;
    String info;
    String college;

    public Citation(String name, String info, String college) {
        this.name = name;
        this.info = info;
        this.college = college;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public void display(){
        System.out.println(name+college+info);
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        System.out.println("拷贝成功");
        return (Citation)super.clone();
    }
}
