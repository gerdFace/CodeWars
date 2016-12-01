//Mumbling
/*This time no story, no theory. The examples below show you how to write
function accum:

Examples:

Accumul.accum("abcd");    // "A-Bb-Ccc-Dddd"
Accumul.accum("RqaEzty"); // "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
Accumul.accum("cwAt");    // "C-Ww-Aaa-Tttt"
The parameter of accum is a string which includes only letters from a..z
and A..Z.*/

public class Accumul {

    private static int count = 0;

    public static String accum(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            result += repeat(s.substring(i, i + 1));
            count++;
        }
        count = 0;
        return result;
    }

    public static String repeat(String s) {
        String temp = "";
        for (int j = 0; j <= count; j++) {
            temp += s;
        }
        if (count == 0) return temp.substring(0, 1).toUpperCase() + temp.substring(1).toLowerCase();
        return "-" + temp.substring(0, 1).toUpperCase() + temp.substring(1).toLowerCase();
    }
}

//Simpler solution using charArray and stringBuilder:
public class Accumul {
    public static String accum(String s) {
        StringBuilder bldr = new StringBuilder();
        int i = 0;
        for(char c : s.toCharArray()) {
            if(i > 0) bldr.append('-');
            bldr.append(Character.toUpperCase(c));
            for(int j = 0; j < i; j++) bldr.append(Character.toLowerCase(c));
            i++;
        }
        return bldr.toString();
    }
}
