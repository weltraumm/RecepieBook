import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ManagerMenuUI {

    public List<MenuCommand> commands;
    public GeneralCollection generalCollection;
    public PrivateCollection privateCollection;

    public ManagerMenuUI() {
        commands = new ArrayList<>();

    }


    public GeneralCollection getGeneralCollection() {
        return generalCollection;
    }

    public void setGeneralCollection(GeneralCollection generalCollection) {
        this.generalCollection = generalCollection;
    }

    public PrivateCollection getPrivateCollection() {
        return privateCollection;
    }

    public void setPrivateCollection(PrivateCollection privateCollection) {
        this.privateCollection = privateCollection;
    }

    public List<MenuCommand> getCommands() {
        return commands;
    }

    public void setCommands(List<MenuCommand> commands) {
        this.commands = commands;
    }


    public void createGCWindow() {
        final JFrame frame = new JFrame("Demo buttons");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JComboBox<NetRecipe> comboBox = new JComboBox<>();
        JPanel buttonPanel = new JPanel(new GridLayout(3, 1));
        for (MenuCommand command : commands) {
            buttonPanel.add(command);
            command.execute();
        }
        JButton privateCollection = new JButton("личная коллекция");
        JButton update = new JButton("update");
        update.addActionListener(e -> createUpdateWindow());
        buttonPanel.add(update);
        privateCollection.addActionListener(e -> {
            createPCWindow();
            frame.dispose();
        });
        comboBox.addItem(new NetRecipe());
        commands.get(0).addActionListener(e -> {
            generalCollection.uploadNetRecipe((NetRecipe) comboBox.getSelectedItem());
        });
        buttonPanel.add(privateCollection);


        JPanel east = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.weighty = 1;
        east.add(buttonPanel, gbc);

        for (NetRecipe recipe : generalCollection.getNetRecipes())
            comboBox.addItem(recipe);

        JPanel center = new JPanel() {
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(200, 200);
            }
        };
        center.add(comboBox);
        center.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        frame.add(east, BorderLayout.EAST);
        frame.add(center);
        JPanel filters = new JPanel(new GridBagLayout());
        JTextField tags = new JTextField("tags", 10);
        JTextField date = new JTextField("date", 10);
        JTextField ec = new JTextField("эц", 10);
        filters.add(tags);
        filters.add(date);
        filters.add(ec);
        frame.add(filters,BorderLayout.NORTH);
        frame.pack();
        frame.setVisible(true);

    }

    public void createPCWindow() {
        final JFrame frame = new JFrame("Private");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel buttonPanel = new JPanel(new GridLayout(3, 1));
        JButton errorButton = new JButton("error");
        buttonPanel.add(errorButton);
        errorButton.addActionListener(e -> {
            JFrame errorFrame = new JFrame("error add");
            JPanel errorPanel = new JPanel(new GridLayout(3, 1));
            JTextField textField = new JTextField("error name", 10);
            JTextField textField1 = new JTextField("error description", 10);
            ErrorMessage errorMessage = new ErrorMessage();
            JButton ok = new JButton("ok");
            errorPanel.add(textField);
            errorPanel.add(textField1);
            errorPanel.add(ok);
            ok.addActionListener(e1 -> {
                errorMessage.createMessage(textField.getText(), textField1.getText(), new Date());

            });
            errorFrame.add(errorPanel);
            errorFrame.setVisible(true);

        });
        for (MenuCommand command : commands) {
            buttonPanel.add(command);
            command.execute();
        }
        JButton generalCollection = new JButton("общая коллекция");
        generalCollection.addActionListener(e -> {
            createGCWindow();
            frame.dispose();
        });
        buttonPanel.add(generalCollection);


        JPanel east = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.weighty = 1;
        east.add(buttonPanel, gbc);
        JComboBox<Recipe> comboBox = new JComboBox<>();
        for (Recipe recipe : privateCollection.getRecipeList())
            comboBox.addItem(recipe);

        JPanel center = new JPanel() {
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(200, 200);
            }
        };
        center.add(comboBox);
        center.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        frame.add(east, BorderLayout.EAST);
        frame.add(center);

        frame.pack();
        frame.setVisible(true);

    }

    public void createListWindow(String string) {
        final JFrame frame = new JFrame("list");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel buttonPanel = new JPanel(new GridLayout(3, 1));
        JButton choose = new JButton("choose");

       buttonPanel.add(choose);
       choose.addActionListener(e -> {
                
       });
        JButton generalCollection = new JButton("общая коллекция");
        generalCollection.addActionListener(e -> {
            createGCWindow();
            frame.dispose();
        });
        buttonPanel.add(generalCollection);


        JPanel east = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.weighty = 1;
        east.add(buttonPanel, gbc);
        JComboBox<Recipe> comboBox = new JComboBox<>();
        for (Recipe recipe : privateCollection.getRecipeList())
            comboBox.addItem(recipe);

        JPanel center = new JPanel() {
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(200, 200);
            }
        };
        center.add(comboBox);
        center.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        frame.add(east, BorderLayout.EAST);
        frame.add(center);

        frame.pack();
        frame.setVisible(true);
    }

    public void createChooseWindow() {


    }

    public void createUpdateWindow() {
        final JFrame frame = new JFrame("update");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel buttonPanel = new JPanel(new GridLayout(3, 1));
        JButton saveB = new JButton("save");
        JButton back = new JButton("back");
        JTextField textField = new JTextField("name", 10);
        JTextField textField1 = new JTextField("description", 10);

        buttonPanel.add(saveB);
        buttonPanel.add(back);
        saveB.addActionListener(e->{
            Recipe recipe = new Recipe();
            recipe.setDescription(textField1.getText());
            recipe.setName(textField.getText());
            privateCollection.getRecipeList();
            privateCollection.recipeList.add(recipe);
        });
        back.addActionListener(e -> close(frame));


        JPanel east = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.weighty = 1;
        east.add(buttonPanel, gbc);

        JPanel center = new JPanel() {
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(200, 200);
            }
        };
        center.add(textField);
        center.add(textField1);
        center.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        frame.add(east, BorderLayout.EAST);
        frame.add(center);

        frame.pack();
        frame.setVisible(true);

    }

    public void close(Frame frame) {
        frame.dispose();
    }

    public void changeWindow() {
    }

}
