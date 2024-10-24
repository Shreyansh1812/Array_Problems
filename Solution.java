import java.util.*;

class StudentRecord {
    int studentID;
    int score;

    StudentRecord(int studentID, int score) {
        this.studentID = studentID;
        this.score = score;
    }

    @Override
    public String toString() {
        return "(" + studentID + ", " + score + ")";
    }
}

class HashTableChaining {
    private int tableSize;
    private LinkedList<StudentRecord>[] table;

    @SuppressWarnings("unchecked")
    public HashTableChaining(int size) {
        this.tableSize = nextPrime(size);
        table = new LinkedList[tableSize];
        for (int i = 0; i < tableSize; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hashFunction(int key) {
        return key % tableSize;
    }

    public void insertItem(int studentID, int score) {
        int index = hashFunction(studentID);
        table[index].add(new StudentRecord(studentID, score));
    }

    public void deleteItem(int studentID) {
        int index = hashFunction(studentID);
        table[index].removeIf(record -> record.studentID == studentID);
    }

    public void displayHash() {
        for (int i = 0; i < tableSize; i++) {
            System.out.print("table[" + i + "]");
            for (StudentRecord record : table[i]) {
                System.out.print(" --> " + record);
            }
            System.out.println();
        }
    }

    private int nextPrime(int n) {
        while (!isPrime(n)) {
            n++;
        }
        return n;
    }

    private boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

class HashTableLinearProbing {
    private int tableSize;
    private StudentRecord[] table;

    public HashTableLinearProbing(int size) {
        this.tableSize = nextPrime(size);
        table = new StudentRecord[tableSize];
    }

    private int hashFunction(int key) {
        return key % tableSize;
    }

    public void insertItem(int studentID, int score) {
        int index = hashFunction(studentID);
        while (table[index] != null) {
            index = (index + 1) % tableSize;
        }
        table[index] = new StudentRecord(studentID, score);
    }

    public void deleteItem(int studentID) {
        int index = hashFunction(studentID);
        while (table[index] != null && table[index].studentID != studentID) {
            index = (index + 1) % tableSize;
        }
        if (table[index] != null) {
            table[index] = null;
        }
    }

    public void displayHash() {
        for (int i = 0; i < tableSize; i++) {
            System.out.print("table[" + i + "] --> ");
            if (table[i] != null) {
                System.out.println(table[i]);
            } else {
                System.out.println();
            }
        }
    }

    private int nextPrime(int n) {
        while (!isPrime(n)) {
            n++;
        }
        return n;
    }

    private boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

public class Solution {
    public static void main(String[] args) {
        System.out.println("Using Separate Chaining:");
        HashTableChaining htChaining = new HashTableChaining(6);
        htChaining.insertItem(231, 123);
        htChaining.insertItem(326, 432);
        htChaining.insertItem(212, 523);
        htChaining.insertItem(321, 43);
        htChaining.insertItem(433, 423);
        htChaining.insertItem(262, 111);
        htChaining.displayHash();
        
        htChaining.deleteItem(212);
        System.out.println("After deleting record with student ID 212:");
        htChaining.displayHash();

        // Example with linear probing
        System.out.println("\nUsing Linear Probing:");
        HashTableLinearProbing htProbing = new HashTableLinearProbing(6);
        htProbing.insertItem(231, 123);
        htProbing.insertItem(321, 43);
        htProbing.insertItem(212, 523);
        htProbing.insertItem(433, 423);
        htProbing.insertItem(326, 432);
        htProbing.insertItem(262, 111);
        htProbing.displayHash();
        
        htProbing.deleteItem(212);
        System.out.println("After deleting record with student ID 212:");
        htProbing.displayHash();
    }
}
