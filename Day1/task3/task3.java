class Task3 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide a number and a string to print.");
        } else {
            try {
                int count = Integer.parseInt(args[0]);
                String message = args[1];

                if (count <= 0) {
                    System.out.println("We don't accept negative numbers.");
                } else {
                    for (int i = 0; i < count; i++) {
                        System.out.println(message);
                    }
                }

            } catch (NumberFormatException e) {
                System.out.println("Please provide a valid number as the first argument.");
            }
        }
    }
}
