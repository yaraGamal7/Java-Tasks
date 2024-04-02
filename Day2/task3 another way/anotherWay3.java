class task3 {
    public static void main(String args[]) {
        String sentence = "iti hi yara jamal open source iti mansoura iti ITI";
        String word = "iti";
        int count = 0;
        int index = sentence.indexOf(word);

        while (index != -1) {
            count++;
            index = sentence.indexOf(word, index + 1);
        }

        System.out.println("The word you looking for is  \"" + word + "\" occurs " + count + " times.");
    }
}