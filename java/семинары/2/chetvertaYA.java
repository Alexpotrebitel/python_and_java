//напишите метод который составляет строку состоящую из 100 повторений слова Test
// и метод что запишет в простой текстовый файл обрабатывайте исключения

public class chetvertaYA
{
    public static void main(String[] args)
        {
        String s = "Test";
        int n=5;
        String s1=repeat(s,n);
        System.out.println(s1);
        }
    static String repeat (String s, int n)
        {
        StringBuilder stringBuilder= new StringBuilder();
        for (int i=0; i<n; i++)
            {
            stringBuilder.append(s);
            stringBuilder.append("");   
            }
// return s.repeat(n);
        return stringBuilder.toString();
    }
}