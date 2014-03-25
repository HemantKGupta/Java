public class Test {
	Priority priority;

	public Priority getPriority() {
		return priority;
	}

	public void setPriority(Priority priority) {
		this.priority = priority;
	}

	Test(Priority priority) {
		this.priority = priority;
	}
}

enum Priority {
	HIGH, MEDIUM, LOW
}