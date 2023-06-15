package strings;

public class program2 {
    public static void main(String[] args) {
        String s="software Engineer";
        System.out.println(s.length());

        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        System.out.println(s.startsWith("Soft"));
        System.out.println(s.startsWith("SOFT"));

        System.out.println(s.endsWith("eer"));
        System.out.println(s.endsWith("EER"));

        System.out.println(s.concat("in google"));

        System.out.println(s.charAt(0));
        System.out.println(s.charAt(6));
        System.out.println(s.indexOf('r'));
        System.out.println(s.indexOf('r',7));


        System.out.println();
    }
}
