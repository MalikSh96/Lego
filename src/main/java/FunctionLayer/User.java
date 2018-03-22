package FunctionLayer;

import java.util.Objects;

/**
 * The purpose of User is to...
 * @author kasper
 */
public class User {

    public User( String email, String password, String role ) {
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public User(int id, String email, String password, String role) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    private int id; // just used to demo retrieval of autogen keys in UserMapper
    private String email;
    private String password; // Should be hashed and all
    private String role;

    @Override
    public int hashCode() 
    {
        return password.hashCode();
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        return true;
    }

    public String getEmail() 
    {
        return email;
    }

    public void setEmail( String email ) 
    {
        this.email = email;
    }

    public String getPassword() 
    {
        return password;
    }

    public void setPassword( String password ) 
    {
        this.password = password;
    }

    public String getRole() 
    {
        return role;
    }

    public void setRole( String role ) 
    {
        this.role = role;
    }

    public int getId() 
    {
        return id;
    }

    public void setId( int id ) 
    {
        this.id = id;
    }

    @Override
    public String toString() 
    {
        return "User\nId: " + id + "\nemail: " + email + "\nPassword: " + password + "\nrole: " + role;
    }    
}