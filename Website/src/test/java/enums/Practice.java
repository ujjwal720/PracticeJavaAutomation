package enums;

public enum Practice {

    Monday("Tueday"), Tueday("wED");




    public String dayname;


   Practice(String name) {
        this.dayname=name;
    }

    public String diplsyname(){

        return this.name();
    }

    public String dayn(){

       return this.dayname;
    }
}
