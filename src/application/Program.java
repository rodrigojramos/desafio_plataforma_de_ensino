package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Lesson;
import entities.Task;
import entities.Video;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Lesson> list = new ArrayList<>();
		Lesson lessonvideo = new Video();
		Lesson lessontask = new Task();
		
		System.out.print("Quantas aulas tem o curos? ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Dados da " + i + "a	aula:");
			System.out.print("Conte�do ou tarefa (c/t)? ");
			char ch = sc.next().charAt(0);
			if(ch == 'c') {
				sc.nextLine();
				System.out.print("T�tulo: ");
				String title = sc.nextLine();
				System.out.print("URL do v�deo: ");
				String url = sc.nextLine();
				System.out.print("Dura��o em segundos: ");
				int seconds = sc.nextInt();
				
				lessonvideo = new Video(title, url, seconds);
				
				list.add(lessonvideo);
			} 
			else {
				System.out.print("T�tulo: ");
				String title = sc.nextLine();
				sc.nextLine();
				System.out.print("Descri��o: ");
				String description = sc.nextLine();
				System.out.print("Quantidade de quest�es: ");
				int questionCount = sc.nextInt();
				
				lessontask = new Task(title, description, questionCount);
				
				list.add(lessontask);
			}
		}
		
		
		int resultado = 0;
		
		for (Lesson lesson : list) {
            resultado += lesson.duration();
        }
		
		System.out.println("DURA��O TOTAL DO CURSO = " + resultado + " segundos");
		
		sc.close();
	}
}
