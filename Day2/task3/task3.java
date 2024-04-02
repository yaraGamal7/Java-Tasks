class task3{
  public static void main(String args[]){
    String sentence = "ITI MANSOURA BARNCH YARA JAMAL OPEN SOURCE ITI ";
    String word = "ITI";
    int count=0;
    String[] split_arr = sentence.split(" ");
    for(int i=0;i<split_arr.length;i++){
      System.out.println(split_arr[i]);
      if(split_arr[i].equals("ITI")){
        count++;
      }
    }
    if(count==0){
        System.out.println(" Can`t find the word");  
    }
    else{
      System.out.println("The word you looking for is  \"" + word + "\" occurs " + count + " times.");   
    }
  }
}