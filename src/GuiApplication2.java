import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Signup extends JFrame implements ActionListener {
    JTextField t1, t2, t4;
    JPasswordField t3;
    JButton b1, b2;
    JLabel l1, l2, l3, l4;
    
    public Signup() {
        setLayout(new FlowLayout());
        b1 = new JButton("Create account");
        b2 = new JButton("Back to login");
        l1 = new JLabel("Full Name:");
        l2 = new JLabel("Username:");
        l3 = new JLabel("Password:");
        l4 = new JLabel("Email:");
        t1 = new JTextField(15); //name
        t2 = new JTextField(15); //username
        t3 = new JPasswordField(15); //password
        t4 = new JTextField(15); //email
        
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        add(b1);
        add(b2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Sign Up");
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            String name = t1.getText();
            String username = t2.getText();
            String password = new String(t3.getPassword());
            String email = t4.getText();
            
            // Basic validation
            if (name.trim().isEmpty() || username.trim().isEmpty() || 
                password.trim().isEmpty() || email.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, 
                    "Please fill all fields!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            JOptionPane.showMessageDialog(this,
                    "Account Created Successfully!\nName: " + name +
                    "\nUsername: " + username +
                    "\nEmail: " + email);
            
            // After account creation, go to login page
            dispose();
            new LoginPage().setVisible(true);
                    
        } else if (e.getSource() == b2) {
            dispose();
            new LoginPage().setVisible(true);
        }
    }
}

class LoginPage extends JFrame implements ActionListener {
    JTextField t1;
    JPasswordField t2;
    JLabel l1, l2;
    JButton b1, b2;
    
    public LoginPage() {
        setLayout(new FlowLayout());
        b1 = new JButton("Login");
        b2 = new JButton("Signup");
        l1 = new JLabel("Username:");
        l2 = new JLabel("Password:");
        t1 = new JTextField(15); //username
        t2 = new JPasswordField(15); //password
        
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(b2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Login");
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            String username = t1.getText();
            String password = new String(t2.getPassword());
            
            // Basic validation
            if (username.trim().isEmpty() || password.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, 
                    "Please enter both username and password!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            // Show login success message
            JOptionPane.showMessageDialog(this,
                    "Login Successful!\nWelcome " + username,
                    "Success", JOptionPane.INFORMATION_MESSAGE);
            
            // After clicking OK on the message dialog, redirect to e-commerce home page
            dispose(); // Close login window
            new Ecommerce(username).setVisible(true); // Open e-commerce page with username
            
        } else if (e.getSource() == b2) {
            dispose();
            new Signup().setVisible(true);
        }
    }
}

class Ecommerce extends JFrame {
    String loggedInUser;

    // Cart Data
    String[] categories = {"Electronics", "Furniture", "Clothing", "Daily Needs"};
    String[][] sub = {
            {"Smart Phone", "Laptop", "Head Phones", "Smart Watch", "Bluetooth Speaker"},
            {"Sofa Set", "Office Chair", "Study Table", "Wardrobe", "Bed"},
            {"Jacket", "Hoodie", "Jeans", "Kurti", "T-Shirts"},
            {"Milk", "Bread", "Rice", "Soap", "Eggs"}
    };
    String[][] desc = {
            {"Handheld device with apps, camera, GPS, 5G.", "Portable computer with screen and keyboard.",
             "Wearable audio device, good for music & calls.", "Wearable watch, tracks fitness & health.",
             "Wireless audio speaker, plays anywhere."},
            {"Comfortable sofa for living rooms.", "Chair for office work.", "Flat study surface for books.",
             "Wardrobe to store clothes.", "Bed for rest and comfort."},
            {"Warm jacket for winter.", "Hoodie with head cover.", "Durable denim jeans.", 
             "Traditional Indian top.", "Casual T-shirt for daily wear."},
            {"Nutrient-rich milk.", "Fresh bread.", "Staple rice.", "Soap for cleaning.", "Protein-rich eggs."}
    };

