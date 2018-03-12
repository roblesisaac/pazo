        Scanner in = new Scanner(System.in); // creates a scanner isntacne
                
        System.out.println("Enter some text.");
        String text = in.nextLine();
        int spaces = 0;
        
        for( int i=0; i < text.length(); i++ ) {
            char c = text.charAt(i);
            if(c == ' ') {
                spaces++;
            }
        }
        System.out.println("Your text has "+ spaces +" spaces in it");
