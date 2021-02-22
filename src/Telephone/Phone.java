package Telephone;

import java.util.*;
//2-nd part of homework
public class Phone {
    public String name;
    public ArrayList <String>  numbers;
    public Map <String, ArrayList<String>> book = new HashMap<String,ArrayList<String>>();
    public List<String>number = new ArrayList<>();

    public void addNote(String name, String[] number){
        book.put(name,new ArrayList<String>(Arrays.asList(number)));
      //  Collections.addAll(numbers, number);
      //  book.put(name, numbers);
    }
    public void getNomber(String name ){
        System.out.println(book.get(name));
    }
    public void getBook(){
        for (Map.Entry<String, ArrayList<String>> entry:book.entrySet()){
            System.out.println(entry.getKey()+" tel: "+entry.getValue());

        }
    }
    public static void main(String[] args) {
Phone phoneBook = new Phone();
phoneBook.addNote("Ivanov",new String[] {"800 900 900", "800 600 500"});
phoneBook.addNote("Petrov", new String[]{"800 700 700", "800 500 500"});
phoneBook.addNote("Kirillov", new String[]{"800 400 400", "800 100 100"});
phoneBook.getBook();
phoneBook.getNomber("Ivanov");
    }
}