    JComboBox<String> categoryBox;
    JComboBox<String> subcategoryBox;
    JTextArea cartArea;
    JLabel itemCountLabel;
    JLabel welcomeLabel;
    int itemCount = 0;

    public Ecommerce(String username) {
        this.loggedInUser = username;
        
        // Frame Setup
        setTitle("E-Commerce Application - Welcome " + username);
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // -------- Welcome Panel --------
        JPanel welcomePanel = new JPanel(new FlowLayout());
        welcomeLabel = new JLabel("Welcome, " + username + "!");
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 16));
        welcomeLabel.setForeground(Color.BLUE);
        
        JButton logoutBtn = new JButton("Logout");
        logoutBtn.addActionListener(e -> {
            int confirm = JOptionPane.showConfirmDialog(this, 
                "Are you sure you want to logout?", "Logout", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                dispose();
                new LoginPage().setVisible(true);
            }
        });
        
        welcomePanel.add(welcomeLabel);
        welcomePanel.add(logoutBtn);

        // -------- Shopping Panel --------
        JPanel shopPanel = new JPanel(new GridLayout(4, 2));
        shopPanel.setBorder(BorderFactory.createTitledBorder("Shopping"));

        shopPanel.add(new JLabel("Select Category:"));
        categoryBox = new JComboBox<>(categories);
        shopPanel.add(categoryBox);

        shopPanel.add(new JLabel("Select Item:"));
        subcategoryBox = new JComboBox<>(sub[0]); // default: first category
        shopPanel.add(subcategoryBox);

        // Update subcategories when category changes
        categoryBox.addActionListener(e -> {
            int index = categoryBox.getSelectedIndex();
            subcategoryBox.setModel(new DefaultComboBoxModel<>(sub[index]));
        });

        JButton addBtn = new JButton("Add to Cart");
        shopPanel.add(addBtn);

        JButton clearCartBtn = new JButton("Clear Cart");
        shopPanel.add(clearCartBtn);

        // -------- Cart Panel --------
        JPanel cartPanel = new JPanel(new BorderLayout());
        cartPanel.setBorder(BorderFactory.createTitledBorder("Shopping Cart"));

        cartArea = new JTextArea(10, 30);
        cartArea.setEditable(false);
        cartArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
        JScrollPane scroll = new JScrollPane(cartArea);
        cartPanel.add(scroll, BorderLayout.CENTER);

        // Item count label
        itemCountLabel = new JLabel("Total items: 0");
        itemCountLabel.setFont(new Font("Arial", Font.BOLD, 12));
        cartPanel.add(itemCountLabel, BorderLayout.SOUTH);

        // Action for Add Button
        addBtn.addActionListener(e -> {
            int catIndex = categoryBox.getSelectedIndex();
            int subIndex = subcategoryBox.getSelectedIndex();
            String item = sub[catIndex][subIndex];
            String description = desc[catIndex][subIndex];

            cartArea.append((itemCount + 1) + ". " + item + "\n   Description: " + description + "\n\n");

            // Update item count
            itemCount++;
            itemCountLabel.setText("Total items: " + itemCount);
            
            JOptionPane.showMessageDialog(this, item + " added to cart successfully!");
        });

        // Action for Clear Cart Button
        clearCartBtn.addActionListener(e -> {
            int confirm = JOptionPane.showConfirmDialog(this, 
                "Are you sure you want to clear the cart?", "Clear Cart", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                cartArea.setText("");
                itemCount = 0;
                itemCountLabel.setText("Total items: 0");
                JOptionPane.showMessageDialog(this, "Cart cleared successfully!");
            }
        });

        // -------- Layout Assembly --------
        add(welcomePanel, BorderLayout.NORTH);
        add(shopPanel, BorderLayout.CENTER);
        add(cartPanel, BorderLayout.SOUTH);
        
        setLocationRelativeTo(null);
    }
}

public class GuiApplication2 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new LoginPage().setVisible(true);
        });
    }
}