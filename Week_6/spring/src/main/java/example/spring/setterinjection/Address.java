package example.spring.setterinjection;

import org.springframework.stereotype.Component;

@Component
public class Address 
{
    private String city;
    private String state;

    public String getCity() 
    {
        return city;
    }
     public void setCity(String city) 
    {
        this.city = city;
    }

    public String getState() 
    {
        return state;
    }

    public void setState(String state) 
    {
        this.state = state;
    }

    @Override
    public String toString() 
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Address{");
        sb.append("city=").append(city);
        sb.append(", state=").append(state);
        sb.append('}');
        return sb.toString();
    }
    
    


}
