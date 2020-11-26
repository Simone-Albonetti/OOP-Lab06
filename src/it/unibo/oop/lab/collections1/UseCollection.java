package it.unibo.oop.lab.collections1;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Example class using {@link java.util.List} and {@link java.util.Map}.
 * 
 */
public final class UseCollection {
	private static final int ELEMS = 100000;
    private static final int TO_MS = 1000000;
    
    private static final long AFRICA_POP = 1110635000;
    private static final long AMERICAS_POP = 972005000;
    private static final long ANTARCTICA_POP = 0;
    private static final long ASIA_POP = 4298723000L;
    private static final long EUROPE_POP= 742452000;
    private static final long OCEANIA_POP = 38304000;

    private UseCollection() {
    }

    /**
     * @param s
     *            unused
     */
    public static void main(final String... s) {
    	
        /*
         * 1) Create a new ArrayList<Integer>, and populate it with the numbers
         * from 1000 (included) to 2000 (excluded).
         */
    	final List<Integer> list = new ArrayList<>();
    	for (int i = 1000 ; i<2000 ; i++) {
    		list.add(i);
    	}
    	
        /*
         * 2) Create a new LinkedList<Integer> and, in a single line of code
         * without using any looping construct (for, while), populate it with
         * the same contents of the list of point 1.
         */
    	final List<Integer> linkList = new LinkedList<>();
    	linkList.addAll(list);
    	
        /*
         * 3) Using "set" and "get" and "size" methods, swap the first and last
         * element of the first list. You can not use any "magic number".
         * (Suggestion: use a temporary variable)
         */
    	final int temp;
    	temp = list.get(0);
    	list.set(0, list.get(list.size()-1));
    	list.set(list.size()-1, temp);
        /*
         * 4) Using a single for-each, print the contents of the arraylist.
         */
    	for (int i : list) {
    		System.out.println(i);
    	}
        /*
         * 5) Measure the performance of inserting new elements in the head of
         * the collection: measure the time required to add 100.000 elements as
         * first element of the collection for both ArrayList and LinkedList,
         * using the previous lists. In order to measure times, use as example
         * TestPerformance.java.
         */
    	long time = System.nanoTime();
    	
    	for(int j = 0 ; j <=ELEMS ; j++) {
    	list.add(0, j);
    	}
    	
    	time = System.nanoTime() - time;
        System.out.println("Insert " + ELEMS
                + " elem in ArrayList:  " + time
                + "ns (" + time / TO_MS + "ms)");

    	
        time = System.nanoTime();
    	for(int j = 0 ; j <=ELEMS ; j++) {
        	linkList.add(0, j);
        }
    	time = System.nanoTime() - time;
        System.out.println("Insert " + ELEMS
                + " elem in LinkedList " + time
                + "ns (" + time / TO_MS + "ms)");
          	
    	
        /*
         * 6) Measure the performance of reading 1000 times an element whose
         * position is in the middle of the collection for both ArrayList and
         * LinkedList, using the collections of point 5. In order to measure
         * times, use as example TestPerformance.java.
         */
        
        time = System.nanoTime();
    	
    	for(int j = 1 ; j <=1000 ; j++) {
    	list.get(list.size()/2);
    	}
    	
    	time = System.nanoTime() - time;
        System.out.println("Reading the half list's int in ArrayList took " + time
                + "ns (" + time / TO_MS + "ms)");

    	
        time = System.nanoTime();
        
    	for(int j = 1 ; j <=1000 ; j++) {
    	linkList.get(linkList.size()/2);        	
        }
    	
    	time = System.nanoTime() - time;
        System.out.println("Reading the half list's int in LinkedList took" + time
                + "ns (" + time / TO_MS + "ms)");
        
        
        /*
         * 7) Build a new Map that associates to each continent's name its
         * population:
         * 
         * Africa -> 1,110,635,000
         * 
         * Americas -> 972,005,000
         * 
         * Antarctica -> 0
         * 
         * Asia -> 4,298,723,000
         * 
         * Europe -> 742,452,000
         * 
         * Oceania -> 38,304,000
         */
        
        final Map<String, Long> map = new HashMap<>();
        map.put("Africa", AFRICA_POP);
        map.put("Americas", AMERICAS_POP);
        map.put("Antarctica", ANTARCTICA_POP);
        map.put("Asia", ASIA_POP);
        map.put("Europe", EUROPE_POP);
        map.put("Oceania", OCEANIA_POP);
        
        /*
         * 8) Compute the population of the world
         */
        long totalPop= 0;
        for (long l : map.values()) {
        	totalPop+=l;        	
        }
        System.out.println("Total population: " + totalPop);
    }
}
