package designmode.prototype;

/**
 * @Author: lanyong_csd
 * @Create: 2020/1/6 11:49
 * @Company: Si-tech
 * @Description:
 **/
public class ProtoTypeTest{
    public static void main(String[] args) throws CloneNotSupportedException {
        RealizeType r1=new RealizeType();
        RealizeType r2=(RealizeType)r1.clone();
        System.out.println("r1==r2?"+(r1==r2));

    }
}

class RealizeType implements Cloneable{
    RealizeType(){
        System.out.println("具体原型创建成功");
    }
    @Override
    public Object clone()throws CloneNotSupportedException{
        System.out.println("具体原型复制成功");
        return super.clone();
    }

}
