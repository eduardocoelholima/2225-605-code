package intro.ControlFlow;

class ArgsForCount {
   public static void main(String[] args) {
       for (int i = 0 ; i < args.length ; i = i + 1) {
           System.out.println(args[i]);
       }
   }
}
