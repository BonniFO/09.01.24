public class Main
{
public static void Sort(int[] sort)
{
    for (int i = 0; i < sort.length - 1; i++)
    {
        for(int j = 0; j < sort.length - i - 1; j++)
        {
            if(sort[j + 1] < sort[j])
            {
                int tmp = sort[j];
                sort[j] = sort[j + 1];
                sort[j + 1] = tmp;
            }
        }
    }
}

    public static void main(String args[])
    {
        int[] sort = {12, 16, 4, 1, 9};
        Sort(sort);
        for(int i = 0; i < sort.length; i++)
        {
            System.out.print(sort[i] + "\n");
        }
    }
}