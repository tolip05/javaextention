public class JavaSplit1 {
    public static void main(String[] args) {
        String line = "https://softuni.bg/trainings/resources/video/18097/video-stream-rec-25-september-2017";
        String []url = line.split("://");
        String protokol = url[0];
        int index = url[1].indexOf("/");
        String server = url[1].substring(0,index);
        String res = url[1].substring(index + 1,url[1].length());
        System.out.println(protokol);
        System.out.println(server);
        System.out.println(res);
    }
}
