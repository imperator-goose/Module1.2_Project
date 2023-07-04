import java.util.*;
public class Main {
    public static Collection getCommonElements(List<Integer> collection1,List<Integer> collection2){
        Collection<Integer> commonElements = new ArrayList<>();
        HashSet<Integer> tempSet = new HashSet<>(collection1);
        for (int elements : collection2){
            if(tempSet.contains(elements)){
                commonElements.add(elements);
            }
        }
        List<Integer> sortedCommonElements = new ArrayList<>(commonElements);
        Collections.sort(sortedCommonElements);
        return sortedCommonElements;
    }
    public static void main(String[] args) {
        List<Integer> collection1 = Arrays.asList(1,-1,3);
        List<Integer> collection2 = Arrays.asList(1,4,3,-1);
        Collection<Integer> CommonElements = new ArrayList<>(getCommonElements(collection1,collection2));
        System.out.println("Общие элементы:");
        for (int element : CommonElements){
            System.out.println(element);
        }
    }
}
