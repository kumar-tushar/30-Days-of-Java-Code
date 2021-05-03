package video_series_code.Day_8;

import java.util.HashMap;
import java.util.Map;

public class DictionaryPractice {

    public static void main(String[] args) {
        Map<String,String> engSpanDictionary= new HashMap<>();

        engSpanDictionary.put("Monday", "Lunes");
        engSpanDictionary.put("Tuesday", "Martes");
        engSpanDictionary.put("Wednesday", "Miercoles");
        engSpanDictionary.put("Thursday", "Jueves");
        engSpanDictionary.put("Friday", "Viernes");
        engSpanDictionary.put("Saturday", "Sabado");
        engSpanDictionary.put("Sunday", "Domingo");

        System.out.println(engSpanDictionary.get("Monday"));
        System.out.println(engSpanDictionary.get("Tuesday"));
        System.out.println(engSpanDictionary.get("Wednesday"));
        System.out.println(engSpanDictionary.get("Thursday"));
        System.out.println(engSpanDictionary.get("Friday"));
        System.out.println(engSpanDictionary.get("Saturday"));
        System.out.println(engSpanDictionary.get("Sunday"));

        System.out.println(engSpanDictionary.keySet());
        System.out.println(engSpanDictionary.values());
        System.out.println(engSpanDictionary.size());

        System.out.println();
        System.out.println();

        Map<String,Boolean> shoppingList=new HashMap<>();

        shoppingList.put("Ham", true);
        shoppingList.put("Bread", Boolean.TRUE);
        shoppingList.put("Oreo", true);
        shoppingList.put("Eggs", Boolean.FALSE);
        shoppingList.put("Sugar", false);

        System.out.println(shoppingList.get("Ham"));
        System.out.println(shoppingList.get("Sugar"));
        System.out.println(shoppingList);
        System.out.println(shoppingList.remove("Eggs"));
        System.out.println(shoppingList);
    }
}
