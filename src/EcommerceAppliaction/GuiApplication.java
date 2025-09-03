package EcommerceAppliaction;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
class Signup extends JFrame implements ActionListener{
	JTextField t1,t2,t4;
	JPasswordField t3;
	JButton b1,b2;
	JLabel l1,l2,l3,l4;
	public Signup() {
		setLayout (new FlowLayout());
		b1=new JButton("Create account");
		b2=new JButton(" Back to login");
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
	}
	@Override //Abstraction
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
		    String name = t1.getText();
		    String username = t2.getText();
		    String password = new String(t3.getPassword());
		    String email = t4.getText();

		    JOptionPane.showMessageDialog(this,
		            "Account Created!\nName: " + name +
		            "\nUsername: " + username +
		            "\nEmail: " + email);

		} else if (e.getSource() == b2) {
		    dispose();
		    new LoginPage().setVisible(true);
		}
	}
}
	class LoginPage extends JFrame implements ActionListener{
		JTextField t1;
		JPasswordField t2;
		JLabel l1,l2;
		JButton b1,b2;
		public LoginPage() {
			 setLayout (new FlowLayout());
			 b1=new JButton("Login");
			 b2=new JButton(" Signup");
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
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			 if (e.getSource() == b1) {
		            String username = t1.getText();
		            String password = new String(((JPasswordField) t2).getPassword());
		            JOptionPane.showMessageDialog(this,
		                    "Login Attempt:\nUsername: " + username +
		                            "\nPassword: " + password);
		        } else if (e.getSource() == b2) {
		            dispose();
		            new Signup().setVisible(true);
		        }
		    }
		}
class MainPage extends JFrame implements ActionListener{
	    private JComboBox Category;
	    private JComboBox SubCategory;
	    private JButton Loadproducts;
	    private JButton AddToCart;
	    private JList productList;
	    private DefaultListModel listModel;
	    
	    public MainPage(){
	    	 setTitle("E-Commerce Store");
	    	 setSize(800, 600);
	         setLocationRelativeTo(null);
	         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	         setLayout(new BorderLayout());
	         JPanel tp=new JPanel (new FlowLayout(FlowLayout.CENTER ,10,10));
	    
	         String[] categories = {"Clothing", "Furniture", "Basic Needs", "Electronics"};
	         Category = new JComboBox<>(categories);


	         String[] clothingSubCategories = {"Men", "Women", "Kids", "Ethnic Wear", "Western"};
	         String[] furnitureSubCategories = {"Sofa", "Chair", "Table", "Bed", "Cupboard"};
	         String[] basicNeedsSubCategories = {"Groceries", "Personal Care", "Stationery", "Cleaning Supplies"};
	         String[] electronicsSubCategories = {"Mobile", "Laptop", "Camera", "Headphones", "TV"};
	         SubCategory = new JComboBox<>(clothingSubCategories);
	         SubCategory = new JComboBox<>(furnitureSubCategories);
	         SubCategory = new JComboBox<>(basicNeedsSubCategories);
	         SubCategory = new JComboBox<>(electronicsSubCategories);
	         tp.add(SubCategory);

	         Loadproducts = new JButton("Load Products");
	         Loadproducts.addActionListener(this);
	         //tp.add(AddToCart);
	         tp.add(Category);
	        // tp.add(productList);
	        // tp.add(SubCategory);
	         tp.add(Loadproducts);
	         JPanel centerPanel = new JPanel(new GridLayout(1, 2, 10, 10));
	         
	         listModel = new DefaultListModel<>(); // can add,remove, or clear the items dynamically
	         productList = new JList<>(listModel);
	         JScrollPane scrollPane = new JScrollPane(productList);
	         
	         AddToCart = new JButton("Add to Cart");
	         AddToCart.addActionListener(this);
	         JPanel rightPanel = new JPanel(new BorderLayout());
	         rightPanel.add(AddToCart, BorderLayout.CENTER);
	         centerPanel.add(scrollPane);
	         centerPanel.add(rightPanel);
	         add(tp, BorderLayout.NORTH);
	         add(centerPanel, BorderLayout.CENTER);
	         
	    }

