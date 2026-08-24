public class Studentname {
    public static void main(String[] args) {
        String names [] = {"Ajay", "Naresh","Amit","Happy"};
        int count = 0;
        for(String n: names){
            if(n.charAt(0)=='A')
                count++;

        }
        System.out.println("Total student name start with A =" + count);
    }
    
}
