package com.book.soulduse.calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Integer.parseInt;
import static java.lang.Integer.remainderUnsigned;

/**
 * Created by developerkhy@gmail.com on 2017. 6. 3.
 * Blog      : http://soulduse.tistory.com
 * Github    : http://github.com/soulduse
 */
public class StringCalcuator {

    public int splitAndHap(String s) {
        String separateTxt = null;

        if(s.startsWith("//")){
            separateTxt = customSplit(s);
            s = s.substring(s.indexOf(separateTxt)+2, s.length());
            System.out.println("sep : "+separateTxt+" / string : "+s);
        }else if(s.equals(" ")){
            return 0;
        }

        String data[] = s.split(":|,|"+separateTxt);
        int hap = 0;
        for(int i=0; i<data.length; i++){
            int num = Integer.parseInt(data[i]);
            if(num < 0){
                throw new RuntimeException();
            }
            hap += num;
        }

        return hap;
    }

    public String customSplit(String s) {
        int idx = s.indexOf("\n");
        return s.substring(2, idx);
    }

    public int add(String text) {
        if(isBlank(text)){
            return 0;
        }

        return sum(toInts(split(text)));
    }

    private int[] toInts(String[] values){
        int[] numbers = new int[values.length];
        for(int i=0; i<values.length; i++){
            numbers[i] = Integer.parseInt(values[i]);
        }
        return numbers;
    }

    private boolean isBlank(String text){
        return text == null || text.isEmpty();
    }

    private String[] split(String text){
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
        if(m.find()){
            String customDelimeter = m.group(1);
            return m.group(2).split(customDelimeter);
        }
        return text.split(",|:");
    }

    private int sum(int[] numbers){
        int sum = 0;
        for(int number : numbers){
            sum += number;
        }
        return sum;
    }
}
