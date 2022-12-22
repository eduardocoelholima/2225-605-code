package intro.ControlFlow;

class ArgsWhile {
   public static void main(String[] args) {
       int i;
       i = 0;
       while (i < args.length) {
           System.out.println(args[i]);
           i = i + 1;
       }
   }
}
