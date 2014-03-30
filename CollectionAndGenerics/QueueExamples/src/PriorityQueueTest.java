import java.util.Comparator;
import java.util.Queue;
import java.util.PriorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {

		Comparator<Test> priorityComp = new Comparator<Test>() {
			public int compare(Test o1, Test o2) {
				return o1.getPriority().compareTo(o2.getPriority());
			}
		};

		Queue<Test> pq = new PriorityQueue<Test>(10, priorityComp);
		pq.add(new Test(Priority.MEDIUM));
		pq.add(new Test(Priority.HIGH));
		pq.add(new Test(Priority.LOW));

		Test test = pq.poll();
		System.out.println(test.priority);
	}
}