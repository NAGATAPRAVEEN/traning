public class weight {
public static void main(String[] args) {
    int weight=30;
    int pn = 1;
    if(weight> 90) {
        pn = 0;
    }
        else if(weight < 30) {
            pn = 1;
        }
        else if(weight>= 45 && weight<= 60){
            pn = 2;
        }
        switch (pn) {
            case 0:
            System.out.println("fat");
            break;
            case 1:
            System.out.println("thin");
            break;
            case 2:
            System.out.println("healthy");
            break;
            default:
            

        }

    }


}
