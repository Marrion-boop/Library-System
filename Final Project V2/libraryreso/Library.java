package libraryreso;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;




public class Library extends JFrame implements ActionListener {
    
    Font myFont;
    JLabel BorrowBook;
    JTextField BorrowTextField;
    JLabel ReturnBook;
    JTextField ReturnTextField;
    JLabel SearchBook;
    JTextField SearchTextField;
    JLabel Back;
    
    JButton BorrowButton;
    JButton ReturnButton;
    JButton AddButton;
    JButton ShowButton;
    JButton SearchButton;
    JButton ResetButton;
    JButton ShelfButton;
    JButton BackButton;
    JButton ExitButton;

 

    public Library() {
        super("LIbrary");
            setLayout(new GridLayout(7,2));
        myFont = new Font("Arial", Font.BOLD, 15);
        
        BorrowBook = new JLabel("Book to be borrowed");
        BorrowButton = new JButton("Borrow Book");
        BorrowTextField = new JTextField("");
        ReturnBook = new JLabel("Book to be returned");
        ReturnButton = new JButton("Return Book");
        ReturnTextField = new JTextField("");
        AddButton = new JButton("Donate Book");
        ShowButton = new JButton("Show Library");
        SearchBook = new JLabel("Name of book to be searched");
        SearchButton = new JButton("Search Library");
        SearchTextField = new JTextField("");
        ShelfButton = new JButton("Check Shelf Availability");
        Back = new JLabel("Back");
        BackButton = new JButton("Back");
        ExitButton = new JButton("Exit");
        ResetButton = new JButton("Reset Text Fields");
        
        
    
        
        BorrowBook.setFont(myFont);
        ReturnBook.setFont(myFont);
        SearchBook.setFont(myFont);
        Back.setFont(myFont);
        
        BorrowTextField.setFont(myFont);
        BorrowTextField.setForeground(Color.BLUE);
        BorrowTextField.setEditable(false);
        SearchTextField.setFont(myFont);
        SearchTextField.setForeground(Color.BLUE);
        SearchTextField.setEditable(false);
        ReturnTextField.setFont(myFont);
        ReturnTextField.setForeground(Color.BLUE);
        ReturnTextField.setEditable(false);
        
        
        
        add(BorrowBook);
        add(BorrowTextField);
        add(ReturnBook);
        add(ReturnTextField);
        add(SearchBook);
        add(SearchTextField);
        add(BorrowButton);
        add(ReturnButton);
        add(SearchButton);
        add(ShowButton);
        add(ShelfButton);
        add(AddButton);
        add(ResetButton);
        add(ExitButton);
        
        BorrowButton.addActionListener(this);
        ReturnButton.addActionListener(this);
        AddButton.addActionListener(this);
        ShowButton.addActionListener(this);
        SearchButton.addActionListener(this);
        ShelfButton.addActionListener(this);
        ResetButton.addActionListener(this);
        ExitButton.addActionListener(this);
        
    }
    
    
     @Override
public void actionPerformed(ActionEvent e) {

if(e.getSource()== BorrowButton){
BorrowTextField.setEditable(true);
SearchTextField.setEditable(false);
ReturnTextField.setEditable(false);

/*if(BorrowTextField.getText() == "900"){
Borrow Window1 = new Borrow();
Window1.setVisible(true);
dispose();}*/ //GAWIN MUNA YUNG COMPARISON NG BOOK TITLE AND YUNG NILAGAY SA THINGY PARA MATAPOS KO TONG PART NA TO (FOR MAR)
}
else if(e.getSource()== ReturnButton){
   
ReturnTextField.setEditable(true);
BorrowTextField.setEditable(false);
SearchTextField.setEditable(false);

/*if(ReturnTextField.getText() == "900"){
Return Window2 = new Return();
Window2.setVisible(true);
dispose();}*/ //NEED MUNA MAGAWA YUNG ARRAY FOR BOOKS NI MAR PARA MAGAWA TO (FOR DAHAM)
}
else if(e.getSource()== SearchButton){
SearchTextField.setEditable(true);
BorrowTextField.setEditable(false);
ReturnTextField.setEditable(false);

/*if(SearchTextField.getText() == "900"){
Search Window3 = new Search();
Window3.setVisible(true);
dispose();}*/ //DI KO PA MATUTULOY TO SINCE WALA PA ARRAY FOR BOOK (FOR DREY)
}
else if(e.getSource()== ShelfButton){
   /*Shelf Window4 = new Shelf();
Window4.setVisible(true);
dispose();}*/ //WALA PA BOOKS SI NI PA PWEDE MATULOY (FOR DREY)
}
else if(e.getSource()== ShowButton){
   /*Show Window5 = new Show();
Window5.setVisible(true);
dispose();}*/ //WALA PA BOOKS SO NDI PA PWEDE MATULOY (FOR AMIR)
}
else if(e.getSource()== AddButton){
    /*Add Window6 = new Add();
Window6.setVisible(true);
dispose();}*/ // NEED PA MGA VARIABLES BEFORE TO MATULOY (FOR MAR AND DREY)
}
else if(e.getSource()== ResetButton){
SearchTextField.setEditable(false);
BorrowTextField.setEditable(false);
ReturnTextField.setEditable(false);
}
else if(e.getSource()== ExitButton){
}
System.exit(0);
}
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 
    
    
    
    public static void main(String args[]) {
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
