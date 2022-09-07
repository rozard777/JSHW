package lesson1;

public class Homework2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, s, p;
		a = 12;       //сторона равнобедренного треугольника
		p = (a + a + a) * 0.5; //полупериметр 
		s = Math.sqrt(p*(p-a)*(p-a)*(p-a)); //формула Герона
		
		System.out.println(" Площадь треугольника равна " + s);

	}

}
