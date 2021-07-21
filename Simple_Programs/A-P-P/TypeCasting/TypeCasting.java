class TypeCasting{

public static void main(String[]args){



short firstNumber = 18,
      secondNumber = 20,//without the (short) the program will give a compilation error as the operation will result in an int datatype and not the short datatype
      thirdNumber = (short)(firstNumber + secondNumber);


System.out.println(thirdNumber);
















}


}
