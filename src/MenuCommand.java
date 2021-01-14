import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuCommand extends JButton {
    private String name,type;


    public MenuCommand(String name) {
        super(name);
        setPreferredSize(new Dimension(10,10));
        setMaximumSize(new Dimension(10,10));
        this.setVisible(true);
        this.name = name;
    }

    public MenuCommand() {
    }

    public void execute(){


    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
