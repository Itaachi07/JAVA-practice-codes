public class StringSplit {
    public static void main(String[] args) {
        String str = "Scaler by InterviewBit";
        String [] str2 = str.split(" ",2);
        for (String st : str2) {
            System.out.println(st);
        }
    }
}
