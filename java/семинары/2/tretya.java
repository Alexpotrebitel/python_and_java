//напишите метод который принимает на вход строку (String) и определяет является ли строка палидромом(возвращает Boolean
// значение Палидром слово или фраза которая читается одинаково слева направо и обратно(шалаш)
public class tretya {
  public static void main(String[] args) {
    String text="шалаш";
    System.out.println(isPolindrom(text));
    
  }  
  static boolean isPolindrom(String text)
  {
    text =text.toLowerCase().replace(" ","").replace(",","").replace("-","");
    StringBuilder sb=new StringBuilder();
    for (int i=text.length()-1;i>=0;i--)
    {
        sb.append(text.charAt(i));

    }
    //sb.reverse()
    return text.contentEquals(sb);
  }
}
