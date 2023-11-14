/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package marrion.final_project;

import java.util.Scanner;

/**
 *
 * @author marri
 */
public class Final_project {
    static Scanner input = new Scanner(System.in);
    static book obj = new book();
   
    public static void main(String[] args) {
        int confirm;
       
       
       
        
        
        
        
        do{
        //System.out.println("f = "+obj.f);
        System.out.println("Welcome to Library!");
        System.out.println("1. Add Book");
        System.out.println("2. Borrow Book");
        System.out.println("3. Display all Books");
        System.out.println("4. Exit");
            System.out.println("5. Search Book");
        System.out.print("Choice: ");
        confirm = input.nextInt();
        input.nextLine();
            switch(confirm)
            {
                case 1:
                {
                    
                    String name, desc, date;
                    int genre;
                    
                    int con;
                    System.out.println("Add Book");
                    System.out.print("Name: ");
                    name = input.nextLine();
                    System.out.print("Description: ");
                    desc = input.nextLine();
                    System.out.print("Date: ");
                    date = input.nextLine();
                    System.out.println("Choose genre: ");
                    System.out.println("\t1. Fiction");
                    System.out.println("\t2. History");
                    System.out.println("\t3. Non-Fiction");
                    System.out.println("\t4. Sci-Fi");
                    System.out.println("\t5. Fantasy");
                    System.out.print("\tChoice: ");
                    con = input.nextInt();
                    input.nextLine();
                    genre = con;
                    
                    
                    obj.set_book(name, desc, date, genre);
                    
                       
                }    
                break;

                case 2: 
                {
                    String title;
                    int gen;
                    System.out.println("Choose the Genre of your book: ");
                    System.out.println("1. Fiction");
                    System.out.println("2. History");
                    System.out.println("3. Non-Fiction");
                    System.out.println("4. Sci-Fi");
                    System.out.println("5. Fantasy");
                    System.out.print("Choice: ");
                    gen = input.nextInt();
                    input.nextLine();
                    System.out.print("Enter the name of the book you want to borrow: ");
                    title = input.nextLine();
                    
                }
                break;

                case 3:
                {
                    obj.display_book();
                }
                break;
                
                case 4:
                {
                    System.out.println("Thank you for checking out the library");
                    System.exit(0);
                }
                break;
                
                case 5:
                {
                    String title;
                    int gen;
                    System.out.println("Choose the Genre of your book: ");
                    System.out.println("1. Fiction");
                    System.out.println("2. History");
                    System.out.println("3. Non-Fiction");
                    System.out.println("4. Sci-Fi");
                    System.out.println("5. Fantasy");
                    System.out.print("Choice: ");
                    gen = input.nextInt();
                    input.nextLine();
                    System.out.print("Enter the name of the book you want to borrow: ");
                    title = input.nextLine();
                    obj.search_string(title,gen);
                }
                break;
                
                default:
                {
                    System.out.println("Invalid Input, Please Try Again");
                    System.out.println("");
                }
            }
        }while(confirm != 4);
        //System.out.println("f in final project= "+obj.f);
       
       
       
    }
}
    

