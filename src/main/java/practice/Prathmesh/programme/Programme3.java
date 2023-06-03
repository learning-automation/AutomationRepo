package practice.Prathmesh.programme;

//String sort as per AlphaBates
public class Programme3 {
    public static void main(String[] args) {
        String name = "prathmesh";
        char name1[] = name.toCharArray();
        System.out.println("\nString before sorted\n"+ name);
        System.out.println("String after sorting");
        for (int i=0;i<name.length();i++)
        {
            for (int j=i+1;j<name.length();j++)
            {
                if (name1[i]>name1[j]) {
                    char name3 = name1[i];
                    name1[i] = name1[j];
                    name1[j] = name3;
                }
            }
            System.out.print(name1[i]);
        }
    }
}
