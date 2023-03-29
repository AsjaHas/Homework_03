import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Homework 03" + "\n");
        System.out.println("Task 01" + "\n");
        // Napravite program kojem mozete pri pokretanju reci koliki niz zelite zatim da popunite niz sa int brojevima.
        // Zatim ispisite sve brojeve po jedan broj po redu (println)
        // na ispisu svih brojeva kod mora ispisati obrnuti  redosljed(ne index) u nizu
        // te da li je broj paran ili ne kao i da li je veci od 10
        Scanner reader = new Scanner(System.in);
        int divisor = 2;
        int biggerThan = 10;
        System.out.println("How many numbers would you like to add to array?");
        int numbersInArray = reader.nextInt();
        int[] userIntArray = new int[numbersInArray];
        for (int i = 0; i < numbersInArray; i++) {
            System.out.println("What is the " + (i + 1) + ". number you would like to add to the array?");
            int index = reader.nextInt();
            userIntArray[i] = index;
        }
        System.out.println("\n");
        for (int i = numbersInArray - 1; i >= 0; i--) {
            System.out.println(userIntArray[i]);
            if (userIntArray[i] % divisor == 0) {
                System.out.print("The number " + userIntArray[i] + " is divisible by " + divisor);
            } else {
                System.out.print("The number " + userIntArray[i] + " is not divisible by " + divisor);
            }
            if (userIntArray[i] > biggerThan) {
                System.out.println(" and is bigger than " + biggerThan);
            } else if (userIntArray[i] < biggerThan) {
                System.out.println(" and is smaller than " + biggerThan);
            } else if (userIntArray[i] == biggerThan) {
                System.out.println(" and is equal to " + biggerThan);
            }

        }
        System.out.println("\n" + "Task 02" + "\n");
        //Napravite program koji moze za niz od 10 brojeva da ispise
        //First number in array: 123
        //Second number in array: 23
        //Third number in array: 3
        //i da se ovakav ispis moze koristiti do 15 elementa u nizu.
        int digitsInArray = 10;
        int[] removeFirstDigitArray = new int[digitsInArray];
        if (digitsInArray <= 15) {
            // We could hardcode the digits in array, but I opted for user input
            for (int i = 0; i < digitsInArray; i++) {
                System.out.println("What is the " + (i + 1) + ". number you would like to add to the array?");
                int index = reader.nextInt();
                removeFirstDigitArray[i] = index;
            }
            for (int i = 0; i < digitsInArray; i++) {
                System.out.print(i + 1 + ". number in array is: ");
                for (int j = i; j < digitsInArray; j++) {
                    System.out.print(removeFirstDigitArray[j]);
                }
                System.out.println(" ");
            }
        }
        System.out.println("\n" + "Task 03" + "\n");
        //Napravite program koji ce obrnuti redosljed niza odnosno:
        //1 2 3 4 5 6 7   postaje 7 6 5 4 3 2 1
        //i da moze primiti bilo koji niz i obrnuti ga.
        System.out.println("How many numbers do you want to have in this array?");
        int reverseArrayLength = reader.nextInt();
        int[] reverseArray = new int[reverseArrayLength];
        for (int i = 0; i < reverseArrayLength; i++) {
            System.out.println("What is the " + (i + 1) + ". number you would like to add to the array?");
            int digitsInReverseArray = reader.nextInt();
            reverseArray[i] = digitsInReverseArray;
        }
        for (int i = reverseArrayLength; i > 0; i--) {
            System.out.print(reverseArray[i - 1]);
        }
        System.out.println("\n" + "\n" + "Task 04" + "\n");
        //Napravite program koji provjerava da li je rijec palindrom  inace mozete koristiti metodu toCharArray() da string pretvorite u niz char-ova
        System.out.println("Type in a word to check if it is a palindrome");
        Scanner reader2 = new Scanner(System.in); //If reader is used first for int it skips the next string input, solution is to add string input that will be skipped or to add a new reader definition
        String wordPalindrome = reader2.nextLine();
        char[] wordPalindromeToCharArray = wordPalindrome.toCharArray();
        char[] reverseWordPalindromeToCharArray = new char[wordPalindromeToCharArray.length];
        boolean wordIsPalindrome = true;
        for (int i = 0; i < wordPalindromeToCharArray.length; i++) {
            reverseWordPalindromeToCharArray[i] = wordPalindromeToCharArray[wordPalindromeToCharArray.length - 1 - i];
        }
        for (int i = 0; i < wordPalindromeToCharArray.length; i++) {
            if (wordPalindromeToCharArray[i] != reverseWordPalindromeToCharArray[i]) {
                wordIsPalindrome = false;
            } else {
                wordIsPalindrome = true;
            }
        }
        if (wordIsPalindrome == true) {
            System.out.println("The word " + wordPalindrome + " is a palindrome.");
        } else {
            System.out.println("The word " + wordPalindrome + " is not a palindrome.");
        }
        System.out.println("\n" + "Task 05" + "\n");
        //Napravite program  kojem cemo reci opseg za koji ce morat ispisati sve parne brojeve u koje ne ulaze brojevi kojima postavljamo opseg
        //npr Please enter lower number in range: 10
        //Please enter larger number in range: 16
        //System-Out: Even numbers for range: 10 to 16 are: 12,14
        System.out.println("Please enter lower bound of range: ");
        int lowerBound = reader.nextInt();
        System.out.println("Please enter upper bound of range: ");
        int upperBound = reader.nextInt();
        if (lowerBound < upperBound) {
            System.out.print("Even numbers between " + lowerBound + " and " + upperBound + " are: ");
            for (int i = lowerBound + 1; i < upperBound; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + ", ");
                }
            }
        } else {
            System.out.print("Error: Lower bound is bigger than upper bound.");
        }
        System.out.println("\n" + "\n" + "Task 06" + "\n");
        //Napravite program koji ce objediniti tri  niza u jedan veliki niz
        int[] firstArray = {1, 2, 3};
        int[] secondArray = {4, 5, 6};
        int[] thirdArray = {7, 8, 9, 10};
        int[] combinedArray = new int[firstArray.length + secondArray.length + thirdArray.length];
        for (int i = 0; i < firstArray.length; i++) {
            combinedArray[i] = firstArray[i];
        }
        for (int i = firstArray.length; i < firstArray.length + secondArray.length; i++) {
            combinedArray[i] = secondArray[i - firstArray.length];
        }
        for (int i = firstArray.length + secondArray.length; i < combinedArray.length; i++) {
            combinedArray[i] = thirdArray[i - firstArray.length - secondArray.length];
        }
        System.out.print("The combined array is: ");
        for (int i = 0; i < combinedArray.length; i++) {
            System.out.print(combinedArray[i]);
        }
        System.out.println("\n" + "\n" + "Task 07" + "\n");
        //Napravite program koji ce sabrati dva niza zajedno, ukoliko je jedan niz veci od drugog
        //taj broj se samo prepise .
        //Npr: {1,3,5,6} , {1,1,1,1,1,1,1}
        //Output: 2,4,6,7,1,1,1
        int[] firstArrayToSum = {1, 2, 3};
        int[] secondArrayToSum = {1, 2, 3, 4, 5};
        if (firstArrayToSum.length > secondArrayToSum.length) {
            int[] sumArray = new int[firstArrayToSum.length];
            for (int i = 0; i < secondArrayToSum.length; i++) {
                sumArray[i] = firstArrayToSum[i] + secondArrayToSum[i];
            }
            for (int i = secondArrayToSum.length; i < sumArray.length; i++) {
                sumArray[i] = firstArrayToSum[i];
            }
            System.out.print("Sum of arrays is: ");
            for (int i = 0; i < sumArray.length; i++) {
                System.out.print(sumArray[i] + " ");
            }
        } else {
            int[] sumArray = new int[secondArrayToSum.length];
            for (int i = 0; i < firstArrayToSum.length; i++) {
                sumArray[i] = firstArrayToSum[i] + secondArrayToSum[i];
            }
            for (int i = firstArrayToSum.length; i < sumArray.length; i++) {
                sumArray[i] = secondArrayToSum[i];
            }
            System.out.print("Sum of arrays is: ");
            for (int i = 0; i < sumArray.length; i++) {
                System.out.print(sumArray[i] + " ");
            }
        }
        System.out.println("\n" + "\n" + "Task 08" + "\n");
        //Napravite program koji niz stringova filtrira i izbacuje iz niza bilo koji string koji sadrzi neki od samoglasnika: a e i o u
        // Obratite paznju da radi i za velika i mala slova mozete koristiti metodu na stringu neku koju nadjete ako vam moze pomoci
        String[] words = {"wolf", "lynx", "bear", "fox", "by"};
        int counter = 0;
        for (int i = 0; i < words.length; i++) {
            boolean wordContainsVowel = false;
            char[] wordsToChars = words[i].toLowerCase().toCharArray();
            for (int j = 0; j < wordsToChars.length; j++) {
                if (wordsToChars[j] != 'a' && wordsToChars[j] != 'e' && wordsToChars[j] != 'i' && wordsToChars[j] != 'o' && wordsToChars[j] != 'u') {
                    // Do nothing because wordContainsVowel starts as false
                } else {
                    wordContainsVowel = true;
                }
            }
            if (wordContainsVowel == false) {
                words[counter] = words[i];
                counter++;
            }
        }
        String[] filteredWords = new String[counter];
        for (int i = 0; i < counter; i++) {
            filteredWords[i] = words[i];
        }
        System.out.println("These are the words from original array that don't contain vowels: ");
        for (int i = 0; i < counter; i++) {
            System.out.println(filteredWords[i]);
        }
        System.out.println("\n" + "\n" + "Task 09" + "\n");
        //Napravite program koji ce izracunati total kada se svaki element iz jednog niza sabere sa svakim elementom iz drugog niza.
        //npr: [1,2,3][1,2,3]
        //Total sabiranja: 36
        int[] firstArraySum = {1, 2, 3};
        int[] secondArraySum = {1, 2, 3};
        int sumOfArrays = 0;
        if (firstArraySum.length == secondArraySum.length) {
            for (int i = 0; i < firstArraySum.length; i++) {
                for (int j = 0; j < secondArraySum.length; j++)
                    sumOfArrays += firstArraySum[i] + secondArraySum[j];
            }
        }
        System.out.println("The sum of two arrays is: " + sumOfArrays);
    }
}