import org.apache.commons.lang3.builder.EqualsBuilder;

public class Bank {
    String name;
    String address;

    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public boolean equals(Object o){
        return EqualsBuilder.reflectionEquals(this, o);

    }
}
