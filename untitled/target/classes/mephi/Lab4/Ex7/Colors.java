package mephi.Lab4.Ex7;

public enum Colors {
    BLACK(""),RED ("R)"), BLUE("B") ,GREEN("G"),CYAN("C"),MAGENTA("M"),YELLOW("Y"),WHITE("W"), NOT_DEFINE("N");
    String colorcode;

    Colors(String b) {
        this.colorcode=b;
    }

    public String getColorcode(){
        return this.colorcode;
    }

    public static Colors getColor (String colorcode){
        for (Colors c: Colors.values()){
            if (c.getColorcode() == colorcode)
                return c;
        }
        return NOT_DEFINE;
    }

    public static Colors getGreen (){
        for (Colors c: Colors.values()){
            if (c.getColorcode() == "G")
                return c;
        }
        return NOT_DEFINE;
    }

    public static Colors getRed (){
        for (Colors c: Colors.values()){
            if (c.getColorcode() == "R")
                return c;
        }
        return NOT_DEFINE;
    }

    public static Colors getBlue (){
        for (Colors c: Colors.values()){
            if (c.getColorcode() == "B")
                return c;
        }
        return NOT_DEFINE;
    }
}


