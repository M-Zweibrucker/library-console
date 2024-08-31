import java.util.Date;

public class Author {
    private int id;
    private String name;
    private Date birth_date;

    public Author(int id, String name, Date birth_date) {
        this.id = id;
        this.name = name;
       this.birth_date = birth_date;
    }

    public int getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public Date getBirth_date(){
        return birth_date;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setBirth_date(Date birth_date){
        this.birth_date = birth_date;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birth_date +
                '}';
    }

}
