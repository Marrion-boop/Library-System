/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marrion.final_project;

/**
 *
 * @author marri
 */
public class book {
    
    private String fiction[][] = new String [10][4]; 
    /*
    array will be
    name | description | date published | genre
    */
    static int f = 0; //counter for fiction
    
    book(){
       //fiction book initializer
       fiction[0][0] = "The Great Gatsby";
       fiction[0][1] = " is a 1925 novel by American writer F. Scott Fitzgerald. Set in the Jazz Age on Long Island, "
               + "\nnear New York City, the novel depicts first-person narrator Nick Carraway's interactions with mysterious "
               + "\nmillionaire Jay Gatsby and Gatsby's obsession to reunite with his former lover, Daisy Buchanan.";
       fiction[0][2] = "1925";
       fiction[0][3] = "Fiction";    
       
       fiction[1][0] = "To Kill a Mockingbird";
       fiction[1][1] = "is a novel by the American author Harper Lee. It was published in 1960 and was instantly successful."
               + "\n In the United States, it is widely read in high schools and middle schools. To Kill a Mockingbird has become"
               + "\n a classic of modern American literature; a year after its release, it won the Pulitzer Prize. ";
       fiction[1][2] = "1960";
       fiction[1][3] = "Fiction";
    };
    
    public void display_book()
    {
        for(int i = 0; i<10; i++){
            if(fiction[i][0] == null)
            {
               f = i-1;
               break; 
            }
                
            for (int j = 0; j<4; j++)
            {
                if(j == 0)
                    System.out.print("Name: ");
                if(j == 1)
                    System.out.print("Description: ");
                if(j == 2)
                    System.out.print("Date published: ");
                if(j == 3)
                    System.out.print("Genre: ");
                System.out.println(fiction[i][j]);
                
            }
            System.out.println("");
            
            
        }
    }
    
    public void set_book(String ti, String desc, String date, String genre)
    {
        //fiction
        int i = f;
        fiction[i][0] = ti;
        fiction[i][1] = desc;
        fiction[i][2] = date;
        fiction[i][3] = genre;
    }
    
    
    
    
    
}
