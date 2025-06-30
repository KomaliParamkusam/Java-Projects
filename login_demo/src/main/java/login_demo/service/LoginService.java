package login_demo.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService 
{
	public boolean isValidate(String name,String password)
	{
		return name.equalsIgnoreCase("Komali") && password.equalsIgnoreCase("1234");
	}

}
