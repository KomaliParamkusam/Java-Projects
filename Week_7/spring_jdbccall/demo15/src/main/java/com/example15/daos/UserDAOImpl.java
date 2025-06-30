gpackage com.example15.daos;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDAOImpl implements IUserDAO
{

    @Autowired
    private SimpleJdbcCall sjc;
    @Override
    public String authentication(String uname, String pswrd) 
    {
        sjc.setProcedureName("spring_authentication");
        Map<String,Object> inparams=new HashMap<>();
        inparams.put("p_username",uname);
        inparams.put("p_password",pswrd);
        Map<String,Object> outparams=sjc.execute(inparams);
      
       return  outparams.get("RESULT").toString();
    }
    
}
