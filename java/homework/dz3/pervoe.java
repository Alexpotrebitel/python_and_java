
    import java.util.ArrayList;
    import java.util.Arrays;
    
    class FilterNegative {
        public static int[] filterNegative(int[] a) {
            // Создаем список для хранения неотрицательных чисел
            ArrayList<Integer> result = new ArrayList<>();
    
            // Проходим по каждому элементу массива
            for (int num : a) {
                // Если число неотрицательное, добавляем его в список
                if (num >= 0) {
                    result.add(num);
                }
            }
    
            // Преобразуем список в массив
            int[] filteredArray = new int[result.size()];
            for (int i = 0; i < result.size(); i++) {
                filteredArray[i] = result.get(i);
            }
    
            return filteredArray;
        }
    }
    
    // Этот класс используется для вывода результатов
    public class pervoe {
        public static void main(String[] args) {
            int[] a;
            if (args.length == 0) {
                // Пример массива, если нет аргументов
                a = new int[]{-1, 2, -3, 4, -5, 6};
            } else {
                // Если аргументы переданы, разбиваем строку на элементы массива
                a = Arrays.stream(args[0].split(","))
                          .mapToInt(Integer::parseInt)
                          .toArray();
            }
    
            // Создаем объект FilterNegative и получаем результат
            FilterNegative answer = new FilterNegative();
            String result = Arrays.toString(answer.filterNegative(a));
    
            // Выводим результат
            System.out.println(result);
        }
    }    

