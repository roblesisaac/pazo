    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // creates a scanner isntacne

        Random rnd = new Random(); // creates a random instance

        

        int min = 65;

        int max = 90;

        

        int rNumber = rnd.nextInt((max-min)+1) + min;

        char rChar = (char)(rNumber); 

        

        

        

        System.out.println("Guess the secret uppercase letter");

        String guess = in.nextLine();
        guess = guess.toUpperCase();
        
        System.out.println("You guessed " + guess); 

        do {
             
             System.out.println("Sorry you guessed the wrong letter, the secret letter preceeds the letter you guessed. Guess again.");
             
             
             guess = in.nextLine();
             guess = guess.toUpperCase();

        } while(!guess.equals(rChar));

        

        

      

      

                

               

    }

    

}
