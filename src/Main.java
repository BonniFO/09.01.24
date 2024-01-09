public class Main
{
    public static void main(String[] args)
    {
        int[] sort = new int[]{10, 2, 13, 4, 15};

        for (int i = 0; i < sort.length - 1; i++)
        {
            for (int j = 1; j < sort.length; j++)
            {
                if (sort[j + 1] < sort[j])
                {
                    int tmp = sort[i];
                    sort[i] = sort[i + 1];
                    sort[i + 1] = tmp;
                }
            }
        }
    }
    public static void Sort(int[] sort)
    {
        for (int i = 0; i < sort.length; i++)
        {
            int tmp = sort[i];
            sort[i] = sort[i + 1];
            sort[i + 1] = tmp;
        }
    }
    private static void Swap()
    {

    }
}
