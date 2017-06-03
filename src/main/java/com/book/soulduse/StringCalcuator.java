package com.book.soulduse;

import static java.lang.Integer.parseInt;

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
}
