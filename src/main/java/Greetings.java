public class Greetings {

    public String greet(Object o) {
        if (o instanceof String) {
            if (o == null) {
                return "Hello my friend";
            } else if (((String) o).toUpperCase() == o) {
                return "HELLO " + o;
            } else {
                return "Hello " + o;
            }
        }
        if (o instanceof String[]) {

            if (((String[]) o).length < 3) {
                String first = ((String[]) o)[0];
                String second = ((String[]) o)[1];
                return "Hello " + first + " and " + second;
            } else {


                String s = "Hello";
                for (int i = 0; i < (((String[]) o).length) - 1; i++) {
                    s += ", " + ((String[]) o)[i];
                }
                return s + " and " + ((String[]) o)[(((String[]) o).length) - 1];
            }
        }
        return "Du er havnet her somehow";
    }
}