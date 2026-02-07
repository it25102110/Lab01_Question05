public class Calculator {
	//Add two integers and return the result
	public int add(int a, int b) {
	return a + b;
	}

	//Multiplies two integers and return the result
	public int multiply(int a, int b) {
	return a * b;
	}


	//Return the square of an integer
	public int square(int n) {
	return n * n;
	}

	public static void main(String[] args) {
			Calculator cal = new Calculator();

	//Expression 01 (3 * 4 + 5 * 7)^2
		int part1 = cal.multiply(3, 4);  // 12
		int part2 = cal.multiply(5, 7);  // 35
		int sum1 = cal.add(part1, part2);  // 47
		int result1 = cal.square(sum1);  // 2209

	//Expression 02 (4 + 7)^2 + (8 + 3)^2
		int a = cal.square(cal.add(4, 7));  // 11^2 = 121
		int b = cal.square(cal.add(8, 3));  // 11^2 = 121
		int result2 = cal.add(a, b);  //242


	System.out.println("The result of expression 01 is  =" + result1);

	System.out.println("The result of expression 02 is  =" + result2);

	}
}
