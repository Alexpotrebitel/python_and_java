import java.util.ArrayList; 
import java.util.Arrays; 
class UniqueElements { 
public static int[] getUniqueElements(int[] a) { 
ArrayList<Integer> result = new ArrayList<>(); 
for (int num : a) { 
if (!result.contains(num)) { 
result.add(num); 
} 
} 
// Преобразуем ArrayList в массив 
int[] resultArray = new int[result.size()]; 
for (int i = 0; i < result.size(); i++) { 
resultArray[i] = result.get(i); 
} 
return resultArray; 
} 
} 
// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки 
public class vtoroe { 
public static void main(String[] args) { 
int[] a; 
if (args.length == 0) { 
// При отправке кода на Выполнение, вы можете варьировать эти параметры 
a = new int[]{1, 2, 2, 3, 4, 4, 5}; 
} else { 
a = Arrays.stream(args[0].split(",")).mapToInt(Integer::parseInt).toArray(); 
} 
UniqueElements answer = new UniqueElements();
}
}


