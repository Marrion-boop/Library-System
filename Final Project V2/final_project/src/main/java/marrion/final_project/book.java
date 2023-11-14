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
    private String history[][] = new String [10][4]; 
    private String non_fiction[][] = new String [10][4]; 
    private String sci_fi[][] = new String [10][4];
    private String fantasy[][] = new String [10][4];
    /*
    array will be
    name | description | date published | genre
    */
    
    
    public int f_ctr = 0; //counter for fiction
    public int h_ctr = 0;
    public int nf_ctr = 0;
    public int sf_ctr = 0;
    public int fa_ctr = 0;
    
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
       f_ctr = 2;
       
       //history book initializer
       history[0][0] = "Genghis Khan and the Making of the Modern World";
       history[0][1] =" is a history book written by Jack Weatherford, Dewitt "
               + "\nWallace Professor of Anthropology at Macalester College. It is a narrative "
               + "\nof the rise and influence of Mongol leader Genghis Khan and his successors, and"
               + "\n their influence on European civilization.";
       history[0][2] = "2004";
       history[0][3] = "History";
       
       history[1][0] = "The Art of War";
       history[1][1] =" is an ancient Chinese military treatise dating from the Late Spring and "
               + "\nAutumn Period (roughly 5th century BC). The work, which is attributed to the ancient"
               + "\n Chinese military strategist Sun Tzu (\"Master Sun\"), is composed of 13 chapters.";
       history[1][2] = "2004";
       history[1][3] = "History";
       h_ctr = 2;
       
       //non_fiction book initializer
       non_fiction[0][0] = "A Short History of Nearly Everything ";
       non_fiction[0][1] = " by American-British author Bill Bryson is a popular science book "
               + "\nthat explains some areas of science, using easily accessible language that appeals"
               + "\n more to the general public than many other books dedicated to the subject.";
       non_fiction[0][2] = "2003";
       non_fiction[0][3] = "Non-Fiction";
       
       non_fiction[1][0] = "Silent Spring";
       non_fiction[1][1] = " is an environmental science book by Rachel Carson. Published on September 27, 1962, "
               + "\nthe book documented the environmental harm caused by the indiscriminate use of pesticides. ";
       non_fiction[1][2] = "1962";
       non_fiction[1][3] = "Non-Fiction";
       nf_ctr = 2;
       
       //sci-fi book initializer
       sci_fi[0][0] = "Dune";
       sci_fi[0][1] = "Dune is set in the distant future in a feudal interstellar society in which various noble houses control planetary "
               + "\nfiefs. It tells the story of young Paul Atreides, whose family accepts the stewardship of the planet Arrakis.";
       sci_fi[0][2] = "1965";
       sci_fi[0][3] = "Sci-Fi";
       
       sci_fi[1][0] = "The Three-Body Problem";
       sci_fi[1][1] = " The series portrays a fictional past, present and future wherein Earth encounters an alien civilization from"
               + "\n a nearby system of three sun-like stars orbiting one another, in an example of the three-body problem in orbital mechanics.";
       sci_fi[1][2] = "2008";
       sci_fi[1][3] = "Sci-Fi";
       sf_ctr = 2;
       
       //fantasy book initializer
       fantasy[0][0] = "The Name of the Wind";
       fantasy[0][1] = "The Kingkiller Chronicle takes place in the fictional world of Temerant, a large continent of which "
               + "\nthe known part, called the Four Corners of Civilization, is divided into several distinct nations and cultures. "
               + "\nMuch of the world follows a faith vaguely similar to medieval Christianity. ";
       fantasy[0][2] = "2007";
       fantasy[0][3] = "Fantasy";
       
       fantasy[1][0] = "A Game of Thrones";
       fantasy[1][1] = " is the first novel in A Song of Ice and Fire, a series of fantasy novels by American author George R. R. Martin."
               + "\n It was first published on August 1, 1996. The novel won the 1997 Locus Award[2] and was nominated for both the 1997 "
               + "\nNebula Award and the 1997 World Fantasy Award.";
       fantasy[1][2] = "1996";
       fantasy[1][3] = "Fantasy";
       fa_ctr = 2;
       
    };
    
    public void display_book()
    {
        System.out.println("");
        System.out.println("FICTION");
        for(int i = 0; i<10; i++){
            if(fiction[i][0] == null)
            {
                
               //f = i;
                System.out.println("f in display book"+f_ctr);
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
        
        System.out.println("");
        System.out.println("HISTORY");             //HISTORY
        for(int i = 0; i<10; i++)
        {
            
            
            if(history[i][0] == null)               //stops the for loop if name is null
               break;
            
            
            for(int j = 0; j<4; j++)
            {
                if(j == 0)
                    System.out.print("Name: ");
                if(j == 1)
                    System.out.print("Description: ");
                if(j == 2)
                    System.out.print("Date published: ");
                if(j == 3)
                    System.out.print("Genre: ");
                System.out.println(history[i][j]);                
            }
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("NON-FICTION");            //NON-FICTION
        for(int i = 0; i<10; i++)
        {
            
            
            if(non_fiction[i][0] == null)               //stops the for loop if name is null
               break;
            
            
            for(int j = 0; j<4; j++)
            {
                if(j == 0)
                    System.out.print("Name: ");
                if(j == 1)
                    System.out.print("Description: ");
                if(j == 2)
                    System.out.print("Date published: ");
                if(j == 3)
                    System.out.print("Genre: ");
                System.out.println(non_fiction[i][j]);                
            }
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("SCI-FI");                    //SCI-FI
        for(int i = 0; i<10; i++)
        {
            
            
            if(sci_fi[i][0] == null)               //stops the for loop if name is null
               break;
            
            
            for(int j = 0; j<4; j++)
            {
                if(j == 0)
                    System.out.print("Name: ");
                if(j == 1)
                    System.out.print("Description: ");
                if(j == 2)
                    System.out.print("Date published: ");
                if(j == 3)
                    System.out.print("Genre: ");
                System.out.println(sci_fi[i][j]);                
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("FANTASY");                    //FANTASY
        for(int i = 0; i<10; i++)
        {
            
            
            if(fantasy[i][0] == null)               //stops the for loop if name is null
               break;
            
            
            for(int j = 0; j<4; j++)
            {
                if(j == 0)
                    System.out.print("Name: ");
                if(j == 1)
                    System.out.print("Description: ");
                if(j == 2)
                    System.out.print("Date published: ");
                if(j == 3)
                    System.out.print("Genre: ");
                System.out.println(fantasy[i][j]);                
            }
            System.out.println("");
        }
    }
    
    
    
    
    public void set_book(String ti, String desc, String date, int genre)
    {
        
        
        
        
        switch(genre)
        {
            case 1:
            {
                fiction[f_ctr][0] = ti;
                fiction[f_ctr][1] = desc;
                fiction[f_ctr][2] = date;
                fiction[f_ctr][3] = "Fiction";
                f_ctr++;
                System.out.println("Book Donated In Fiction Genre!");
            }
            break;
            
            case 2:
            {
                history[h_ctr][0] = ti;
                history[h_ctr][1] = desc;
                history[h_ctr][2] = date;
                history[h_ctr][3] = "History";
                h_ctr++;
                System.out.println("Book Donated In History Genre!");
            }
            break;
         
            case 3:
            {
                non_fiction[nf_ctr][0] = ti;
                non_fiction[nf_ctr][1] = desc;
                non_fiction[nf_ctr][2] = date;
                non_fiction[nf_ctr][3] = "Non-Fiction";
                nf_ctr++;
                System.out.println("Book Donated In Non-Fiction Genre!");
            }
            break;
            
            case 4:
            {
                sci_fi[sf_ctr][0] = ti;
                sci_fi[sf_ctr][1] = desc;
                sci_fi[sf_ctr][2] = date;
                sci_fi[sf_ctr][3] = "Sci-Fi";
                sf_ctr++;
                System.out.println("Book Donated In Sci-Fi Genre!");
            }
            break;
            
            case 5:
            {
                fantasy[fa_ctr][0] = ti;
                fantasy[fa_ctr][1] = desc;
                fantasy[fa_ctr][2] = date;
                fantasy[fa_ctr][3] = "Fantasy";
                fa_ctr++;
                System.out.println("Book Donated In Fantasy Genre!");
            }
            break;   
        }
       
    }
    
    public void search_string(String x, int y)
    {
        switch(y)
        {
            case 1:
            {
                int i = 0;
                boolean z = false;
               for(i = 0; i<10; i++)
               {
                   if(x.equals(fiction[i][0]))
                   {
                        for(int j = 0; j<4; j++)
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
                            z = true;
                        }
                        break;
                   }
               }
               
               if(!z)
                    System.out.println("book not found");
               
            }
            break;
            
            case 2:
            {
                 int i = 0;
                boolean z = false;
               for(i = 0; i<10; i++)
               {
                   if(x.equals(history[i][0]))
                   {
                        for(int j = 0; j<4; j++)
                        {
                            if(j == 0)
                                System.out.print("Name: ");
                            if(j == 1)
                                System.out.print("Description: ");
                            if(j == 2)
                                System.out.print("Date published: ");
                            if(j == 3)
                                System.out.print("Genre: ");
                            System.out.println(history[i][j]);
                            z = true;
                        }
                        break;
                   }
               }
               
               if(!z)
                    System.out.println("book not found");               
            }
            break;
            /*
            case 3:
            {
                
            }
            break;
            
            case 4:
            {
                
            }
            break;
            
            case 5:
            {
                
            }
            break;

            */
        }
        
        
    }
    
    
    
    
    
    
}
