package mephi.Lab1.dop;
//add 1000 str po 4 char 1symbol - stolko byte; collector skolko v resultate pamyati v tom i inom slucae budet izrashodovanno
public class dop {
    public static void main(String[] args) {
        /*char[] str = new char[4];
        str[0]='j';
        str[1]='a';
        str[2]='v';
        str[3]='a';*/
        String str = "java";
        StringBuilder res=new StringBuilder();
        for (int i =0; i<20; i++) //2097152
        {
            res.append(str);
        }
        long usedMemory1 = Runtime.getRuntime().totalMemory()- Runtime.getRuntime().freeMemory();
        for (int i =0; i<20; i++)
        {
            str+=str;
        }
        long usedMemory2 = Runtime.getRuntime().totalMemory()- Runtime.getRuntime().freeMemory() - usedMemory1;
        System.out.println("Builder time");
        System.out.println(usedMemory1);
        System.out.println("Concatenation time");
        System.out.println(usedMemory2);

    }
}
