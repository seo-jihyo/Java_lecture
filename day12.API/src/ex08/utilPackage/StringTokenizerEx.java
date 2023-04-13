package ex08.utilPackage;

import java.util.StringTokenizer;

public class StringTokenizerEx {
   public static void main(String[] args) {
      StringTokenizer token =
            new StringTokenizer("사과=10|초코렛=3|샴페인=1","=|",true);
            //new StringTokenizer("박 노 전 김");
      while(token.hasMoreTokens()) {
         String str = token.nextToken();
         if(str.equals("=")) System.out.print("\t");
         else if (str.equals("|")) System.out.print("\n");
         else System.out.println(str);
      }
   }
}


/*
package ex08.utilPackage;

import java.util.StringTokenizer;

public class StringTokenizerEx {
   public static void main(String[] args) {
      StringTokenizer token = new StringTokenizer("박/노/전/김","/");
            //new StringTokenizer("박 노 전 김");
      while(token.hasMoreTokens()) {
         System.out.println(token.nextToken());
      }
   }
}
//*/