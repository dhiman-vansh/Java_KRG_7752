class Bookstore extends Book implements Lib{


    final String[] Books = new String[10];
    int[] rate = new int[10];
    int i = 0;

    public void addBook(String title) {

        Books[i++] = title;
    }

    public void checkOut(String nm) throws bookNotFound {

        int j, index = 11;
        for (j = 0; j < 5; j++) {
            if (Books[j] == null) {
                break;
            }
            if (Books[j].equalsIgnoreCase(nm)) {
                index = j;
            }
        }
        if (index == 11) {
            throw new bookNotFound();
        } else {
            System.out.println(nm + " has been checked out successfully!!!");
            being_checkedout(index);
        }
    }

    void returnBook(String nm) {
        int j, index = 11;
        for (j = 0; j < 10; j++) {
            if (Books[j] == null) {
                break;
            }
            if (Books[j].equalsIgnoreCase(nm)) {
                index = j;
            }
        }
        if (index == 11) {
            System.out.println("Book not found. Please add the book!!!");
        } else {
            System.out.println(nm + " has been returned successfully!!!");
            being_returned(index);
        }
    }

    void receiveRating(String n, int no) {
        int j, index = 11;
        for (j = 0; j < 10; j++) {
            if (Books[j] == null) {
                break;
            }
            if (Books[j].equalsIgnoreCase(n)) {
                index = j;
            }
        }
        if (index == 11) {
            System.out.println("Book not found. Please add the book!!!");
        } else {
            System.out.println(n + " has been rated successfully!!!");
            rate[index] = no;
            receive_a_rating(index, no);
        }
    }

    void listInventory() {
        int i;

        for (i = 0; i < 10; i++) {
            if (flag[i] && Books[i] != null) {
                System.out.println("Book ID= "+(i + 1) + " " + Books[i] + " " + user_rating[i]);
            }
        }
        System.out.println();

    }
}