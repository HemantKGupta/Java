package collections;

import java.util.*;

public class ConstructorOverloadProblem {

  public static void main(String[] args) {
    NavigableSet<String> base = new TreeSet<String>(Collections.reverseOrder());
    Collections.addAll(base, "b", "a", "c");
    
    NavigableSet<String> sortedSet1 = new TreeSet<String>((Set<String>)base);
    NavigableSet<String> sortedSet2 = new TreeSet<String>(base);
    // and the two sets have different iteration orders:
    List<String> forward = new ArrayList<String>();
    forward.addAll(sortedSet1);
    List<String> backward = new ArrayList<String>();
    backward.addAll(sortedSet2);
    assert !forward.equals(backward);
    Collections.reverse(forward);
    assert forward.equals(backward);
  }
}