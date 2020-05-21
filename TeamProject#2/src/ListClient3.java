//compiler directive to eliminate superfluous warnings.

public class ListClient3 {
    public static void main(String[] args) {
    	AbstractList<Integer> list1 = new ArrayList<Integer>();
        processList(list1);
        System.out.println("list1_toString"+list1.toString());   
        System.out.println("list1_indexOf"+list1.indexOf(100));
        
        System.out.println("-----------");
        
        AbstractList<Integer> list2 = new LinkedList<Integer>();
        processList(list2);
        List<Integer> testAddAll = new ArrayList<Integer>();
        System.out.println("list2_toString"+list2.toString());
        testAddAll.add(11);
        testAddAll.add(12);
        testAddAll.add(13);
        list2.addAll(testAddAll);
        System.out.println("list2_toString"+list2.toString());
        System.out.println("list2_indexOf"+list2.indexOf(93));
        
        for (int eachNum:list2) {
        	System.out.println(eachNum);
        }
    }

    public static void processList(List<Integer> list) {
        list.add(42);
        list.add(18);
        list.add(27);
        list.add(93);
        System.out.println(list);
        list.remove(2);
        list.remove(0);
        System.out.println(list);
    }
}
