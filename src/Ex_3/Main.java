package Ex_3;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        Pattern vocals = Pattern.compile("(?iu)[аоуыэяёюие]");
        ArrayList<MyPair> words= new ArrayList<>();
        Comparator<MyPair> comparator = new Comparator<MyPair>() {
            @Override
            public int compare(MyPair o1, MyPair o2) {
                return -o1.key().compareTo(o2.key());
            }
        };
        for (String i: s.split(" ")){
            Matcher m = vocals.matcher(i);
            String str = i;
            int vocalCounter = 0;
            if (m.find()){
                vocalCounter++;
                str = i.substring(0, m.start()) + Character.toUpperCase(i.charAt(m.start())) + i.substring(m.start() + 1);
            }
            while (m.find()) {
                vocalCounter++;
            }
            words.add(new MyPair(vocalCounter, str));
        }
        Collections.sort(words, comparator);
        System.out.println(words);
    }
}
