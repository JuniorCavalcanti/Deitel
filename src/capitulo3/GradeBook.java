package capitulo3;

public class GradeBook {
	
	private String courseName;// nome do curso para esse GradeBook
	
	//m�todo para configurar o nome do curso
	//salve
	public void setCourseName(String name){
		courseName = name;// armazena o nome do curso
	}// fim do m�todo setCourseName
	
	//m�todo para recuperar o nome do curso
	public String getCourseName(){
		return courseName;
	}//fim do m�rotodo getCourseName
	
	//exibe uma mensagem  de boas-vindas para o usuário  GrandeBook
	// o curso que essa Gradebook repesenta
	public void displayMessage(String courseName){
		System.out.printf("Welcometo the Grade Book for \n%s!\n", getCourseName());
	}// fim do método displayMessage

}// fim da classe GradeBook
