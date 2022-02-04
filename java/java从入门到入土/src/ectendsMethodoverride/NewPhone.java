package ectendsMethodoverride;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-04
 * Time: 22:14
 */
public class NewPhone extends Phone{
    @Override
    public   void call(){
        super.call();
        System.out.println("视频电话");
    }
    @Override
    public void sendMessage(){
        super.sendMessage();
        System.out.println("可以发图片");
    }
}
