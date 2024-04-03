import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main3 {
    /*
    Р РµР°Р»РёР·РѕРІР°С‚СЊ РєРѕРЅСЃРѕР»СЊРЅРѕРµ РїСЂРёР»РѕР¶РµРЅРёРµ, РєРѕС‚РѕСЂРѕРµ:
    РџСЂРёРЅРёРјР°РµС‚ РѕС‚ РїРѕР»СЊР·РѕРІР°С‚РµР»СЏ Рё вЂњР·Р°РїРѕРјРёРЅР°РµС‚вЂќ СЃС‚СЂРѕРєРё.
    Р•СЃР»Рё РІРІРµРґРµРЅРѕ print, РІС‹РІРѕРґРёС‚ СЃС‚СЂРѕРєРё С‚Р°Рє, С‡С‚РѕР±С‹ РїРѕСЃР»РµРґРЅСЏСЏ РІРІРµРґРµРЅРЅР°СЏ Р±С‹Р»Р° РїРµСЂРІРѕР№ РІ СЃРїРёСЃРєРµ, Р° РїРµСЂРІР°СЏ - РїРѕСЃР»РµРґРЅРµР№.
    Р•СЃР»Рё РІРІРµРґРµРЅРѕ revert, СѓРґР°Р»СЏРµС‚ РїСЂРµРґС‹РґСѓС‰СѓСЋ РІРІРµРґРµРЅРЅСѓСЋ СЃС‚СЂРѕРєСѓ РёР· РїР°РјСЏС‚Рё.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new LinkedList<>();
        boolean work = true;
        while (work){
            String line = scanner.nextLine();
            switch (line){
                case "print":
                    for (String s: list){
                        System.out.println(s);
                    }
                    break;
                case "revert":
                    list.remove(0);
                    break;
                case "finish":
                    work = false;
                    break;
                default:
                    list.add(0, line);
            }
        }
    }
}


