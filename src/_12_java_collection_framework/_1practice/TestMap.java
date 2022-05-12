package _12_java_collection_framework._1practice;
import java.util.*;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> hasMap = new HashMap<>();
        hasMap.put("Anh Thiện", 20);
        hasMap.put("Anh Phôn", 10);
        hasMap.put("Anh Phước", 22);
        hasMap.put("Anh Vinh", 29);
        System.out.println("Danh Sách là sinh viên là: ");
        System.out.println(hasMap + "\n");

        Map<String,Integer> treeMap = new TreeMap<>(hasMap);
        System.out.println("TreeMap sắp xếp tăng dần:");
        System.out.println(treeMap + "\n");

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f, true);
        linkedHashMap.put("Anh Thiện", 20);
        linkedHashMap.put("Anh Phôn", 10);
        linkedHashMap.put("Anh Phước", 22);
        System.out.println("Tuổi của " + "Anh Phước " + linkedHashMap.get("Anh Phước") );

    }
}
