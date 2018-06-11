package author;


public class Author {
    public String name;
    public Role role;

    public Author() {
        this.name = null;
        this.role = Role.UNKNOWN;
    }

    // constructor with given name
    public Author(String name) {
        this.name = name;
    }

    // constructor with given name and role
    public Author(String name, Role role) {
        this.name = name;
        this.role = role;
    }

    // returns authors name
    public String getName() {
        return this.name;
    }

    // returns role of author
    public Role getRole() {
        return this.role;
    }

    // sets name of author
    public void setName(String name) {
        this.name = name;
    }

    // sets role of author
    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public int hashCode() {
        return (name.hashCode() * 31) + (role.hashCode());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        Author other = (Author) o;
        if (name == null && other.name != null) {
            return false;
        }
        if (role != other.role) {
            return false;
        }
        return true;
    }


}