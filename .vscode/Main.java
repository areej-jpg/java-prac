import java.util.Scanner;

// Class to handle number editing operations
class NumEdit {
    private int[] a = new int[10]; // Fixed-size array to hold numbers
    private int size;              // Tracks how many numbers are currently stored

    public NumEdit() {
        size = 0; // Initialize size
    }

    // Insert number at the end
    public void insertNum(int num) {
        if (size < a.length) {
            a[size++] = num;
        } else {
            System.out.println("Array is full!");
        }
    }

    // Insert number at the start (shifts elements right)
    public void insertNumStart(int num) {
        if (size < a.length) {
            for (int i = size; i > 0; i--) {
                a[i] = a[i - 1];
            }
            a[0] = num;
            size++;
        } else {
            System.out.println("Array is full!");
        }
    }

    // Insert number at a specific index
    public void insertInBet(int num, int ind) {
        if (ind < 0 || ind > size || size >= a.length) {
            System.out.println("Invalid index or array is full!");
            return;
        }
        for (int i = size; i > ind; i--) {
            a[i] = a[i - 1];
        }
        a[ind] = num;
        size++;
    }

    // Replace all occurrences of rnum with num
    public void searchAndReplaceAll(int rnum, int num) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (a[i] == rnum) {
                a[i] = num;
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Replaced " + count + " occurrences.");
        } else {
            System.out.println("Number not found!");
        }
    }

    // Ask user before replacing first found rnum
    public void searchAndReplaceCh(int rnum, int num, Scanner scanner) {
        for (int i = 0; i < size; i++) {
            if (a[i] == rnum) {
                System.out.print("Do you want to replace? (Press 1 for Yes, 0 for No): ");
                int ch = scanner.nextInt();
                if (ch == 1) {
                    a[i] = num;
                    return;
                }
            }
        }
    }

    // Delete first occurrence of num
    public void deleteOne(int num) {
        for (int i = 0; i < size; i++) {
            if (a[i] == num) {
                for (int j = i; j < size - 1; j++) {
                    a[j] = a[j + 1];
                }
                size--;
                System.out.println("Number deleted.");
                return;
            }
        }
    }

    // Clear the array
    public void deleteAll() {
        size = 0;
        System.out.println("All numbers deleted.");
    }

    // Display all numbers
    public void view() {
        System.out.print("Array elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}

// Main class with menu
public class Main {
    public static void main(String[] args) {
        NumEdit func = new NumEdit();
        Scanner scanner = new Scanner(System.in);
        int opt = -1, num, ind, rnum;

        while (opt != 0) {
            // Show menu first
            System.out.println("1. Insert number in array");
            System.out.println("2. Insert number at start");
            System.out.println("3. Insert number in between");
            System.out.println("4. Search and replace all");
            System.out.println("5. Search and replace by choice");
            System.out.println("6. Delete one number");
            System.out.println("7. Delete all numbers");
            System.out.println("8. View all elements");
            System.out.println("0. Exit programme");

            // ✅ FIXED: Prompt printed correctly now
            System.out.print("Enter option: ");
            opt = scanner.nextInt();

            switch (opt) {
                case 1:
                    System.out.print("Enter number to be inserted: ");
                    num = scanner.nextInt();
                    func.insertNum(num);
                    break;
                case 2:
                    System.out.print("Enter number to be inserted at start: ");
                    num = scanner.nextInt();
                    func.insertNumStart(num);
                    break;
                case 3:
                    System.out.print("Enter number to be inserted: ");
                    num = scanner.nextInt();
                    System.out.print("Enter index at which number is to be inserted: ");
                    ind = scanner.nextInt();
                    func.insertInBet(num, ind);
                    break;
                case 4:
                    System.out.print("Enter number to replace: ");
                    rnum = scanner.nextInt();
                    System.out.print("Enter new number: ");
                    num = scanner.nextInt();
                    func.searchAndReplaceAll(rnum, num);
                    System.out.println("Number has been replaced");
                    break;
                case 5:
                    System.out.print("Enter number to replace: ");
                    rnum = scanner.nextInt();
                    System.out.print("Enter new number: ");
                    num = scanner.nextInt();
                    func.searchAndReplaceCh(rnum, num, scanner);
                    break;
                case 6:
                    System.out.print("Enter number to delete: ");
                    num = scanner.nextInt();
                    func.deleteOne(num);
                    break;
                case 7:
                    func.deleteAll();
                    break;
                case 8:
                    func.view();
                    break;
                case 0:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid option! Try again.");
            }
        }

        scanner.close();
    }
}
