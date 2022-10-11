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
			System.out.print("Conteúdo ou tarefa (c/t)? ");
			char ch = sc.next().charAt(0);
			if(ch == 'c') {
				sc.nextLine();
				System.out.print("Título: ");
				String title = sc.nextLine();
				System.out.print("URL do vídeo: ");
				String url = sc.nextLine();
				System.out.print("Duração em segundos: ");
				int seconds = sc.nextInt();
				
				lessonvideo = new Video(title, url, seconds);
				
				list.add(lessonvideo);
			} 
			else {
				System.out.print("Título: ");
				String title = sc.nextLine();
				sc.nextLine();
				System.out.print("Descrição: ");
				String description = sc.nextLine();
				System.out.print("Quantidade de questões: ");
				int questionCount = sc.nextInt();
				
				lessontask = new Task(title, description, questionCount);
				
				list.add(lessontask);
			}
		}
		
		
		int resultado = 0;
		
		for (Lesson lesson : list) {
            resultado += lesson.duration();
        }
		
		System.out.println("DURAÇÃO TOTAL DO CURSO = " + resultado + " segundos");
		
		sc.close();
	}
}
