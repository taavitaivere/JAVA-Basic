package Week5;

public class ex87 {
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public ex87(int rooms, int squareMeters, int pricePerSquareMeter){
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    public boolean larger(ex87 twoRoomsBrooklyn){
        if (twoRoomsBrooklyn.squareMeters < this.squareMeters){
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        ex87  studioManhattan = new ex87(1, 16,
                5500);
        ex87 twoRoomsBrooklyn = new ex87(2,38,
                4200);
        ex87 fourAndKitchenBronx = new ex87(3, 78,
                2500);

        System.out.println(studioManhattan.larger(twoRoomsBrooklyn));
        System.out.println( fourAndKitchenBronx.larger(twoRoomsBrooklyn) );
    }
}
