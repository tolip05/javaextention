public class SubString2 {
    public static void main(String[] args) {
        String line = "We are living in a <upcase>yellow submarine</upcase>. We don't have <upcase>anything</upcase> else.";

        StringBuilder sb = new StringBuilder();

        int index = 0;
        int open = "<upcase>".length();
        int close = "</upcase>".length();

        while (index <= line.length()){
            line = line.substring(index,line.length());

            int curentIndexOpen = line.indexOf("<upcase>");
            if (curentIndexOpen > 0){
                String beforeIndexTag = line.substring(0,curentIndexOpen);
                sb.append(beforeIndexTag);
                int curentIndexClose = line.indexOf("</upcase>");
                String textForChange = line.substring(curentIndexOpen + open,curentIndexClose);
                String upperCase = textForChange.toUpperCase();
                sb.append(upperCase);
                index = curentIndexClose + close;
            }else{
                sb.append(line.substring(0,line.length()));
            }
        }
        System.out.println(sb.toString());
    }
}
