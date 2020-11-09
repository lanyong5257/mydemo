import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.realm.text.IniRealm;
import org.apache.shiro.subject.Subject;
import org.junit.jupiter.api.Test;

/**
 * @Author: lanyong_csd
 * @Create: 2020/5/24 10:12
 * @Company: Si-tech
 * @Description:
 **/
public class TestShiro {
    @Test
    public void testLogin(){
        //构建securetymanager环境
        DefaultSecurityManager defaultSecurityManager = new DefaultSecurityManager();
        IniRealm iniRealm = new IniRealm("classpath:start.ini");
        defaultSecurityManager.setRealm(iniRealm);
        //主体提交认证
        SecurityUtils.setSecurityManager(defaultSecurityManager);
        Subject subject = SecurityUtils.getSubject();
        //securetymanager认证
        UsernamePasswordToken token = new UsernamePasswordToken("zhang", "123");
        subject.login(token);
        if(subject.isAuthenticated()){
            System.out.println("登录成功，登录用户+"+subject.getPrincipal());
        }else {
            System.out.println("未登录");
        }
        subject.logout();

    }
}
