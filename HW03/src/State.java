
public class State {

    public static String Idle = "Idle";
    public static String Moving_up = "moving up";
    public static String Moving_down = "moving down";
    public static String Current_State = "current State";




    public static void elevate(int destination_floor, int current_floor) {
        if (current_floor == destination_floor) {           //Abbruch, wenn am Ziel
            State.Current_State = State.Idle;
            System.out.println(Current_State);
            return;
        }
        while (destination_floor < current_floor) {
            State.Current_State = State.Moving_down;
            System.out.println(Current_State);
            current_floor -= 1;
        }
        while (destination_floor > current_floor) {
            State.Current_State = State.Moving_up;
            System.out.println(Current_State);
            current_floor += 1;
        }
        exit();


    }
public static void exit(){
        State.Current_State = State.Idle;
        System.out.println(Current_State);

}
}