	    @Override
	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == Loadproducts) {
	            String selectedCategory = (String) Category.getSelectedItem();
	            String selectedSubCategory = (String) SubCategory.getSelectedItem();

	            listModel.clear(); // Clear previous products

	            switch (selectedCategory) {
	                case "Clothing":
	                    switch (selectedSubCategory) {
	                        case "Men":
	                            listModel.addElement("Men's Shirt - ₹999");
	                            listModel.addElement("Men's Jeans - ₹1499");
	                            break;
	                        case "Women":
	                            listModel.addElement("Saree (BIBA) - ₹2999");
	                            listModel.addElement("Kurti (W) - ₹1499");
	                            listModel.addElement("Jeans (Levi's) - ₹2599");
	                            listModel.addElement("Top (Zara) - ₹1199");
	                            listModel.addElement("Dress (ONLY) - ₹1999");
	                            break;
	                        case "Kids":
	                            listModel.addElement("Kids T-Shirt - ₹499");
	                            listModel.addElement("Kids Shorts - ₹699");
	                            break;
	                        case "Ethnic Wear":
	                            listModel.addElement("Ethnic Kurta - ₹1999");
	                            listModel.addElement("Ethnic Saree - ₹2999");
	                            break;
	                        case "Western":
	                            listModel.addElement("Western Dress - ₹1499");
	                            listModel.addElement("Jacket - ₹1999");
	                            break;
	                        default:
	                            listModel.addElement("No products found for this selection.");
	                    }
	                    break;

	                case "Furniture":
	                    switch (selectedSubCategory) {
	                        case "Sofa":
	                            listModel.addElement("3-Seater Sofa - ₹12000");
	                            listModel.addElement("Recliner Sofa - ₹15000");
	                            break;
	                        case "Chair":
	                            listModel.addElement("Office Chair - ₹2500");
	                            listModel.addElement("Dining Chair - ₹1500");
	                            break;
	                        case "Table":
	                            listModel.addElement("Coffee Table - ₹3500");
	                            listModel.addElement("Dining Table - ₹8000");
	                            break;
	                        case "Bed":
	                            listModel.addElement("Queen Bed - ₹10000");
	                            listModel.addElement("King Bed - ₹15000");
	                            break;
	                        case "Cupboard":
	                            listModel.addElement("Wooden Cupboard - ₹7000");
	                            listModel.addElement("Steel Cupboard - ₹5000");
	                            break;
	                        default:
	                            listModel.addElement("No products found for this selection.");
	                    }
	                    break;

	                case "Basic Needs":
	                    switch (selectedSubCategory) {
	                        case "Groceries":
	                            listModel.addElement("Rice 5kg - ₹400");
	                            listModel.addElement("Cooking Oil 1L - ₹250");
	                            break;
	                        case "Personal Care":
	                            listModel.addElement("Shampoo - ₹200");
	                            listModel.addElement("Soap - ₹50");
	                            break;
	                        case "Stationery":
	                            listModel.addElement("Notebook - ₹50");
	                            listModel.addElement("Pen Set - ₹100");
	                            break;
	                        case "Cleaning Supplies":
	                            listModel.addElement("Detergent Powder - ₹250");
	                            listModel.addElement("Floor Cleaner - ₹150");
	                            break;
	                        default:
	                            listModel.addElement("No products found for this selection.");
	                    }
	                    break;

	                case "Electronics":
	                    switch (selectedSubCategory) {
	                        case "Mobile":
	                            listModel.addElement("iPhone 15 - ₹90000");
	                            listModel.addElement("Samsung Galaxy S23 - ₹70000");
	                            break;
	                        case "Laptop":
	                            listModel.addElement("Dell Inspiron - ₹55000");
	                            listModel.addElement("MacBook Air - ₹85000");
	                            break;
	                        case "Camera":
	                            listModel.addElement("Canon DSLR - ₹45000");
	                            listModel.addElement("Sony Mirrorless - ₹60000");
	                            break;
	                        case "Headphones":
	                            listModel.addElement("Sony WH-1000XM5 - ₹25000");
	                            listModel.addElement("Bose QuietComfort - ₹22000");
	                            break;
	                        case "TV":
	                            listModel.addElement("Samsung 55-inch LED - ₹45000");
	                            listModel.addElement("LG 65-inch OLED - ₹90000");
	                            break;
	                        default:
	                            listModel.addElement("No products found for this selection.");
	                    }
	                    break;

	                default:
	                    listModel.addElement("No products found for this selection.");
	            }

	        } else if (e.getSource() == AddToCart) {
	            String selectedProduct = (String) productList.getSelectedValue();
	            if (selectedProduct != null) {
	                JOptionPane.showMessageDialog(this, selectedProduct + " has been added to the cart.");
	            } else {
	                JOptionPane.showMessageDialog(this, "Please select a product to add to the cart.", "Error", JOptionPane.ERROR_MESSAGE);
	            }
	        }
	    }

	
}
		
public class GuiApplication {

	public static void main(String[] args) {
		new LoginPage().setVisible(true);
		new MainPage().setVisible(true);
	}

}
