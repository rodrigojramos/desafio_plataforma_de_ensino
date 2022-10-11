package entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Lesson {

	private String title;
	
	List<Lesson> list = new ArrayList<>();
	
	public Lesson() {
	}

	public Lesson(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public abstract int duration();
}
