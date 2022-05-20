import java.lang.reflect.Array;

public class CodingAssignment {

	public static void main(String[] args) {

// Coding Assignment Steps 1a, 1b, and 1c
int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 50}; 
int lastNumber = ages.length-1; 
	System.out.println(ages[lastNumber] - ages[0]);
	double sum = 0; 
	for (int age : ages) {
	sum += age; 
} System.out.println(sum / ages.length);

//Coding Assignment Steps 2a and 2b
String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"}; 
double namesLength = 0.0; 
for (String name : names) {
  namesLength += name.length();  
}double averageLetters = namesLength / names.length; 
System.out.println(averageLetters);
 for (int i = 0; i <= names.length - 1; i++) {
System.out.print(names[i] + " ");
}

 //Coding Assignment Step 3: array.length-1 or array[lastPosition#]
//Coding Assignment Step 4: array[0]

//Coding Assignment Step 5:
 System.out.println(" ");
int lengthOfName = 0; 
for (String name : names) {
} 
int[] nameLengths = new int[names.length]; 
for (int i = 0; i < names.length; i++) {
	nameLengths[i]+=names[i].length(); 
}   
for (int nameLength : nameLengths) {
	System.out.print(nameLength + " ");
}
//Coding Assignment Step 6: 
System.out.println(" ");
int allLetters = 0; 
for(int length : nameLengths) {
	allLetters+=length; 
} System.out.println(allLetters);

//Coding Assignment Step 7:
System.out.println(concatenateWords("Hello", 3)); 

//Coding Assignment Step 8: 
String firstName = "Bill"; 
String lastName = "Jones"; 
System.out.println(createFullName(firstName, lastName));

//Coding Assignment Step 9: 
double[] array = {25.0, 2.1, 4.2, 19.3}; 
System.out.println(compareSumOfNumbers(array));

//Coding Assignment Step 10: 
double[] singleArray = {14.2, 57.9, 24.5}; 
System.out.println(findAverage(singleArray));

//Coding Assignment Step 11: 
double[] first = {10.5, 40.5, 16.75, 5.25}; 
double[] second = {19.0, 38.0, 34.25, 22.50}; 
System.out.println(findGreaterAvg(second, first));

//Coding Assignment Step 12: 
boolean isHotOutside = true; 
double moneyInPocket = 9.75; 
System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
	
//Coding Assignment Step 13: 	
boolean isCodingDone = false; 
double tempOutside = 78.0; 
System.out.print(useFreeTime(isCodingDone, tempOutside));
//Used to make quick decisions about how to use my free time, instead of scrolling on my phone.

	}
//Method Step 13: 
public static String useFreeTime (boolean isCodingDone, double tempOutside) {
	if (isCodingDone == false) {
		return "Do your coding homework!";
	} else if (isCodingDone = true && tempOutside < 65.0) {
		return "Read a book.";
	} else {
		return "Go for a walk!";
	}
}
//& tempOutside >= 65.0)	
//Method Step 12	
public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
	if (isHotOutside == true && moneyInPocket > 10.50) {
		return true; 
	} else {
		return false; 
	}
}
//Method Step 11
public static boolean findGreaterAvg (double[] a, double[] b) {
	double avgA = findAverage(a); 
	double avgB = findAverage(b);  
	if (avgA > avgB) {
		return true; 
	} else {
		return false; 
		}
}
	
//Method Step 10

public static double findAverage (double[] doubles) {
  double total = 0; 
	for (double number : doubles) {
	 total += number; 
	} return total / doubles.length;
	
}

//Method Step 9
public static boolean compareSumOfNumbers (double[] numbers) {
	int sum = 0; 
	for (double number : numbers) {
		sum += number; 
	} if (sum > 100) { 
        	  return true; 
          } else {
        	  return false;
          }
	}

//Method Step 8 	
public static String createFullName (String firstName, String lastName) {
 return firstName + " " + lastName; 
}
//Method Step 7	
public static String concatenateWords(String word, int n) {
	int i = 1; 
	String output = ""; 
	while (i <= n){
	i++; 
	output += word; 
	}
	return output;
	}
}

