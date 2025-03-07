import java.util.ArrayList;

class FilterStrings {
    public static String[] filterShortStrings(String[] arr) {
        // Создаем ArrayList для хранения строк длиной больше 3 символов
        ArrayList<String> result = new ArrayList<>();

        // Итерируем через массив строк
        for (String s : arr) {
            // Если длина строки больше 3 символов, добавляем в ArrayList
            if (s.length() > 3) {
                result.add(s);
            }
        }

        // Преобразуем ArrayList в массив
        String[] resultArray = new String[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }

        // Возвращаем полученный массив
        return resultArray;
    }

    // Пример использования метода
    public static void main(String[] args) {
        String[] input = {"apple", "bat", "elephant", "cat", "dog", "hi"};
        String[] output = filterShortStrings(input);

        // Выводим результат
        for (String str : output) {
            System.out.println(str);
        }
    }
}