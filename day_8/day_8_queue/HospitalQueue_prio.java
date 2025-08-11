//1.	Hospital Emergency Queue:
//o	Create a class Patient with fields: name and severityLevel (int).
//o	Use PriorityQueue<Patient> with a comparator to serve the most critical patients first (highest severityLevel).

package day_8_queue;

import java.util.PriorityQueue;

class Patient {
    String name;
    int severityLevel;

    public Patient(String name, int severityLevel) {
        this.name = name;
        this.severityLevel = severityLevel;
    }

    public String toString() {
        return name + " (Severity: " + severityLevel + ")";
    }
}

public class HospitalQueue_prio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Patient> pq = new PriorityQueue<>(
	            (a, b) -> b.severityLevel - a.severityLevel
	        );

	        pq.add(new Patient("Raniya", 2));
	        pq.add(new Patient("Riya", 5));
	        pq.add(new Patient("giya", 3));

	        while (!pq.isEmpty()) {
	            System.out.println(pq.poll());
	        }
	}

}

//Riya (Severity: 5)
//giya (Severity: 3)
//Raniya (Severity: 2)