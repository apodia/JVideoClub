import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;

public class JVideoClubGUIMainScreen {
	
private static void createAndShowGUI() {
    	
        //Create and set up the window.
        JFrame frame = new JFrame("JVideoClub - Rental Screen");        
        frame.setLayout(new BorderLayout());
        frame.setSize(700, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        JLabel label = new JLabel("Client Rental Screen");
        frame.add(label, BorderLayout.NORTH);
        
                
        JPanel mainTablePanel = new JPanel();
        mainTablePanel.setLayout(new FlowLayout());
        frame.add(mainTablePanel, BorderLayout.CENTER);        
        
        JTable moviesTable = new JTable(new String[][] { {"This", "is"}, {"a", "Test"} },
                						new String[] {"Film Title", "Film Director"});
        
       // mainTablePanel.add(moviesTable);        
        JScrollPane jsp = new JScrollPane(moviesTable);
        frame.getContentPane().add(jsp, BorderLayout.CENTER);

        
        
        
        JPanel searchPanel = new JPanel();
        searchPanel.setLayout(new FlowLayout());
        frame.add(searchPanel, BorderLayout.SOUTH);
        
        JLabel labelSearch = new JLabel("Search Film:  ");
        labelSearch.setHorizontalAlignment(JLabel.CENTER); 
        
        JTextField textFieldSearch = new JTextField(20);
        textFieldSearch.setToolTipText("Search for Film here...");
        textFieldSearch.setHorizontalAlignment(JTextField.LEFT);
        
        JButton searchButton = new JButton("Search!");       
          
        searchPanel.add(labelSearch);
        searchPanel.add(textFieldSearch);      
        searchPanel.add(searchButton);
        
       
                           
        /*
        JPanel okCancelPanel = new JPanel();
        okCancelPanel.setLayout(new FlowLayout());
        frame.add(okCancelPanel, BorderLayout.SOUTH);
                
        JButton buttonOk = new JButton("OK");
        okCancelPanel.add(buttonOk);
        
        JButton buttonCancel = new JButton("Cancel");
        //frame.getContentPane().add(buttonCancel);
        okCancelPanel.add(buttonCancel);
        */     
        
 
        //Display the window.
        //frame.pack(); //either this or the setSize() added before...
        frame.setVisible(true);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}

}
