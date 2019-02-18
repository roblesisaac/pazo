public class MyMain {
    
    public int[] createArray(int size)
    {
        int[] array = new int[size];
        Random r = new Random();
        for(int i = 0; i < array.length; i++)
            array[i] = r.nextInt(101);
        
        return array;
    }
    public void printArray(int[] ar)
    {
        for(int i = 0; i < ar.length; i++)
            System.out.println(ar[i]);
    }
    int DivisibleByTen(int[] ar)
    {
        int count = 0;
        for(int i = 0; i < ar.length; i++)
            if(ar[i] % 10 == 0)
                count++;
        
        return count;
        
    }
    public static void main(String[] args) {
        MyMain mm = new MyMain();
        int ar[] = mm.createArray(10);
        mm.printArray(ar);
        int count = mm.DivisibleByTen(ar);
        System.out.println("There are " + count + " numbers evenly divisble by 10");
    }
     
}
