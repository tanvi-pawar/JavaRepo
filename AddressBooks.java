
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class AddressBooks extends JFrame {
    JTextField nameField, phoneField, emailField;
    JTextArea outputArea;

    Connection conn;

    public AddressBooks() {
        setTitle("Address Book with Oracle DB");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // DB Connection
        connectToDatabase();

        // UI Components
        JPanel panel = new JPanel(new GridLayout(4, 2));
        panel.add(new JLabel("Name:"));
        nameField = new JTextField();
        panel.add(nameField);
        panel.add(new JLabel("Phone:"));
        phoneField = new JTextField();
        panel.add(phoneField);
        panel.add(new JLabel("Email:"));
        emailField = new JTextField();
        panel.add(emailField);

        JButton addButton = new JButton("Add Contact");
        JButton viewButton = new JButton("View Contacts");
        panel.add(addButton);
        panel.add(viewButton);

        outputArea = new JTextArea();
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        add(panel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        // Button actions
        addButton.addActionListener(e -> addContact());
        viewButton.addActionListener(e -> viewContacts());

        setVisible(true);
    }

    private void connectToDatabase() {
        try {
            // Load Oracle JDBC Driver
             Class.forName("oracle.jdbc.OracleDriver");

            // Connect: update with your DB username, password, and connection string
            String url = "jdbc:oracle:thin:@localhost:1521:XE"; // or your service name
            String user = "your_username";
            String password = "your_password";

            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to Oracle DB.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Database Connection Failed:\n" + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
    }

    private void addContact() {
        String name = nameField.getText();
        String phone = phoneField.getText();
        String email = emailField.getText();

        String sql = "INSERT INTO contacts (name, phone, email) VALUES (?, ?, ?)";

        try (PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, name);
            pst.setString(2, phone);
            pst.setString(3, email);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Contact Added Successfully!");
            nameField.setText(""); phoneField.setText(""); emailField.setText("");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error adding contact:\n" + e.getMessage());
        }
    }

    private void viewContacts() {
        outputArea.setText("");
        String sql = "SELECT * FROM contacts";

        try (Statement st = conn.createStatement(); ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                outputArea.append("ID: " + rs.getInt("id") + "\n");
                outputArea.append("Name: " + rs.getString("name") + "\n");
                outputArea.append("Phone: " + rs.getString("phone") + "\n");
                outputArea.append("Email: " + rs.getString("email") + "\n\n");
            }
        } catch (SQLException e) {
            outputArea.setText("Error fetching contacts:\n" + e.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AddressBooks());
    }
}
