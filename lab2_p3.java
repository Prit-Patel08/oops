public class BuiltInMethods {
    public static void main(String[] args) {

        // System
        int[] a = {10, 20, 30};
        int[] b = new int[3];
        System.arraycopy(a, 0, b, 0, 3);

        System.out.println(System.currentTimeMillis());
        System.gc();

        // Math
        System.out.println(Math.sqrt(25));
        System.out.println(Math.abs(-10));
        System.out.println(Math.min(10, 20));
        System.out.println(Math.max(10, 20));
        System.out.println(Math.round(10.6));

        int random10 = (int)(Math.random() * 11);
        int random100 = (int)(Math.random() * 101);
        System.out.println(random10);
        System.out.println(random100);

        // String
        String s = "Hello Java";
        System.out.println(s.length());
        System.out.println(s.charAt(1));
        System.out.println(s.substring(6));
        System.out.println(s.equals("Hello Java"));
        System.out.println(s.equalsIgnoreCase("hello java"));
        System.out.println(s.compareTo("Hello"));
        System.out.println(s.contains("Java"));
        System.out.println(s.indexOf("Java"));

        // Integer
        int x = Integer.parseInt("100");
        Integer y = Integer.valueOf("200");
        Integer z = Integer.decode("10");

        System.out.println(x);
        System.out.println(y);
        System.out.println(z.intValue());
        System.out.println(z.byteValue());
        System.out.println(z.toString());
    }
}
