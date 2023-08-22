package SectionTwo;

public class Switch {
    public static void main(String[] args) {
        int day = 3;

        switch (day) {
            case 1,2,3 -> System.out.println("first quarter");
            case 4,5,6 -> System.out.println("Second quarter");
            case 7,8,9 -> System.out.println("Third quarter");
            case 10,11,12 -> System.out.println("Fourth quarter");
        }


        String days = "Monday";
       switch (days) {
        case "Monday": System.out.println("Its 1st day");break;
        case "Tuesday": System.out.println("Its 2nd day");break;
        default:System.out.println("Pick valid day");
            break;
       }

       for(int i=0;i<10;i++){
        
        if(i==4){
            continue;
        }
        if(i == 8){
            break;
        }
        System.out.println(i);
       }



       }

       

}
