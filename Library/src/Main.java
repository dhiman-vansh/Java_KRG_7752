import java.util.*;

class Main extends Bookstore {
    public static void main(String args[]) {
        Bookstore mylibrary = new Bookstore();
        Arrays.fill(mylibrary.flag, true);
        Arrays.fill(mylibrary.user_rating, 0.0);
        Scanner sc = new Scanner(System.in);
        int customerInput;
        String Name;
        String abook;
        int Rating;
        mylibrary.addBook("The Matrix");
        mylibrary.addBook("Godfather");
        mylibrary.addBook("Wings of Fire");
        mylibrary.addBook("Atomic Habbits");
        mylibrary.addBook("Harry potter");
        mylibrary.addBook("Alchemist");
        mylibrary.addBook("El Durado");
        mylibrary.addBook("Kabira Vani");

        do {
            System.out.println("MAIN MENU");
            System.out.println("=========");
            System.out.println("1. Add book : ");
            System.out.println("2. Check out book : ");
            System.out.println("3. Return book : ");
            System.out.println("4. Receive Rating : ");
            System.out.println("5. List Inventory : ");
            System.out.println("6. Exit : ");
            System.out.println("Enter your choice (1..6) : ");
            customerInput = sc.nextInt();

            switch (customerInput) {
                case 1: {
                    try {

                        System.out.println("Enter the name of the book you want to add...");
                        sc.nextLine();
                        Name = sc.nextLine();
                        mylibrary.addBook(Name);
                        System.out.println(Name + " has been added successfully!!!");
                        break;
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Cannot add more books!\nShelfs are fullll!!!");
                        break;

                    }
                }
                case 2: {
                    System.out.println("Enter the name of the book you want to check out...");
                    sc.nextLine();
                    Name = sc.nextLine();
                    try {

                        mylibrary.checkOut(Name);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    finally{
                        System.out.println("Would you like to add book\nEnter y to confirm\n");
                        abook=sc.next();
                        if(abook.equalsIgnoreCase("y"))
                            mylibrary.addBook(Name);
                    }
                    break;

                }
                case 3: {
                    System.out.println("Enter the name of the book you want to return...");
                    sc.nextLine();
                    Name = sc.nextLine();
                    mylibrary.returnBook(Name);
                    break;

                }
                case 4: {
                    System.out.println("Enter the name of the book whose rating you want to add...");
                    sc.nextLine();
                    Name = sc.nextLine();
                    System.out.println("Enter the rating: ");
                    Rating = sc.nextInt();
                    if (Rating > 10) {
                        Rating = 10;
                    }
                    mylibrary.receiveRating(Name, Rating);
                    break;

                }
                case 5:
                    System.out.println("Available Books are:");
                    mylibrary.listInventory();
                    break;

                default:
                    System.out.println("This is an Invalid Input!");
                    break;

            }
        } while (customerInput != 6);
        sc.close();

    }
}