public class Stock {

    private String name = "Balls";
    private int quantity = 10;

    public void buy(){
        System.out.println("Stock [ Name: "+name +","
                +" quantity" +quantity +":" +"] bought");
    }
    public void sell(){
        System.out.println("Stock [ Name: "+name+ ","
                +"quantity" +quantity +":" +"] sold");
    }
}
