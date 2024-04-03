
import java.util.*;

public class Main4 {
    /*
    1) РќР°РїРёСЃР°С‚СЊ РјРµС‚РѕРґ, РєРѕС‚РѕСЂС‹Р№ РїСЂРёРЅРёРјР°РµС‚ РјР°СЃСЃРёРІ СЌР»РµРјРµРЅС‚РѕРІ,
    РїРѕРјРµС‰Р°РµС‚ РёС… РІ СЃС‚СЌРє Рё РІС‹РІРѕРґРёС‚ РЅР° РєРѕРЅСЃРѕР»СЊ СЃРѕРґРµСЂР¶РёРјРѕРµ СЃС‚СЌРєР°.
    2) РќР°РїРёСЃР°С‚СЊ РјРµС‚РѕРґ, РєРѕС‚РѕСЂС‹Р№ РїСЂРёРЅРёРјР°РµС‚ РјР°СЃСЃРёРІ СЌР»РµРјРµРЅС‚РѕРІ,
    РїРѕРјРµС‰Р°РµС‚ РёС… РІ РѕС‡РµСЂРµРґСЊ Рё РІС‹РІРѕРґРёС‚ РЅР° РєРѕРЅСЃРѕР»СЊ СЃРѕРґРµСЂР¶РёРјРѕРµ РѕС‡РµСЂРµРґРё.
     */
    public static void main(String[] args) {
        String[] arr = {"1", "2", "3", "4"};
//        printStack(arr);
        printQueue(arr);
    }

    private static void printQueue(String[] arr) {
        Queue<String> queue = new LinkedList<>();
        queue.addAll(Arrays.asList(arr));
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }

    static void printStack(String[] arr){
        Stack<String> stack = new Stack<>();
        stack.addAll(Arrays.asList(arr));
//        System.out.println(stack);
//        for (String s: stack){
//            System.out.println(s);
//        }
        while (!stack.empty()){
            System.out.println(stack.pop());
        }
    }
}