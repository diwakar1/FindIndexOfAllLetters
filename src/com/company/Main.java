package com.company;
//it finds out the indexes of all characters in a given String.
public class Main {

    public static void main(String[] args) {
	 /* String string = "Messi and Ronaldo are both good players";
       string.toLowerCase();
       char[] letters= new char[26];
       for(int i = 0;i<letters.length;i++){
           letters[i]= (char)('a'+i);
       }
        System.out.println(Arrays.toString(letters));

        for(int i= 0;i<letters.length;i++){
            for(int j=0;j<string.length();j++){
                if(letters[i]==string.charAt(j))
                System.out.println(letters[i]+" is in index "+(j));
            }
        }
*/
        String str = "Messi and Ronaldo are both good players.";
        for(char i = 'a';i<'z';i++){
            if(i=='l'||i=='w')
                System.out.println();

            System.out.print(i+ " index "+str.indexOf(i)+"\t");
        }
    }
}
