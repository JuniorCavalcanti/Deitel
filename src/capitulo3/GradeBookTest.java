package capitulo3;

import java.util.Scanner;

public class GradeBookTest {

	// m�todo main inicia a execu��o de programa
	public static void main(String [] args){
		
		//criar Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner (System.in);
		//cria um objeto GradeBook e o atribui a myGradeBook
		GradeBook myGradeBook =new GradeBook();
		
		//prompt para entrada do nome do curso
		System.out.println("Please enter the course name:");
		String nameOfCourse = input.nextLine();// l� uma linha de texto
		System.out.println();//gera sa�da de uma linha em branco
		
		//chama m�todo displayMessage de myGradeBook
		//e passa nameOfCourse como um argumento
		myGradeBook.displayMessage(nameOfCourse);
		
	}//fim de main
	
}// fim da classe GradeBookTest
