import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class ErrorMessage {
    private String name, description;
    private Date date;

    public int createMessage(String name, String description, Date date) {
        setDate(date);
        setDescription(description);
        setName(name);

        return 4;
    }

    public int send(Frame frame) {
        JOptionPane.showMessageDialog(frame, name + " " + description + " " + date.toString());
        return 4;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
