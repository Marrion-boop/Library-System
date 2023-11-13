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
       
       
       
       
        System.out.println("Welcome to Library!");
        System.out.println("1. Add Book");
        System.out.println("2. Borrow Book");
        System.out.println("3. Display all Books");
        confirm = input.nextInt();
        input.nextLine();
        
        
        switch(confirm)
        {
            case 1:
                String name, desc, date, genre;
                int con;
                System.out.println("Add Book");
                System.out.print("Name: ");
                name = input.nextLine();
                System.out.print("Description: ");
                desc = input.nextLine();
                System.out.print("Date: ");
                date = input.nextLine();
                System.out.println("Choose genre: ");
                System.out.println("1. Fiction");
                System.out.println("2. History");
                System.out.println("3. Non-Fiction");
                System.out.println("4. Sci-Fi");
                System.out.println("5. Fantasy");
                System.out.print("Choice: ");
                con = input.nextInt();
                input.nextLine();
                
                genre = "Fiction";
                
                obj.set_book(name, desc, date, genre);
        }
      
       obj.display_book();
       
       
    }
}
    

