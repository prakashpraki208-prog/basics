class code6{
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;
            int c = a / b;   // error here
            System.out.println(c);
        }
        catch (Exception e) {
            System.out.println("Error occurred");
        }

        System.out.println("Program ends");
    }
}

    
