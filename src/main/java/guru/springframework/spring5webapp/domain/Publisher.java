package guru.springframework.spring5webapp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Publisher
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    private String name;
    private String address1;
    private String city;
    private String state;
    private String zipcode;

    public Publisher()
    {
    }

    public Publisher(Long id, String name, String address1, String city, String state, String zipcode)
    {
        this.id = id;
        this.name = name;
        this.address1 = address1;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAddress1()
    {
        return address1;
    }

    public void setAddress1(String address1)
    {
        this.address1 = address1;
    }

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

    public String getZipcode()
    {
        return zipcode;
    }

    public void setZipcode(String zipcode)
    {
        this.zipcode = zipcode;
    }

    @Override
    public boolean equals(Object o)
    {
        if(this == o)
        {
            return true;
        }
        if(o == null || getClass() != o.getClass())
        {
            return false;
        }

        Publisher publisher = (Publisher) o;

        if(id != null ? !id.equals(publisher.id) : publisher.id != null)
        {
            return false;
        }
        if(name != null ? !name.equals(publisher.name) : publisher.name != null)
        {
            return false;
        }
        if(address1 != null ? !address1.equals(publisher.address1) : publisher.address1 != null)
        {
            return false;
        }
        if(city != null ? !city.equals(publisher.city) : publisher.city != null)
        {
            return false;
        }
        if(state != null ? !state.equals(publisher.state) : publisher.state != null)
        {
            return false;
        }
        return zipcode != null ? zipcode.equals(publisher.zipcode) : publisher.zipcode == null;
    }

    @Override
    public int hashCode()
    {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (address1 != null ? address1.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (zipcode != null ? zipcode.hashCode() : 0);
        return result;
    }

    @Override
    public String toString()
    {
        return "Publisher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address1='" + address1 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipcode='" + zipcode + '\'' +
                '}';
    }
}
