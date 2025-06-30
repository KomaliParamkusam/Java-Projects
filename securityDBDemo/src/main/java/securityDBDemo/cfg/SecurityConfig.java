package securityDBDemo.cfg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;

import javax.sql.DataSource;


@Configuration
@EnableWebSecurity
public class SecurityConfig 
{
	@Autowired
	private DataSource dataSource;
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
	    http
	        .authorizeRequests()
	            .antMatchers("/hr").hasRole("HR")
	            .antMatchers("/profile").hasAnyRole("EMPLOYEE")
	            .anyRequest().authenticated()
	        .and()
	        .formLogin(withDefaults())
	        .httpBasic();

	    return http.build();
	}
	
	    @Bean
	    public JdbcUserDetailsManager userDetailsService() 
	 	{
	        return new JdbcUserDetailsManager(dataSource); 
	    }
	    @Bean
	    public DataSource dataSource() 
	    {
	        DriverManagerDataSource dataSource = new DriverManagerDataSource();
	        dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
	        dataSource.setUrl("jdbc:oracle:thin:@localhost:1521/orclpdb");
	        dataSource.setUsername("hr");
	        dataSource.setPassword("hr");
	        return dataSource;
	    }

	    @Bean
	 	public PasswordEncoder passwordEncoder() {
	 	    return NoOpPasswordEncoder.getInstance();
	 	}
}
