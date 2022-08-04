package basis.Question14;

public class CalculateImpl implements Calculate {

	//Calculateインターフェイスのmultiplicationメソッドに(num1*num2)を実装
	public int multiplication(int num1,int num2) {
       return num1 * num2;

	}

	//Calculateインターフェイスのmultiplicationメソッドに(num1*num2/2)を実装
	public int division(int num1 , int num2) {
		return num1 * num2 / 2;
	}
}