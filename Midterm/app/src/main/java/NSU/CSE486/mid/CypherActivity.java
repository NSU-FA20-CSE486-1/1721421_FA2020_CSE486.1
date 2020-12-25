package NSU.CSE486.mid;

public class CypherActivity {

    public String encode(String text, int secret) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z') {
                char ch = (char)(((int)text.charAt(i) + secret - 65) % 26 + 65);
                result.append(ch);
            } else if(text.charAt(i) >= 'a' && text.charAt(i) <= 'z'){
                char ch = (char)(((int)text.charAt(i) +
                        secret - 97) % 26 + 97);
                result.append(ch);
            } else {
                result.append(text.charAt(i));
            }
        }

        return result.toString();
    }

    public String decode(String message) {
        String[] tokens = message.split(" ", 2);


        int secret = tokens[0].hashCode() % 26;
        String cypher = tokens[1];

        return encode(cypher, 26-secret);
    }



}
