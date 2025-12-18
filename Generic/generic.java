package Generic;

//example of generic
class Example<t> {
   t s;

   Example(t var1) {
      this.s = var1;
   }

   public void getter() {
      System.out.println(this.s);
   }

   public Object getter2() {
      return s;
   }
}

public class generic {
   public static void main(String[] args) {
      Example<Integer> example = new Example<>(2021);
      example.getter();
      Example<String> example2 = new Example<>("hello");
      System.out.println(example2.s.getClass().getName());// gives output[java.lang.String]

   }
}
