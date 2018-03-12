
Write a program that will ask the user for a number between 1 and 1000. 
Using a while loop generate the sum and compute the average of random numbers in the range of 1 to 1000 until a 
generated random number matches the number input by the user. Do not include this number as part of your sum. 
Make sure you prime your loop properly.

 Scanner in = new Scanner (System.in);
        Random rnd = new Random();
        
        System.out.println("Pick a number between 1 and 1000");
       
        int answer = in.nextInt();
        int i = 0;
        int sum = 0;
        
        while(i < answer){
            int num = rnd.nextInt(999) + 1;
            sum += num;            
        }
        
        // create int equal to sum divided by i to get average

        // print the average number
        
    }
    
}
